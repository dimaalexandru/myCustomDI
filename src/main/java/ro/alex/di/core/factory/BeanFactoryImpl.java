package ro.alex.di.core.factory;

import ro.alex.di.core.cache.SingletonBeansCache;

/**
 * User: Alexandru.Dima
 * Date: 11/12/13
 * Time: 9:11 PM
 */
public class BeanFactoryImpl implements BeanFactory {

    private SingletonBeansCache singletonBeansCache;

    public BeanFactoryImpl() {
        singletonBeansCache = new SingletonBeansCache();
    }

    @Override
    public <T> T getBean(String beanName) {
        return null;
    }

}
