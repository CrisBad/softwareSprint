/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.suscriber.product.Factory;
import co.unicauca.microkernel.common.entities.Product;
import java.util.ArrayList;

/**
 *
 * @author Daniel Cisneros
 */
public class ProductRepositoryImpl implements IProductRepository {
    private ArrayList<Product> misProducts;
    

    public ProductRepositoryImpl() {
        this.misProducts = new ArrayList();
    }    
    
    public void agregarproductRepository(Product objProducto) {
                
        if (misProducts.add(objProducto)) {
            System.out.println("se agrego el producto");
        }
        else
        {
        System.out.println("no se agrego");
        }   
    }    

    public int tamanioLista() {
        return this.misProducts.size();
    }
}
