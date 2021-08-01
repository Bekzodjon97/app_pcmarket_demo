package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.Basket;
import uz.pdp.app_pcmarket_demo.entity.BasketProduct;
import uz.pdp.app_pcmarket_demo.entity.Product;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.util.List;

@Projection(types = BasketProduct.class)
public interface CustomBasketProduct {
   Integer getId();
   Product getProduct();
   Integer getAmount();
   Basket getBasket();
}
