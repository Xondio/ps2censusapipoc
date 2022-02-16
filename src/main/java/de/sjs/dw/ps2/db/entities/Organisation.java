package de.sjs.dw.ps2.db.entities;

import java.util.List;

//@Entity
public class Organisation {

    private String name;
    private String alias;

    private DwMemberDpo founder;
    private List<DwMemberDpo> leaders;
    private List<PlayerCharacter> organisationMembers;



}
