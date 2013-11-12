package ro.alex.di.core.scan;


import ro.alex.di.core.context.RegisteredConfigClass;

/**
 * User: Alexandru.Dima
 * Date: 11/12/13
 * Time: 7:21 PM
 */
public interface Scanner {

    void scanForBeans(Class configClass);

}
