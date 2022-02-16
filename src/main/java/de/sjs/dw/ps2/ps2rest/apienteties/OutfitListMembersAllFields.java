
package de.sjs.dw.ps2.ps2rest.apienteties;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "outfit_list",
    "returned"
})
public class OutfitListMembersAllFields {

    @JsonProperty("outfit_list")
    private List<OutfitList> outfitList = null;
    @JsonProperty("returned")
    private Integer returned;

    @JsonProperty("outfit_list")
    public List<OutfitList> getOutfitList() {
        return outfitList;
    }

    @JsonProperty("outfit_list")
    public void setOutfitList(List<OutfitList> outfitList) {
        this.outfitList = outfitList;
    }

    @JsonProperty("returned")
    public Integer getReturned() {
        return returned;
    }

    @JsonProperty("returned")
    public void setReturned(Integer returned) {
        this.returned = returned;
    }

}
