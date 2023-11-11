package spring.boot.optic.okulist.repository;

import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.optic.okulist.model.ContactLenses;

@Repository
public interface ContactLensesRepository extends JpaRepository<ContactLenses, Long> {
    List<ContactLenses> findAll(Specification<ContactLenses> specification);

    List<ContactLenses> findByNameAndIsDeletedFalse(String name);

}
