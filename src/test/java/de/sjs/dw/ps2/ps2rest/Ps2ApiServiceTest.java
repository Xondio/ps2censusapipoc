package de.sjs.dw.ps2.ps2rest;

import de.sjs.dw.ps2.ps2rest.apienteties.Member;
import de.sjs.dw.ps2.ps2rest.apienteties.OutfitList;
import de.sjs.dw.ps2.ps2rest.apienteties.OutfitListMembersAllFields;
import org.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Ps2ApiServiceTest {

    @Autowired
    Ps2ApiService ps2ApiService;

    @Autowired
    RestTemplate restTemplate;

    @Test
    void test01(){
        String url = "https://census.daybreakgames.com/get/ps2:v2/outfit/?name=DRUCKWELLE&c:resolve=member_character";
        OutfitListMembersAllFields result = ps2ApiService.receiveOutfitListMembersAllFields("DRUCKWELLE");

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

    @Test
    void psApiTest(){
        String urlParameter = "https://census.daybreakgames.com/get/ps2:v2/outfit/?name={outfitName}&c:resolve=member_character";
        Map<String, String> vars = Collections.singletonMap("outfitName", "DRUCKWELLE");
//        restTemplate.
        JSONArray jsonArray = restTemplate.getForObject(urlParameter, JSONArray.class, vars);
    }
}