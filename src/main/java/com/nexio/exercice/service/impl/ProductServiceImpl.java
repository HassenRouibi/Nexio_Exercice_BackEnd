package com.nexio.exercice.service.impl;

import com.nexio.exercice.model.Product;
import com.nexio.exercice.repository.ProductRepository;
import com.nexio.exercice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Product> getProduct(long id) {
        return productRepository
                .findById("1");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteProduct(Product product) {
         productRepository.delete(product);
    }
}

