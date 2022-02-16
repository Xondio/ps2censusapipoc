
package de.sjs.dw.ps2.ps2rest.apienteties;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "outfit_id",
    "name",
    "name_lower",
    "alias",
    "alias_lower",
    "time_created",
    "time_created_date",
    "leader_character_id",
    "member_count",
    "members"
})
public class OutfitList {

    @JsonProperty("outfit_id")
    private String outfitId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name_lower")
    private String nameLower;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("alias_lower")
    private String aliasLower;
    @JsonProperty("time_created")
    private String timeCreated;
    @JsonProperty("time_created_date")
    private String timeCreatedDate;
    @JsonProperty("leader_character_id")
    private String leaderCharacterId;
    @JsonProperty("member_count")
    private String memberCount;
    @JsonProperty("members")
    private List<Member> members = null;

    @JsonProperty("outfit_id")
    public String getOutfitId() {
        return outfitId;
    }

    @JsonProperty("outfit_id")
    public void setOutfitId(String outfitId) {
        this.outfitId = outfitId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("name_lower")
    public String getNameLower() {
        return nameLower;
    }

    @JsonProperty("name_lower")
    public void setNameLower(String nameLower) {
        this.nameLower = nameLower;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @JsonProperty("alias_lower")
    public String getAliasLower() {
        return aliasLower;
    }

    @JsonProperty("alias_lower")
    public void setAliasLower(String aliasLower) {
        this.aliasLower = aliasLower;
    }

    @JsonProperty("time_created")
    public String getTimeCreated() {
        return timeCreated;
    }

    @JsonProperty("time_created")
    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    @JsonProperty("time_created_date")
    public String getTimeCreatedDate() {
        return timeCreatedDate;
    }

    @JsonProperty("time_created_date")
    public void setTimeCreatedDate(String timeCreatedDate) {
        this.timeCreatedDate = timeCreatedDate;
    }

    @JsonProperty("leader_character_id")
    public String getLeaderCharacterId() {
        return leaderCharacterId;
    }

    @JsonProperty("leader_character_id")
    public void setLeaderCharacterId(String leaderCharacterId) {
        this.leaderCharacterId = leaderCharacterId;
    }

    @JsonProperty("member_count")
    public String getMemberCount() {
        return memberCount;
    }

    @JsonProperty("member_count")
    public void setMemberCount(String memberCount) {
        this.memberCount = memberCount;
    }

    @JsonProperty("members")
    public List<Member> getMembers() {
        return members;
    }

    @JsonProperty("members")
    public void setMembers(List<Member> members) {
        this.members = members;
    }

}
