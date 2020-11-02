package de.sjs.dw.ps2.ps2censusapipoc;

import de.sjs.dw.ps2.api.OutfitListMembersAllFields;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Map;

@Service
public class ApiService {
    @Autowired
    RestTemplate restTemplate;

    public OutfitListMembersAllFields retriveOutfitListMembersAllFields(String outfitName){
        String url = "https://census.daybreakgames.com/get/ps2:v2/outfit/?name={outfitName}&c:resolve=member_character";

        Map<String, String> vars = Collections.singletonMap("outfitName", outfitName);

        return restTemplate.getForObject(url, OutfitListMembersAllFields.class, vars);
    }
}
