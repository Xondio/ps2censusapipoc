
package de.sjs.dw.ps2.ps2rest.apienteties;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "character_id",
    "member_since",
    "member_since_date",
    "rank",
    "rank_ordinal",
    "character_id_merged",
    "name",
    "faction_id",
    "head_id",
    "title_id",
    "times",
    "certs",
    "battle_rank",
    "profile_id",
    "daily_ribbon",
    "prestige_level"
})
public class Member {

    @JsonProperty("character_id")
    private String characterId;
    @JsonProperty("member_since")
    private String memberSince;
    @JsonProperty("member_since_date")
    private String memberSinceDate;
    @JsonProperty("rank")
    private String rank;
    @JsonProperty("rank_ordinal")
    private String rankOrdinal;
    @JsonProperty("character_id_merged")
    private String characterIdMerged;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("faction_id")
    private String factionId;
    @JsonProperty("head_id")
    private String headId;
    @JsonProperty("title_id")
    private String titleId;
    @JsonProperty("times")
    private Times times;
    @JsonProperty("certs")
    private Certs certs;
    @JsonProperty("battle_rank")
    private BattleRank battleRank;
    @JsonProperty("profile_id")
    private String profileId;
    @JsonProperty("daily_ribbon")
    private DailyRibbon dailyRibbon;
    @JsonProperty("prestige_level")
    private String prestigeLevel;

    @JsonProperty("character_id")
    public String getCharacterId() {
        return characterId;
    }

    @JsonProperty("character_id")
    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    @JsonProperty("member_since")
    public String getMemberSince() {
        return memberSince;
    }

    @JsonProperty("member_since")
    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

    @JsonProperty("member_since_date")
    public String getMemberSinceDate() {
        return memberSinceDate;
    }

    @JsonProperty("member_since_date")
    public void setMemberSinceDate(String memberSinceDate) {
        this.memberSinceDate = memberSinceDate;
    }

    @JsonProperty("rank")
    public String getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(String rank) {
        this.rank = rank;
    }

    @JsonProperty("rank_ordinal")
    public String getRankOrdinal() {
        return rankOrdinal;
    }

    @JsonProperty("rank_ordinal")
    public void setRankOrdinal(String rankOrdinal) {
        this.rankOrdinal = rankOrdinal;
    }

    @JsonProperty("character_id_merged")
    public String getCharacterIdMerged() {
        return characterIdMerged;
    }

    @JsonProperty("character_id_merged")
    public void setCharacterIdMerged(String characterIdMerged) {
        this.characterIdMerged = characterIdMerged;
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("faction_id")
    public String getFactionId() {
        return factionId;
    }

    @JsonProperty("faction_id")
    public void setFactionId(String factionId) {
        this.factionId = factionId;
    }

    @JsonProperty("head_id")
    public String getHeadId() {
        return headId;
    }

    @JsonProperty("head_id")
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    @JsonProperty("title_id")
    public String getTitleId() {
        return titleId;
    }

    @JsonProperty("title_id")
    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    @JsonProperty("times")
    public Times getTimes() {
        return times;
    }

    @JsonProperty("times")
    public void setTimes(Times times) {
        this.times = times;
    }

    @JsonProperty("certs")
    public Certs getCerts() {
        return certs;
    }

    @JsonProperty("certs")
    public void setCerts(Certs certs) {
        this.certs = certs;
    }

    @JsonProperty("battle_rank")
    public BattleRank getBattleRank() {
        return battleRank;
    }

    @JsonProperty("battle_rank")
    public void setBattleRank(BattleRank battleRank) {
        this.battleRank = battleRank;
    }

    @JsonProperty("profile_id")
    public String getProfileId() {
        return profileId;
    }

    @JsonProperty("profile_id")
    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @JsonProperty("daily_ribbon")
    public DailyRibbon getDailyRibbon() {
        return dailyRibbon;
    }

    @JsonProperty("daily_ribbon")
    public void setDailyRibbon(DailyRibbon dailyRibbon) {
        this.dailyRibbon = dailyRibbon;
    }

    @JsonProperty("prestige_level")
    public String getPrestigeLevel() {
        return prestigeLevel;
    }

    @JsonProperty("prestige_level")
    public void setPrestigeLevel(String prestigeLevel) {
        this.prestigeLevel = prestigeLevel;
    }

}
