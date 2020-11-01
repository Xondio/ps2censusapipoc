
package de.sjs.dw.ps2.api;

import java.util.HashMap;
import java.util.Map;

public class Name {

    private String first;
    private String firstLower;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getFirstLower() {
        return firstLower;
    }

    public void setFirstLower(String firstLower) {
        this.firstLower = firstLower;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
