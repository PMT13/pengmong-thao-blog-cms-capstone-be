package net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
}
