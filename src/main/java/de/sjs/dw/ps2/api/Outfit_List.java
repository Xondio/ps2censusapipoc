
package de.sjs.dw.ps2.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Outfit_List {

    private String outfitId;
    private String name;
    private String nameLower;
    private String alias;
    private String aliasLower;
    private String timeCreated;
    private String timeCreatedDate;
    private String leaderCharacterId;
    private String memberCount;
    private List<Member> members = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getOutfitId() {
        return outfitId;
    }

    public void setOutfitId(String outfitId) {
        this.outfitId = outfitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLower() {
        return nameLower;
    }

    public void setNameLower(String nameLower) {
        this.nameLower = nameLower;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAliasLower() {
        return aliasLower;
    }

    public void setAliasLower(String aliasLower) {
        this.aliasLower = aliasLower;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getTimeCreatedDate() {
        return timeCreatedDate;
    }

    public void setTimeCreatedDate(String timeCreatedDate) {
        this.timeCreatedDate = timeCreatedDate;
    }

    public String getLeaderCharacterId() {
        return leaderCharacterId;
    }

    public void setLeaderCharacterId(String leaderCharacterId) {
        this.leaderCharacterId = leaderCharacterId;
    }

    public String getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(String memberCount) {
        this.memberCount = memberCount;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
