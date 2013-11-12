package ro.alex.di.core.context;


import ro.alex.di.core.factory.BeanFactory;
import ro.alex.di.core.scan.Scanner;
import ro.alex.di.core.structure.BeanStructure;

/**
 * User: Alexandru.Dima
 * Date: 11/12/13
 * Time: 7:18 PM
 */
public class ApplicationContext implements Context {

    private RegisteredConfigClass registeredConfigClass;

    private Scanner scanner;

    private BeanFactory beanFactory;

    @Override
    public void setUp(Class configClass) {
        this.registeredConfigClass = new RegisteredConfigClass(configClass);
    }

    @Override
    public void initialize() {
        scanner.scanForBeans(registeredConfigClass.getConfigClass());
    }

    @Override
    public <T> T getBean(String name) {
        return beanFactory.getBean(name);
    }

}
