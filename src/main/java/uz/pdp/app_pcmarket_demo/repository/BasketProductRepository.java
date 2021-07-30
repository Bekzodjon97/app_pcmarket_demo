package uz.pdp.app_pcmarket_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.app_pcmarket_demo.entity.Basket;
import uz.pdp.app_pcmarket_demo.entity.BasketProduct;
import uz.pdp.app_pcmarket_demo.projection.CustomBasketProduct;

@RepositoryRestResource(path = "basketProduct",excerptProjection = CustomBasketProduct.class)
public interface BasketProductRepository extends JpaRepository<BasketProduct, Integer> {
}
