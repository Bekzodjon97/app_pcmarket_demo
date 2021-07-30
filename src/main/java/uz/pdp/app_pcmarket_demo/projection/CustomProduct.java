package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.*;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String  getName();

    boolean  isActive();
    double getPrice();

    Attachment getPhoto();

    Category getCategory();

    List<CharacteristicsValues> getCharacteristics();

    String getDescription();
}
