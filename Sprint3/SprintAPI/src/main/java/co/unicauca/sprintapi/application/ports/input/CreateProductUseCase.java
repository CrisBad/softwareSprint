package co.unicauca.sprintapi.application.ports.input;

import co.unicauca.sprintapi.domain.model.Product;

public interface CreateProductUseCase {
	Product createProduct(Product product);
}
