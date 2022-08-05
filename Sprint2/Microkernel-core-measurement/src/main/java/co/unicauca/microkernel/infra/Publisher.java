
package co.unicauca.microkernel.infra;

import co.unicauca.microkernel.common.interfaces.IPublisherPlugin;
import co.unicauca.microkernel.plugin.manager.MeasurePluginManager;

public class Publisher {
    public Publisher() {
    }
    
    public void publish(String msg){
        MeasurePluginManager manager = MeasurePluginManager.getInstance();
        IPublisherPlugin publisher = manager.getPublisherPlugin("publisherTech"); 
        publisher.publish(msg);
    }    
}
