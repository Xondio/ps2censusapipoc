
package de.sjs.dw.ps2.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "creation",
    "creation_date",
    "last_save",
    "last_save_date",
    "last_login",
    "last_login_date",
    "login_count",
    "minutes_played"
})
public class Times {

    @JsonProperty("creation")
    private String creation;
    @JsonProperty("creation_date")
    private String creationDate;
    @JsonProperty("last_save")
    private String lastSave;
    @JsonProperty("last_save_date")
    private String lastSaveDate;
    @JsonProperty("last_login")
    private String lastLogin;
    @JsonProperty("last_login_date")
    private String lastLoginDate;
    @JsonProperty("login_count")
    private String loginCount;
    @JsonProperty("minutes_played")
    private String minutesPlayed;

    @JsonProperty("creation")
    public String getCreation() {
        return creation;
    }

    @JsonProperty("creation")
    public void setCreation(String creation) {
        this.creation = creation;
    }

    @JsonProperty("creation_date")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creation_date")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("last_save")
    public String getLastSave() {
        return lastSave;
    }

    @JsonProperty("last_save")
    public void setLastSave(String lastSave) {
        this.lastSave = lastSave;
    }

    @JsonProperty("last_save_date")
    public String getLastSaveDate() {
        return lastSaveDate;
    }

    @JsonProperty("last_save_date")
    public void setLastSaveDate(String lastSaveDate) {
        this.lastSaveDate = lastSaveDate;
    }

    @JsonProperty("last_login")
    public String getLastLogin() {
        return lastLogin;
    }

    @JsonProperty("last_login")
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    @JsonProperty("last_login_date")
    public String getLastLoginDate() {
        return lastLoginDate;
    }

    @JsonProperty("last_login_date")
    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @JsonProperty("login_count")
    public String getLoginCount() {
        return loginCount;
    }

    @JsonProperty("login_count")
    public void setLoginCount(String loginCount) {
        this.loginCount = loginCount;
    }

    @JsonProperty("minutes_played")
    public String getMinutesPlayed() {
        return minutesPlayed;
    }

    @JsonProperty("minutes_played")
    public void setMinutesPlayed(String minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

}
