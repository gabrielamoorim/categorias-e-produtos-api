package com.gadev.segundo_projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gadev.segundo_projeto.entities.Category;
import com.gadev.segundo_projeto.repositories.CategoryRepository;

@SpringBootApplication
public class SegundoProjetoApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SegundoProjetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
