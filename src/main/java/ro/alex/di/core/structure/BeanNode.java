package ro.alex.di.core.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 10/30/13
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class BeanNode {

    private String name;

    private Class clazz;

    private BeanScope scope;

    private List<BeanNode> dependencies;

    public BeanNode() {
        this.dependencies = new ArrayList<BeanNode>();
    }

    public BeanNode addName(String name) {
        this.name = name;
        return this;
    }

    public BeanNode addClazz(Class clazz) {
        this.clazz = clazz;
        return this;
    }

    public BeanNode addScope(BeanScope beanScope) {
        this.scope = beanScope;
        return this;
    }

    public BeanNode addDependency(BeanNode beanNode) {
        this.dependencies.add(beanNode);
        return this;
    }

    public String getName() {
        return name;
    }

    public Class getClazz() {
        return clazz;
    }

    public BeanScope getScope() {
        return scope;
    }

    public List<BeanNode> getDependencies() {
        return dependencies;
    }

}
