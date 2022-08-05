
package co.unicauca.microkernel.common.interfaces;

import java.util.Properties;

public interface IPublisherPlugin {
    /**
     *
     * @param msg
     * Mensaje a ser publicado a traves de un servicio de mensajeria
     */
    public void publish(String msg);
    public void setProperties(Properties publisherProperties);
}
