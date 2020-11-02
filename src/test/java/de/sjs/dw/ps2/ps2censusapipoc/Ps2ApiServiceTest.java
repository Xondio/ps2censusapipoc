package de.sjs.dw.ps2.ps2censusapipoc;

import de.sjs.dw.ps2.apienteties.Member;
import de.sjs.dw.ps2.apienteties.OutfitList;
import de.sjs.dw.ps2.apienteties.OutfitListMembersAllFields;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
}