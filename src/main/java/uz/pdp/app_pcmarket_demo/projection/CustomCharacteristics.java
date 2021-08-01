package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.Characteristics;
import uz.pdp.app_pcmarket_demo.entity.Order;
import uz.pdp.app_pcmarket_demo.entity.Product;

@Projection(types = Characteristics.class)
public interface CustomCharacteristics {
    Integer getId();

    String  getName();
    Product getProduct();
}
