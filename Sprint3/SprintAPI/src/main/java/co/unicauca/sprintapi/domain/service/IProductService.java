package co.unicauca.sprintapi.domain.service;

import java.util.List;
import java.util.Optional;

import co.unicauca.sprintapi.domain.model.Product;

/**
* Interfaz de operaciones de la bd de productos
*
* @author nvalencia, ceduardo
*
*/

public interface IProductService {
	public List<Product> listar();
	public Optional<Product> listarId(Long id);
	public int save(Product product);
	public void delete(Long id);
}
