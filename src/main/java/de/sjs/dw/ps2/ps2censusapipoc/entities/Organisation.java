package de.sjs.dw.ps2.ps2censusapipoc.entities;

import javax.persistence.Entity;
import java.util.List;

//@Entity
public class Organisation {

    private String name;
    private String alias;

    private DwMember founder;
    private List<DwMember> leaders;
    private List<PlayerCharacter> organisationMembers;



}
