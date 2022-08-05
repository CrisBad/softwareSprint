package co.unicauca.sprintapi.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unicauca.sprintapi.domain.model.Product;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProduct data;
	
	
	@Override
	public List<Product> listar() {
		return (List<Product>)data.findAll();
	}

	@Override
	public Optional<Product> listarId(Long id) {
		return data.findById(id);
	}

	@Override
	public int save(Product product) {
		int res=0;
		Product p=data.save(product);
		if(!p.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(Long id) {
		data.deleteById(id);
		
	}

}
