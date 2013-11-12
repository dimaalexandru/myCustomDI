package ro.alex.di.core.structure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 10/30/13
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class BeanStructure {

    private static Map<String, BeanNode> beanNodeMap = new HashMap<String, BeanNode>();

    public static void addBean(String name, BeanNode beanNode) {
        beanNodeMap.put(name, beanNode);
    }

    public static BeanNode getBean(String name) {
        return beanNodeMap.get(name);
    }

    public static void clear() {
        beanNodeMap.clear();
    }

}
