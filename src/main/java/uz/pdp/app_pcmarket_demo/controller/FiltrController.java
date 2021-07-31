package uz.pdp.app_pcmarket_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.app_pcmarket_demo.service.FiltrServise;

import java.util.List;

@RestController
@RequestMapping("filtr")
public class FiltrController {
    @Autowired
    FiltrServise filtrServise;


    @GetMapping
    public ResponseEntity<?> get(@RequestParam Integer minPrice,@RequestParam Integer maxPrice, @RequestParam List<Integer> list ){
        return filtrServise.getAllByFiltr( minPrice,  maxPrice,  list);
    }

}
