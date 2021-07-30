package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.Characteristics;
import uz.pdp.app_pcmarket_demo.entity.CharacteristicsValues;
import uz.pdp.app_pcmarket_demo.entity.Order;

import javax.persistence.ManyToOne;

@Projection(types = CharacteristicsValues.class)
public interface CustomCharacteristicsValues {
    Integer getId();

    String getValue();

    Characteristics getCharacteristics();
}
