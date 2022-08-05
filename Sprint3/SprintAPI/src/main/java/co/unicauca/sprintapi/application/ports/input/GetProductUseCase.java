package co.unicauca.sprintapi.application.ports.input;

import co.unicauca.sprintapi.domain.model.Product;

public interface GetProductUseCase {
	Product getProductById(Long id);
}
