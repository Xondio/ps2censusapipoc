package de.sjs.dw.ps2.ps2censusapipoc.entities;

import javax.persistence.Entity;
import java.util.List;

//@Entity
public class Game {

    private String name;
    private String fullName;
    private String alias;

    private String dwTeamClubUrl;
    private String gameOrganisationPageUrl;

    private List<Organisation> organisations;
    private List<PlayerCharacter> playerCharacters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDwTeamClubUrl() {
        return dwTeamClubUrl;
    }

    public void setDwTeamClubUrl(String dwTeamClubUrl) {
        this.dwTeamClubUrl = dwTeamClubUrl;
    }

    public String getGameOrganisationPageUrl() {
        return gameOrganisationPageUrl;
    }

    public void setGameOrganisationPageUrl(String gameOrganisationPageUrl) {
        this.gameOrganisationPageUrl = gameOrganisationPageUrl;
    }

    public List<Organisation> getOrganisations() {
        return organisations;
    }

    public void setOrganisations(List<Organisation> organisations) {
        this.organisations = organisations;
    }

    public List<PlayerCharacter> getPlayerCharacters() {
        return playerCharacters;
    }

    public void setPlayerCharacters(List<PlayerCharacter> playerCharacters) {
        this.playerCharacters = playerCharacters;
    }
}
