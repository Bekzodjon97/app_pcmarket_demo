package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.FeedBack;
import uz.pdp.app_pcmarket_demo.entity.Product;
import uz.pdp.app_pcmarket_demo.entity.Users;

import java.util.Date;

@Projection(types = FeedBack.class)
public interface CustomFeedback {
    Integer getId();

    Integer getRate();

    String getText();

    Date getDate();

    Product getProduct();


}
