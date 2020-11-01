package de.sjs.dw.ps2.ps2censusapipoc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.sjs.dw.ps2.api.OutfitListMembersAllFields;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiServiceTest {
    @Autowired
    ApiService apiService;

    @Autowired
    RestTemplate restTemplate;

    @Test
    void test01(){
        String url = "https://census.daybreakgames.com/get/ps2:v2/outfit/?name=DRUCKWELLE&c:resolve=member_character";
        OutfitListMembersAllFields result = apiService.retriveOutfitListMembersAllFields(url);
        assertNotNull(result);
        assertNotNull(result.getOutfitList());
        System.out.println(result.toString());
       // assertNotNull(result.getOutfitList());
       // assertNotNull(result.getOutfitList().get(0));
    }

    @Test
    void test02() throws JsonProcessingException {
        String url = "https://census.daybreakgames.com/get/ps2:v2/outfit/?name=DRUCKWELLE&c:resolve=member_character";
        URI uri = URI.create(url);
        OutfitListMembersAllFields object = restTemplate.getForObject(uri, OutfitListMembersAllFields.class);
        Map<String, String> vars = Collections.singletonMap("name", "DRUCKWELLE");
        String url1= "https://census.daybreakgames.com/get/ps2:v2/outfit/?name={name}&c:resolve=member_character";
        OutfitListMembersAllFields object1 = restTemplate.getForObject(url, OutfitListMembersAllFields.class,vars);
        Map<String, Object> additionalProperties = object.getAdditionalProperties();
        for (String s : additionalProperties.keySet()) {
            System.out.println(additionalProperties.get(s));
        }
        ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
        String resultBody = result.getBody();
        System.out.println(resultBody);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(result.getBody());
        //JsonNode name = root.path("name");
        System.out.println(root.toPrettyString());
        assertNotNull(object1);
        assertNotNull(object1.getOutfitList());
        assertNotNull(object.getOutfitList().get(0));

    }
}