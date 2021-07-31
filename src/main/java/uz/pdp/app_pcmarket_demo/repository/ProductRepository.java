package uz.pdp.app_pcmarket_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.app_pcmarket_demo.entity.Basket;
import uz.pdp.app_pcmarket_demo.entity.Characteristics;
import uz.pdp.app_pcmarket_demo.entity.Product;
import uz.pdp.app_pcmarket_demo.projection.CustomProduct;

import java.util.List;

@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select distinct * from product " +
            "join Characteristics ch on ch.product_id=id"+
            "join Property pr on pr.characteristics_id=ch.id"+
            "where price between minPrice=:minPrice and maxPrice=:maxPrice and pr.characteristics_id in =:list ",nativeQuery = true)
    List<Product> getFilteredProducts(double minPrice, double maxPrice, List<Integer> list);


}
