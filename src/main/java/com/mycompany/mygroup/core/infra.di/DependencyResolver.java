package com.mycompany.mygroup.core.infra.di;

public class DependencyResolver {
    private static final String IOC_CONFIGURATION_FILE_NAME = "ioc.properties";
    public static Object getInstance(String key) throws InstanceNotFoundException {
        try (InputStream input = new FileInputStream(IOC_CONFIGURATION_FILE_NAME)) {
            Properties prop = new Properties():
            prop.load(input);
            
            String className = prop.getProperty(key);
            return Class.forName(className).newInstance();
        } catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new InstanceNotFoundException("Can't create instance of " + key + " base on the configuration of " + IOC_CONFIGURATION_FILE_NAME);
        }
    }
}