package com.nexio.exercice.controller;

import com.nexio.exercice.model.Product;
import com.nexio.exercice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class ProductController {

    @Autowired
    ProductService productService;

    /**
     * GET  /products : get all products.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of product
     */
    @GetMapping("/products")
    public @NotNull List<Product> getProducts() {
        return productService.getAllProducts();
    }

    /**
     * GET  /product/id : get the product by id.
     *
     * @param id the id of product to found
     * @return the product
     */
    @GetMapping("/product/{id}")
    public Optional<Product> getProduct(Long id) {
        return productService.getProduct(id);
    }

    /**
     * Put  /product/id : update the product by id, create if not exist.
     *
     * @param id the id of product to update
     * @return the product updated
     */
    @PutMapping("/product/{id}")
    public Optional<Product> updateProduct(Long id) {
        return null;
    }

    /**
     * Del  /product/id : delete the product by id.
     *
     * @param id the id of product to delete
     * @return true if the product is deleted else false
     */
    @DeleteMapping("/product/{id}")
    public boolean deleteProduct(Long id) {
        return true;
    }
}
