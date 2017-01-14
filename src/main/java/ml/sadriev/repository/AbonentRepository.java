package ml.sadriev.repository;

import ml.sadriev.model.Abonent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AbonentRepository extends JpaRepository<Abonent, Long> {
    @Query("SELECT b FROM Abonent b WHERE b.name = :name")
    Abonent findByName(@Param("name") String name);
}
