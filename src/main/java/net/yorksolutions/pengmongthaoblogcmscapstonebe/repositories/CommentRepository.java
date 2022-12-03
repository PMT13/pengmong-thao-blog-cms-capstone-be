package net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment,Long> {
}
