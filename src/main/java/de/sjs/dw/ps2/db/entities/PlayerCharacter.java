package de.sjs.dw.ps2.db.entities;


import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String alias;

    private String level;
    private String faction;

    private String serverHome;

    private Date created;
    private Date lastLogin;

    @ManyToOne
    private DwMemberDpo dwMemberDpo;

//    public PlayerCharacter() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getAlias() {
//        return alias;
//    }
//
//    public void setAlias(String alias) {
//        this.alias = alias;
//    }
//
//    public String getLevel() {
//        return level;
//    }
//
//    public void setLevel(String level) {
//        this.level = level;
//    }
//
//    public String getFaction() {
//        return faction;
//    }
//
//    public void setFaction(String faction) {
//        this.faction = faction;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getServerHome() {
//        return serverHome;
//    }
//
//    public void setServerHome(String serverHome) {
//        this.serverHome = serverHome;
//    }
//
//    public Date getCreated() {
//        return created;
//    }
//
//    public void setCreated(Date created) {
//        this.created = created;
//    }
//
//    public Date getLastLogin() {
//        return lastLogin;
//    }
//
//    public void setLastLogin(Date lastLogin) {
//        this.lastLogin = lastLogin;
//    }
}
