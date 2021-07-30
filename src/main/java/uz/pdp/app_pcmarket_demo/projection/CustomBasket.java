package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.Basket;
import uz.pdp.app_pcmarket_demo.entity.Product;

import javax.persistence.ManyToMany;
import java.util.List;

@Projection(types = Basket.class)
public interface CustomBasket {
   Integer getId();
   List<Product> getProduct();
}
