package de.sjs.dw.ps2.ps2rest;

import de.sjs.dw.ps2.ps2rest.apienteties.OutfitListMembersAllFields;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Map;

@Service
public class Ps2ApiService {

    String urlParameter = "https://census.daybreakgames.com/get/ps2:v2/outfit/?name={outfitName}&c:resolve=member_character";

    @Autowired
    RestTemplate restTemplate;

    public OutfitListMembersAllFields receiveOutfitListMembersAllFields(String outfitName){
        Map<String, String> vars = Collections.singletonMap("outfitName", outfitName);

        return restTemplate.getForObject(urlParameter, OutfitListMembersAllFields.class, vars);
    }
}
