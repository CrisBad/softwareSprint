package co.unicauca.sprintapi.domain.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
* Representa un producto de una tienda. Mapeada con la bd.
*
* @author nvalencia, ceduardo
*/


@Entity
@Table(name = "product")
public class Product{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String peso;
	
	private String diametro;
	
	private String altura;
	
	private int tiempoMedicion;
	
	private String estado;

	
	public Product() {
		
	}

	public Product(Long id, String name, String peso, String diametro, String altura, int tiempoMedicion,
			String estado) {
		super();
		this.id = id;
		this.name = name;
		this.peso = peso;
		this.diametro = diametro;
		this.altura = altura;
		this.tiempoMedicion = tiempoMedicion;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getDiametro() {
		return diametro;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public int getTiempoMedicion() {
		return tiempoMedicion;
	}

	public void setTiempoMedicion(int tiempoMedicion) {
		this.tiempoMedicion = tiempoMedicion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	

	
	
	
}
