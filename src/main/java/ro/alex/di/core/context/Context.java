package ro.alex.di.core.context;

/**
 * User: Alexandru.Dima
 * Date: 11/6/13
 * Time: 11:08 AM
 *
 *
 */
public interface Context {

    public void setUp(Class configClass);

    public void initialize();

    public <T> T getBean(String name);

}
