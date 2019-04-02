package com.nexio.exercice;

import com.nexio.exercice.model.Product;
import com.nexio.exercice.repository.ProductRepository;
import com.nexio.exercice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExerciceApplication {

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {

		SpringApplication.run(ExerciceApplication.class, args);

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			/**
			 * Remplissage de la base au démmarage avec 3 produits
			 */
			Product produit1 = new Product();

			produit1.setName("Livre");
			produit1.setPrice(21);
			produit1.setPictureUrl("/src/images/livre.jpg");
			produit1.setDetail("Un livre est un document écrit formant unité et conçu comme tel, composé de pages reliées les unes aux autres. Il a pour fonction d'être un support de l'écriture, permettant la diffusion et la conservation de textes de nature variée.");
			produit1.setQuantite(0);

			Product produit2 = new Product();

			produit2.setName("Stylo");
			produit2.setPrice(2);
			produit2.setPictureUrl("/src/images/stylo.jpg");
			produit2.setDetail("Le Bic Cristal est un stylo à bille jetable fabriqué par la Société Bic depuis décembre 1950.");
			produit2.setQuantite(0);



			Product produit3 = new Product();

			produit3.setName("Gomme");
			produit3.setPrice(3);
			produit3.setPictureUrl("/src/images/gomme.jpg");
			produit3.setDetail("La gomme à effacer, qui permet d'effacer des écritures et des dessins.");
			produit3.setQuantite(0);

			productRepository.save(produit1);
			productRepository.save(produit2);
			productRepository.save(produit3);

		};
	}
}
