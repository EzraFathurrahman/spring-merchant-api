package ezra.restfulpsql.repository;

import ezra.restfulpsql.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant,Long> {
}
