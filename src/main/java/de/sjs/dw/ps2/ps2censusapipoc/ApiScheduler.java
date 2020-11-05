package de.sjs.dw.ps2.ps2censusapipoc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ApiScheduler {

    private static final Logger log = LoggerFactory.getLogger(ApiScheduler.class);

    private Integer counter = 1;

    @Scheduled(fixedRate = 1000)
    public void scheduleMemberData(){
        System.out.println("Scheduler ! " + counter);
        counter++;
    }
}
