package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.Characteristics;
import uz.pdp.app_pcmarket_demo.entity.Property;

@Projection(types = Property.class)
public interface CustomProperty {
    Integer getId();

    String getValue();

    Characteristics getCharacteristics();
}
