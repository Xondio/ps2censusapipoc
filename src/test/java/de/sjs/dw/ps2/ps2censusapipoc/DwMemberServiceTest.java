package de.sjs.dw.ps2.ps2censusapipoc;

import de.sjs.dw.ps2.ps2censusapipoc.entities.DwMember;
import de.sjs.dw.ps2.ps2censusapipoc.entities.PlayerCharacter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DwMemberServiceTest {

    @Autowired
    DwMemberService dwMemberService;


    @Test
    void saveOneDwMember() {
        DwMember dwMember1 = new DwMember();

        dwMember1.setForumsId("testid");
        dwMember1.setForumsName("testname");
        dwMember1.setForumsProfilPageUrl("http://testurl.example");

        PlayerCharacter pc1 = new PlayerCharacter();
        pc1.setName("3punkt1415");
        pc1.setFaction("VS");
        pc1.setServerHome("Miller");

        PlayerCharacter pc2 = new PlayerCharacter();
        pc2.setName("3punkt141592");
        pc2.setFaction("TR");
        pc2.setServerHome("Miller");

        dwMember1.getPlayerCharacters().add(pc1);
        dwMember1.getPlayerCharacters().add(pc2);


        DwMember returnDwMember = dwMemberService.saveOneDwMember(dwMember1);



        assertNotNull(returnDwMember);
        assertNotNull(returnDwMember.getId());
        System.out.println(returnDwMember.getId());
        assertTrue(returnDwMember.getId() > 0L);


    }
}