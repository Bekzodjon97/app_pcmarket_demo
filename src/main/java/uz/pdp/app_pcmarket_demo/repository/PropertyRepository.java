package uz.pdp.app_pcmarket_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.app_pcmarket_demo.entity.Property;
import uz.pdp.app_pcmarket_demo.projection.CustomProperty;

@RepositoryRestResource(path = "characteristicsValues",excerptProjection = CustomProperty.class)
public interface PropertyRepository extends JpaRepository<Property, Integer> {
}
