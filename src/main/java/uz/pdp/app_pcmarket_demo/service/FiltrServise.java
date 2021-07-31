package uz.pdp.app_pcmarket_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.app_pcmarket_demo.entity.Product;
import uz.pdp.app_pcmarket_demo.repository.ProductRepository;

import java.util.List;

@Service
public class FiltrServise {
    @Autowired
    ProductRepository productRepository;


    public ResponseEntity<?> getAllByFiltr(Integer minPrice, Integer maxPrice, List<Integer> list) {
        List<Product> filteredProducts = productRepository.getFilteredProducts(minPrice, maxPrice, list);
        return ResponseEntity.ok(filteredProducts);
    }
}
