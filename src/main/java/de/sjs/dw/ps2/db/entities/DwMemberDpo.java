package de.sjs.dw.ps2.db.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class DwMemberDpo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String forumsName;
    private String forumsId;
    private String forumsProfilPageUrl;
    private Date memberSince;

    @OneToMany(cascade = CascadeType.ALL)
    public List<PlayerCharacter> playerCharacters;

    public DwMemberDpo() {
        playerCharacters = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForumsName() {
        return forumsName;
    }

    public void setForumsName(String forumsName) {
        this.forumsName = forumsName;
    }

    public String getForumsId() {
        return forumsId;
    }

    public void setForumsId(String forumsId) {
        this.forumsId = forumsId;
    }

    public String getForumsProfilPageUrl() {
        return forumsProfilPageUrl;
    }

    public void setForumsProfilPageUrl(String forumsProfilPageUrl) {
        this.forumsProfilPageUrl = forumsProfilPageUrl;
    }

    public Date getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    public List<PlayerCharacter> getPlayerCharacters() {
        return playerCharacters;
    }

    public void setPlayerCharacters(List<PlayerCharacter> playerCharacters) {
        this.playerCharacters = playerCharacters;
    }
    // TeamMember
    // ClubMember
    // Rank


}
