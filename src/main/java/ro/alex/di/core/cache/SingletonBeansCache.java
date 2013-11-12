package ro.alex.di.core.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Alexandru.Dima
 * Date: 11/12/13
 * Time: 9:13 PM
 */
public class SingletonBeansCache {

    private static Map<String, Object> instances;

    public SingletonBeansCache() {
        SingletonBeansCache.instances = new HashMap<String, Object>();
    }

    public Object getInstance(String name) {
        return SingletonBeansCache.instances.get(name);
    }

    public void addInstance(String name, Object o) {
        SingletonBeansCache.instances.put(name, o);
    }

}
