package net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Chat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends CrudRepository<Chat, Long> {
    Iterable<Chat> findAllByPerson1OrPerson2(String person1, String person2);
}
