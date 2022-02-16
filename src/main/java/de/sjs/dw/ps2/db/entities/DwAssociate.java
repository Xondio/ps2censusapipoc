package de.sjs.dw.ps2.db.entities;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class DwAssociate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String allianzOutfitName;
    List<PlayerCharacter> playerCharacters;

}
