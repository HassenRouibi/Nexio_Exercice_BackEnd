package com.nexio.exercice.service;

import com.nexio.exercice.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    /**
     * GET  /products : get all products.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of product
     */
    List<Product> getAllProducts();

    /**
     * GET  /product/id : get the product by id.
     *
     * @param id the id of product to found
     * @return the product
     */
    Optional<Product> getProduct(long id);

    /**
     * Put  /product : update the product, create if not exist.
     *
     * @param product the product to update
     * @return the product updated
     */
    Product updateProduct(Product product);

    /**
     * Del  /product : delete the product
     *
     * @param product the product to delete
     * @return
     */
    void deleteProduct(Product product);
}
