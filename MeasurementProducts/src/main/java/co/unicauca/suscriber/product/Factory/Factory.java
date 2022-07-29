/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.suscriber.product.Factory;
import co.unicauca.subscriber.infra.Utilities;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.text.Utilities;

/**
 *
 * @author Daniel Cisneros
 */
public class Factory {
     private static Factory instance;

    public Factory() {
    }
     
    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }
    
    /**
     * Método que crea una instancia concreta de la jerarquia IProductRepository
     *
     * @return una clase hija de la abstracción IProductRepository
     */
    public IProductRepository getRepository() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {  
        IProductRepository result = null;
        
        try { 
            result = (IProductRepository) Class.forName(Utilities.loadProperty("repositoryClass")).getConstructor().newInstance();
        } catch (SecurityException | IllegalArgumentException  ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(result == null)
         result = new ProductRepositoryImpl();
        return result;
    }
}
