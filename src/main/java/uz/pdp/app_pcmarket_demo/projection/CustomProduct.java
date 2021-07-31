package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.*;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String  getName();

    boolean  isActive();
    double getPrice();

    Attachment getPhoto();

    Category getCategory();

    Characteristics getCharacteristics();

    String getDescription();
}
