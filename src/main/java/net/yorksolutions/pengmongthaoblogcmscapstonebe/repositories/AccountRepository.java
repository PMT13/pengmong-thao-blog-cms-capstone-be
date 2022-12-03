package net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
}
