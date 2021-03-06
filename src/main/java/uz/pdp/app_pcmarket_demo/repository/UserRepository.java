package uz.pdp.app_pcmarket_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.app_pcmarket_demo.entity.Users;
import uz.pdp.app_pcmarket_demo.projection.CustomUser;

@RepositoryRestResource(path = "user",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<Users, Integer> {
}
