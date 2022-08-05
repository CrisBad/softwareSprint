
package co.unicauca.microkernel.plugins.pepsi;

import co.unicauca.microkernel.common.entities.Measure;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IMeasurePlugin;


public class PepsiMeasurementPlugin implements IMeasurePlugin {
    public boolean calculateMeasure(Measure measure) {
        boolean flag = true;
        Product product = measure.getProduct();
        double weight = product.getWeight();
        double diameter = product.getDiameter();
        double height = product.getHeight();
        
        
        if(weight<0.012 || weight>0.0128){
            System.out.println("El peso no es ideal.");
            flag = false;
        }else if(diameter<5 || diameter>5.3){
            System.out.println("El diametro no es ideal.");
            flag = false;
        }else if(height<12 || height>12.3){
            System.out.println("La altura no es ideal.");
            flag = false;
        }
        return flag;
    }
}
