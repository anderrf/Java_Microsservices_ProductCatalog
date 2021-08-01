package one.digitalinnovation.project.productcatalog.controller;

import lombok.AllArgsConstructor;
import one.digitalinnovation.project.productcatalog.model.Product;
import one.digitalinnovation.project.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findProductById(@PathVariable Long id){
        return productRepository.findById(id);
    }
}
