package de.sjs.dw.ps2.ps2censusapipoc;

import de.sjs.dw.ps2.ps2censusapipoc.entities.DwMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DwMemberService {

    @Autowired
    private DwMemberRepository dwMemberRepository;

    public DwMember saveOneDwMember(DwMember member){

        return dwMemberRepository.save(member);
    }

    public Iterable<DwMember> saveAllDwMembers(Iterable<DwMember> dwMembers){

        return dwMemberRepository.saveAll(dwMembers);
    }


}
