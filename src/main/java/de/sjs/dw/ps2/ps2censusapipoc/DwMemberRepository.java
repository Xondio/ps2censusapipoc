package de.sjs.dw.ps2.ps2censusapipoc;

import de.sjs.dw.ps2.ps2censusapipoc.entities.DwMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DwMemberRepository extends CrudRepository<DwMember, Long> {


}
