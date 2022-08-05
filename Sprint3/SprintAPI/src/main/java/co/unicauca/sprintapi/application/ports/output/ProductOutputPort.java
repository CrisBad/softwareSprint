package co.unicauca.sprintapi.application.ports.output;

import java.util.Optional;

import co.unicauca.sprintapi.domain.model.Product;

public interface ProductOutputPort {
	Product saveProduct(Product product);

    Optional<Product> getProductById(Long id);
}
