package ml.sadriev.repository;

import ml.sadriev.model.Energy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnergyRepository extends JpaRepository<Energy, Long> {
}
