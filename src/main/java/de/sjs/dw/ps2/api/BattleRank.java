
package de.sjs.dw.ps2.api;

import java.util.HashMap;
import java.util.Map;

public class BattleRank {

    private String percentToNext;
    private String value;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPercentToNext() {
        return percentToNext;
    }

    public void setPercentToNext(String percentToNext) {
        this.percentToNext = percentToNext;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
