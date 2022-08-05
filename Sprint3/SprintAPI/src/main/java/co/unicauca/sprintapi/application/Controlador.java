package co.unicauca.sprintapi.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.unicauca.sprintapi.domain.model.Product;
import co.unicauca.sprintapi.domain.service.IProductService;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private IProductService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Product> products = service.listar();
		model.addAttribute("products", products);
		return "index";
	}
	
	@GetMapping("/crear")
	public String agregar(Model model) {
		model.addAttribute("product", new Product());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Product p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		Optional<Product>product=service.listarId(id);
		model.addAttribute("product", product);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Long id, Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
}
