package uz.pdp.app_pcmarket_demo.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.app_pcmarket_demo.entity.Users;

@Projection(types = Users.class)
public interface CustomUser {
    Integer getId();


    String  getName();

    String getEmail();

    String getMessage();
}
