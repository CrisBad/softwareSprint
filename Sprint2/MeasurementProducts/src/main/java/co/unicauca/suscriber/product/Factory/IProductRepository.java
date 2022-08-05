package co.unicauca.suscriber.product.Factory;
import co.unicauca.microkernel.common.entities.Product;
/**
 *
 * @author Daniel Cisneros
 */
public interface IProductRepository {
    public void agregarproductRepository(Product objProducto); 
    public int tamanioLista();
}
