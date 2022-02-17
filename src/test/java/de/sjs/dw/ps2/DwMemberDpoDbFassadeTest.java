package de.sjs.dw.ps2;

import de.sjs.dw.ps2.db.DwMemberDbFassade;
import de.sjs.dw.ps2.db.DwMemberRepository;
import de.sjs.dw.ps2.db.entities.DwMemberDpo;
import de.sjs.dw.ps2.db.entities.PlayerCharacter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DwMemberDpoDbFassadeTest {

    @Autowired
    DwMemberDbFassade dwMemberDbFassade;

//    @Autowired
//    DwMemberRepository dwMemberRepository;

    @DisplayName("Can one Member be saved in DB (H2)")
    @Test
    void saveOneDwMember() {
        // Arrange
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

        // Act
        DwMemberDpo returnDwMemberDpo = dwMemberDbFassade.saveOneDwMember(dwMemberDpo1);


        // Assert
        assertNotNull(returnDwMemberDpo);
        assertNotNull(returnDwMemberDpo.getId());
        System.out.println(returnDwMemberDpo.getId());
        assertTrue(returnDwMemberDpo.getId() > 0L);
        Optional<DwMemberDpo> dwMemberById = dwMemberDbFassade.findById(returnDwMemberDpo.getId());
        assertTrue(dwMemberById.isPresent());
        assertEquals(dwMemberById.get().getForumsName(), dwMemberDpo1.getForumsName());


    }
}