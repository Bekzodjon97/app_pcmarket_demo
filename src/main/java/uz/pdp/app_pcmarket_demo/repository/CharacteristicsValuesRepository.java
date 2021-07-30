package uz.pdp.app_pcmarket_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.app_pcmarket_demo.entity.Basket;
import uz.pdp.app_pcmarket_demo.entity.CharacteristicsValues;

@RepositoryRestResource(path = "characteristicsValues")
public interface CharacteristicsValuesRepository extends JpaRepository<CharacteristicsValues, Integer> {
}
