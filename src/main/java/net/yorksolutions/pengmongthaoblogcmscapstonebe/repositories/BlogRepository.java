package net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {
}
