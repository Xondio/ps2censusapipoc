
package de.sjs.dw.ps2.ps2rest.apienteties;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "percent_to_next",
    "value"
})
public class BattleRank {

    @JsonProperty("percent_to_next")
    private String percentToNext;
    @JsonProperty("value")
    private String value;

    @JsonProperty("percent_to_next")
    public String getPercentToNext() {
        return percentToNext;
    }

    @JsonProperty("percent_to_next")
    public void setPercentToNext(String percentToNext) {
        this.percentToNext = percentToNext;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

}
