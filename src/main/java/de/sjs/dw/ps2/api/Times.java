
package de.sjs.dw.ps2.api;

import java.util.HashMap;
import java.util.Map;

public class Times {

    private String creation;
    private String creationDate;
    private String lastSave;
    private String lastSaveDate;
    private String lastLogin;
    private String lastLoginDate;
    private String loginCount;
    private String minutesPlayed;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCreation() {
        return creation;
    }

    public void setCreation(String creation) {
        this.creation = creation;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastSave() {
        return lastSave;
    }

    public void setLastSave(String lastSave) {
        this.lastSave = lastSave;
    }

    public String getLastSaveDate() {
        return lastSaveDate;
    }

    public void setLastSaveDate(String lastSaveDate) {
        this.lastSaveDate = lastSaveDate;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(String loginCount) {
        this.loginCount = loginCount;
    }

    public String getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(String minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
