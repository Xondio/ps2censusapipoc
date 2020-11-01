
package de.sjs.dw.ps2.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OutfitListMembersAllFields {

    private List<Outfit_List> outfitList = null;
    private Integer returned;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Outfit_List> getOutfitList() {
        return outfitList;
    }

    public void setOutfitList(List<Outfit_List> outfitList) {
        this.outfitList = outfitList;
    }

    public Integer getReturned() {
        return returned;
    }

    public void setReturned(Integer returned) {
        this.returned = returned;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
