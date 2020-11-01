package de.sjs.dw.ps2.ps2censusapipoc;

public class Outfit {
    private String outfit_id;
    private String name;
    private String name_lower;
    private String time_created;
    private String time_created_date;
    private String lead_character_id;
    private String member_count;


    public String getOutfit_id() {
        return outfit_id;
    }

    public void setOutfit_id(String outfit_id) {
        this.outfit_id = outfit_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_lower() {
        return name_lower;
    }

    public void setName_lower(String name_lower) {
        this.name_lower = name_lower;
    }

    public String getTime_created() {
        return time_created;
    }

    public void setTime_created(String time_created) {
        this.time_created = time_created;
    }

    public String getTime_created_date() {
        return time_created_date;
    }

    public void setTime_created_date(String time_created_date) {
        this.time_created_date = time_created_date;
    }

    public String getLead_character_id() {
        return lead_character_id;
    }

    public void setLead_character_id(String lead_character_id) {
        this.lead_character_id = lead_character_id;
    }

    public String getMember_count() {
        return member_count;
    }

    public void setMember_count(String member_count) {
        this.member_count = member_count;
    }
}
