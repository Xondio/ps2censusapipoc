
package de.sjs.dw.ps2.api;

import java.util.HashMap;
import java.util.Map;

public class DailyRibbon {

    private String count;
    private String time;
    private String date;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
