package uz.pdp.app_pcmarket_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.app_pcmarket_demo.entity.Basket;
import uz.pdp.app_pcmarket_demo.entity.Product;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
