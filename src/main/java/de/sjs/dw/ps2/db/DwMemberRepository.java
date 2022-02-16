package de.sjs.dw.ps2.db;

import de.sjs.dw.ps2.db.entities.DwMemberDpo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DwMemberRepository extends CrudRepository<DwMemberDpo, Long> {


}
