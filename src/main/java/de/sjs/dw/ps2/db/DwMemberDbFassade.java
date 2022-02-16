package de.sjs.dw.ps2.db;

import de.sjs.dw.ps2.db.entities.DwMemberDpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DwMemberDbFassade {

    @Autowired
    private DwMemberRepository dwMemberRepository;

    public DwMemberDpo saveOneDwMember(DwMemberDpo member){

        return dwMemberRepository.save(member);
    }

    public Iterable<DwMemberDpo> saveAllDwMembers(Iterable<DwMemberDpo> dwMembers){

        return dwMemberRepository.saveAll(dwMembers);
    }


}
