package ml.sadriev.repository;

import ml.sadriev.model.Gas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GasRepository extends JpaRepository<Gas, Long> {
}
