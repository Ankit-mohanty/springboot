package org.jt.mathodsofjpa;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class MathodsOfJpaApplication implements CommandLineRunner {
	private final ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(MathodsOfJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		// var products= getProducts();
		// .productName("iphone")
		// .productBrand("Apple")
		// .productPrice(25000.32)
		// .build();
		// productRepo.saveAll(products);
		
		
		
		// System.out.println(productRepo.count());
		
		
		// System.out.println(productRepo.existsById("241cfe58-30ce-430f-b104-5f4fb3ab1009"));
		
		// productRepo.deleteById("f9c658fe-e846-4bb1-a416-529de7b3ba3c");

		// var result= productRepo.findAll();
		// System.out.println(result);
		// result.forEach(System.out::println);
		
		/*var result = productRepo.findAll( Sort.by(Direction.ASC, "productPrice"));
		/*result.forEach(System.out::println);


/*  var optionalProduct = productRepo.findByProductName("iphone");
if (optionalProduct.isPresent()) {
	System.out.println(optionalProduct.get());
} else {
System.out.println("No data present");	
}*/ 


// var product=productRepo.findByProductName("iphone");
// System.out.println(product);


// var products = productRepo.findByProductPriceBetween(2000, 10000);
// products.forEach(System.out::println);
	}

 	public List<Product> getProducts() {
		return IntStream.rangeClosed(1, 10)
				.mapToObj(i -> Product.builder()
						.productName("Product-" + i)
						.productBrand("Brand" + i)
						.productPrice(1050.50 * i)
						.build())
				.toList();
				
				
	}

}
