
package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.SuperList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperListRepository extends CrudRepository<SuperList, Long> {
}
