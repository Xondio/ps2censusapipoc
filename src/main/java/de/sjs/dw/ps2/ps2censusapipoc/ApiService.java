package de.sjs.dw.ps2.ps2censusapipoc;

import de.sjs.dw.ps2.api.OutfitListMembersAllFields;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
    @Autowired
    RestTemplate restTemplate;

    public OutfitListMembersAllFields retriveOutfitListMembersAllFields(String url){

        OutfitListMembersAllFields object = restTemplate.getForObject(url, OutfitListMembersAllFields.class);

        return object;


    }
}
