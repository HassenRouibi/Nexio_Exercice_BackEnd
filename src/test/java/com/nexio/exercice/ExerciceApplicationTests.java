package com.nexio.exercice;

import com.nexio.exercice.model.Product;
import com.nexio.exercice.repository.ProductRepository;
import com.nexio.exercice.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciceApplicationTests {

	@Autowired
	ProductService productService;

	@Test
	public void contextLoads() {
	}

	@Before
	public void setup(){
	}

	@Test
	public void getAllProductsTest() {

		Product firstProduct = new Product();

		firstProduct.setName("Product1");
		firstProduct.setPrice(80);
		firstProduct.setPictureUrl("//URL1");
		firstProduct.setDetail("zaofjemezrjjf");
		firstProduct.setQuantite(0);

		productService.updateProduct(firstProduct);

		Product secondProduct = new Product();

		secondProduct.setName("Product2");
		secondProduct.setPrice(70);
		secondProduct.setPictureUrl("//URL2");
		secondProduct.setDetail("zaofjemezrjjf");
		secondProduct.setQuantite(0);

		productService.updateProduct(secondProduct);

		List<Product> products = productService.getAllProducts();

		assertThat(products.size()).isEqualTo(2);
	}

	@Test
	public void getProductTest(){

		Product firstProduct = new Product();

		firstProduct.setName("Product1");
		firstProduct.setPrice(120);
		firstProduct.setPictureUrl("//URL1");
		firstProduct.setDetail("zaofjemezrjjf");
		firstProduct.setQuantite(0);

		EntityManager entityManager = mock(EntityManager.class);
		when(entityManager.find(Product.class,1L)).thenReturn(firstProduct);

		assertEquals("Product2",firstProduct.getName());
	}

}
