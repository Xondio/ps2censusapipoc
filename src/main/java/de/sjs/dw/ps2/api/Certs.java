
package de.sjs.dw.ps2.api;

import java.util.HashMap;
import java.util.Map;

public class Certs {

    private String earnedPoints;
    private String giftedPoints;
    private String spentPoints;
    private String availablePoints;
    private String percentToNext;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(String earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public String getGiftedPoints() {
        return giftedPoints;
    }

    public void setGiftedPoints(String giftedPoints) {
        this.giftedPoints = giftedPoints;
    }

    public String getSpentPoints() {
        return spentPoints;
    }

    public void setSpentPoints(String spentPoints) {
        this.spentPoints = spentPoints;
    }

    public String getAvailablePoints() {
        return availablePoints;
    }

    public void setAvailablePoints(String availablePoints) {
        this.availablePoints = availablePoints;
    }

    public String getPercentToNext() {
        return percentToNext;
    }

    public void setPercentToNext(String percentToNext) {
        this.percentToNext = percentToNext;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
