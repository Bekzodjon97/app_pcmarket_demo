package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.Category;
import uz.pdp.app_pcmarket_demo.entity.Order;

import javax.persistence.Column;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();

    String  getName();

    boolean  isActive();
    Category getParentCategory();
}
