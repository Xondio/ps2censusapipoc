package de.sjs.dw.ps2.db;

import de.sjs.dw.ps2.db.entities.DwMemberDpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Optional<DwMemberDpo> findById(Long id){

        return dwMemberRepository.findById(id);
    }

}
