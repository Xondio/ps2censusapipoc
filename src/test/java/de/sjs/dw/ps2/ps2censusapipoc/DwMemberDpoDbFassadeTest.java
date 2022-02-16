package de.sjs.dw.ps2.ps2censusapipoc;

import de.sjs.dw.ps2.db.DwMemberDbFassade;
import de.sjs.dw.ps2.db.entities.DwMemberDpo;
import de.sjs.dw.ps2.db.entities.PlayerCharacter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DwMemberDpoDbFassadeTest {

    @Autowired
    DwMemberDbFassade dwMemberDbFassade;


    @Test
    void saveOneDwMember() {
        DwMemberDpo dwMemberDpo1 = new DwMemberDpo();

        dwMemberDpo1.setForumsId("testid");
        dwMemberDpo1.setForumsName("testname");
        dwMemberDpo1.setForumsProfilPageUrl("http://testurl.example");

        PlayerCharacter pc1 = new PlayerCharacter();
        pc1.setName("3punkt1415");
        pc1.setFaction("VS");
        pc1.setServerHome("Miller");

        PlayerCharacter pc2 = new PlayerCharacter();
        pc2.setName("3punkt141592");
        pc2.setFaction("TR");
        pc2.setServerHome("Miller");

        dwMemberDpo1.getPlayerCharacters().add(pc1);
        dwMemberDpo1.getPlayerCharacters().add(pc2);


        DwMemberDpo returnDwMemberDpo = dwMemberDbFassade.saveOneDwMember(dwMemberDpo1);



        assertNotNull(returnDwMemberDpo);
        assertNotNull(returnDwMemberDpo.getId());
        System.out.println(returnDwMemberDpo.getId());
        assertTrue(returnDwMemberDpo.getId() > 0L);


    }
}