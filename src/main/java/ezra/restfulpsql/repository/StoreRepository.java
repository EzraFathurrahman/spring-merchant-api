package ezra.restfulpsql.repository;

import ezra.restfulpsql.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store,Long> {
}
