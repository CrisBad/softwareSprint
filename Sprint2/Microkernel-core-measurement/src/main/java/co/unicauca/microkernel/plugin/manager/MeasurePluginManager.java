
package co.unicauca.microkernel.plugin.manager;

import co.unicauca.microkernel.common.interfaces.IMeasurePlugin;
import co.unicauca.microkernel.common.interfaces.IPublisherPlugin;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase es una fábrica que utiliza reflexión para crear dinámicamente los
 * plugins.
 *
 */
public class MeasurePluginManager{

    private static final String FILE_NAME = "plugin.properties";
    private static MeasurePluginManager instance;

    private Properties pluginProperties;

    private MeasurePluginManager() {
        pluginProperties = new Properties();
    }

    public static MeasurePluginManager getInstance() {
        return instance;
    }

    public static void init(String basePath) throws Exception {

        instance = new MeasurePluginManager();
        instance.loadProperties(basePath);
        if (instance.pluginProperties.isEmpty()) {
            throw new Exception("Could not initialize plugins");
        }

    }

    public IMeasurePlugin getMeasurePlugin(String countryCode) {

        //Verificar si existe una entrada en el archivo para el país indicado.
        String propertyName = "measure." + countryCode.toLowerCase();
        if (!pluginProperties.containsKey(propertyName)) {
            return null;
        }

        IMeasurePlugin plugin = null;
        //Obtener el nombre de la clase del plugin.
        String pluginClassName = pluginProperties.getProperty(propertyName);

        try {

            //Obtener una referencia al tipo de la clase del plugin.
            Class<?> pluginClass = Class.forName(pluginClassName);
            if (pluginClass != null) {

                //Crear un nuevo objeto del plugin.
                Object pluginObject = pluginClass.getDeclaredConstructor().newInstance();

                if (pluginObject instanceof IMeasurePlugin) {
                    plugin = (IMeasurePlugin) pluginObject;
                }
            }

        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
            Logger.getLogger("MeasurePluginManager").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }

        return plugin;

    }

    private Object getAnyObject(String classNameProperty) {
        if (!pluginProperties.containsKey(classNameProperty)) {
            return null;
        }

        Object plugin = null;
        //Obtener el nombre de la clase del plugin.
        String pluginClassName = pluginProperties.getProperty(classNameProperty);
        System.out.println(pluginClassName);

        try {

            //Obtener una referencia al tipo de la clase del plugin.
            Class<?> pluginClass = Class.forName(pluginClassName);
            if (pluginClass != null) {
                //Crear un nuevo objeto del plugin.
                plugin = pluginClass.getDeclaredConstructor().newInstance();
            }

        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
            Logger.getLogger("PluginManager").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }
        return plugin;
    }
    
    public IPublisherPlugin getPublisherPlugin(String propertyTechPublisher) {
        IPublisherPlugin plugin = null;
        Object pluginObject= getAnyObject(propertyTechPublisher);
        if (pluginObject instanceof IPublisherPlugin) {
                    plugin = (IPublisherPlugin) pluginObject;
        }
        plugin.setProperties(pluginProperties);
        return plugin;
    }
    
    private void loadProperties(String basePath) {

        String filePath = basePath + FILE_NAME;
        try (FileInputStream stream = new FileInputStream(filePath)) {

            pluginProperties.load(stream);

        } catch (IOException ex) {
            Logger.getLogger("MeasurePluginManager").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }

    }

}
