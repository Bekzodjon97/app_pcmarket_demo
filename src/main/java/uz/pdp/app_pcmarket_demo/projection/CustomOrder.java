package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.Basket;
import uz.pdp.app_pcmarket_demo.entity.Order;
import uz.pdp.app_pcmarket_demo.entity.Users;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();

    Users getUser();

    String getAddress();

    String getComment();

    String getPhoneNumber();

    Basket getBasket();

    boolean isActive();
}
