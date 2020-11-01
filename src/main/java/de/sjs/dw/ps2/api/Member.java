
package de.sjs.dw.ps2.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {

    private String characterId;
    private String memberSince;
    private String memberSinceDate;
    private String rank;
    private String rankOrdinal;
    private String characterIdMerged;
    private Name name;
    private String factionId;
    private String headId;
    private String titleId;
    private Times times;
    private Certs certs;
    private BattleRank battleRank;
    private String profileId;
    private DailyRibbon dailyRibbon;
    private String prestigeLevel;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

    public String getMemberSinceDate() {
        return memberSinceDate;
    }

    public void setMemberSinceDate(String memberSinceDate) {
        this.memberSinceDate = memberSinceDate;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRankOrdinal() {
        return rankOrdinal;
    }

    public void setRankOrdinal(String rankOrdinal) {
        this.rankOrdinal = rankOrdinal;
    }

    public String getCharacterIdMerged() {
        return characterIdMerged;
    }

    public void setCharacterIdMerged(String characterIdMerged) {
        this.characterIdMerged = characterIdMerged;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getFactionId() {
        return factionId;
    }

    public void setFactionId(String factionId) {
        this.factionId = factionId;
    }

    public String getHeadId() {
        return headId;
    }

    public void setHeadId(String headId) {
        this.headId = headId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public Times getTimes() {
        return times;
    }

    public void setTimes(Times times) {
        this.times = times;
    }

    public Certs getCerts() {
        return certs;
    }

    public void setCerts(Certs certs) {
        this.certs = certs;
    }

    public BattleRank getBattleRank() {
        return battleRank;
    }

    public void setBattleRank(BattleRank battleRank) {
        this.battleRank = battleRank;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public DailyRibbon getDailyRibbon() {
        return dailyRibbon;
    }

    public void setDailyRibbon(DailyRibbon dailyRibbon) {
        this.dailyRibbon = dailyRibbon;
    }

    public String getPrestigeLevel() {
        return prestigeLevel;
    }

    public void setPrestigeLevel(String prestigeLevel) {
        this.prestigeLevel = prestigeLevel;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
