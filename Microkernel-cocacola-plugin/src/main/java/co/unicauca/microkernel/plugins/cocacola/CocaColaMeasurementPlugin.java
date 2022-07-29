
package co.unicauca.microkernel.plugins.cocacola;

import co.unicauca.microkernel.common.entities.Measure;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IMeasurePlugin;

public class CocaColaMeasurementPlugin implements IMeasurePlugin{

    public boolean calculateMeasure(Measure measure) {
        boolean flag = true;
        Product product = measure.getProduct();
        double weight = product.getWeight();
        double diameter = product.getDiameter();
        double height = product.getHeight();
        
        
        if(weight<0.013 || weight>0.0137){
            System.out.println("El peso no es ideal.");
            flag = false;
        }else if(diameter<6.4 || diameter>6.7){
            System.out.println("El diametro no es ideal.");
            flag = false;
        }else if(height<11.5 || height>12.5){
            System.out.println("La altura no es ideal.");
            flag = false;
        }
        return flag;
    }
    
}
