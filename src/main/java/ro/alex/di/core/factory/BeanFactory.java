package ro.alex.di.core.factory;

import ro.alex.di.core.structure.BeanNode;

/**
 * User: Alexandru.Dima
 * Date: 11/12/13
 * Time: 9:01 PM
 */
public interface BeanFactory {

    <T> T getBean(String beanName);

}
