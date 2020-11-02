package de.sjs.dw.ps2.ps2censusapipoc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.sjs.dw.ps2.api.Member;
import de.sjs.dw.ps2.api.OutfitList;
import de.sjs.dw.ps2.api.OutfitListMembersAllFields;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;
import java.util.List;
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
        OutfitListMembersAllFields result = apiService.retriveOutfitListMembersAllFields("DRUCKWELLE");
        assertNotNull(result);
        assertNotNull(result.getOutfitList());
        assertNotNull(result.getOutfitList());
        OutfitList outfitList = result.getOutfitList().get(0);
        assertNotNull(outfitList);
        List<Member> members = outfitList.getMembers();
        assertNotNull(members);
        assertFalse(members.isEmpty());
        assertEquals(members.size(),Integer.parseInt(outfitList.getMemberCount()));
    }
}