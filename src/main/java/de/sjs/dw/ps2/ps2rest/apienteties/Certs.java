
package de.sjs.dw.ps2.ps2rest.apienteties;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "earned_points",
    "gifted_points",
    "spent_points",
    "available_points",
    "percent_to_next"
})
public class Certs {

    @JsonProperty("earned_points")
    private String earnedPoints;
    @JsonProperty("gifted_points")
    private String giftedPoints;
    @JsonProperty("spent_points")
    private String spentPoints;
    @JsonProperty("available_points")
    private String availablePoints;
    @JsonProperty("percent_to_next")
    private String percentToNext;

    @JsonProperty("earned_points")
    public String getEarnedPoints() {
        return earnedPoints;
    }

    @JsonProperty("earned_points")
    public void setEarnedPoints(String earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    @JsonProperty("gifted_points")
    public String getGiftedPoints() {
        return giftedPoints;
    }

    @JsonProperty("gifted_points")
    public void setGiftedPoints(String giftedPoints) {
        this.giftedPoints = giftedPoints;
    }

    @JsonProperty("spent_points")
    public String getSpentPoints() {
        return spentPoints;
    }

    @JsonProperty("spent_points")
    public void setSpentPoints(String spentPoints) {
        this.spentPoints = spentPoints;
    }

    @JsonProperty("available_points")
    public String getAvailablePoints() {
        return availablePoints;
    }

    @JsonProperty("available_points")
    public void setAvailablePoints(String availablePoints) {
        this.availablePoints = availablePoints;
    }

    @JsonProperty("percent_to_next")
    public String getPercentToNext() {
        return percentToNext;
    }

    @JsonProperty("percent_to_next")
    public void setPercentToNext(String percentToNext) {
        this.percentToNext = percentToNext;
    }

}
