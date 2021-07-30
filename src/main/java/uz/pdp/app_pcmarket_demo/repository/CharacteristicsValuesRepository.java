package uz.pdp.app_pcmarket_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.app_pcmarket_demo.entity.Basket;
import uz.pdp.app_pcmarket_demo.entity.CharacteristicsValues;
import uz.pdp.app_pcmarket_demo.projection.CustomCharacteristicsValues;

@RepositoryRestResource(path = "characteristicsValues",excerptProjection = CustomCharacteristicsValues.class)
public interface CharacteristicsValuesRepository extends JpaRepository<CharacteristicsValues, Integer> {
}
