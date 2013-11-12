package ro.alex.di.core.context;

import ro.alex.di.core.exceptions.InvalidConfigurationClassException;

/**
 * User: Alexandru.Dima
 * Date: 11/12/13
 * Time: 8:07 PM
 */
public class RegisteredConfigClass {

    private Class configClass;

    public RegisteredConfigClass(Class configClass) {
        this.configClass = configClass;
        validateClass();
    }

    public Class getConfigClass() {
        return configClass;
    }

    private void validateClass() {
        if(!hasConfigurationAnnotation()) {
            throw new InvalidConfigurationClassException("Configuration class is invalid!");
        }
    }

    private Boolean hasConfigurationAnnotation() {
        return false;
    }

}
