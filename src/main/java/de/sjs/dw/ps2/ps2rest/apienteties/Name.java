
package de.sjs.dw.ps2.ps2rest.apienteties;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "first",
    "first_lower"
})
public class Name {

    @JsonProperty("first")
    private String first;
    @JsonProperty("first_lower")
    private String firstLower;

    @JsonProperty("first")
    public String getFirst() {
        return first;
    }

    @JsonProperty("first")
    public void setFirst(String first) {
        this.first = first;
    }

    @JsonProperty("first_lower")
    public String getFirstLower() {
        return firstLower;
    }

    @JsonProperty("first_lower")
    public void setFirstLower(String firstLower) {
        this.firstLower = firstLower;
    }

}
