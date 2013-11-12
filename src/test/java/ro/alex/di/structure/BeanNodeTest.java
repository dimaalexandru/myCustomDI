package ro.alex.di.structure;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.alex.di.app.beans.BeanOne;
import ro.alex.di.app.beans.BeanTwo;
import ro.alex.di.core.structure.BeanNode;
import ro.alex.di.core.structure.BeanScope;

import java.util.List;

/**
 * User: Alexandru.Dima
 * Date: 11/12/13
 * Time: 8:32 PM
 */
public class BeanNodeTest {

    BeanOne beanOne;

    BeanTwo beanTwo;

    @Before
    public void setUp() throws Exception {
        beanOne = new BeanOne();
        beanTwo = new BeanTwo();
    }

    @Test
    public void testCreateSimpleBeanNode() throws Exception {
        BeanNode beanNode = new BeanNode().addName("BeanOne").addClazz(BeanOne.class).addScope(BeanScope.PROTOTYPE);
        Assert.assertNotNull(beanNode);
        Assert.assertEquals("BeanOne", beanNode.getName());
        Assert.assertEquals(BeanOne.class, beanNode.getClazz());
        Assert.assertEquals(BeanScope.PROTOTYPE, beanNode.getScope());
    }

    @Test
    public void testCreateBeanNodeWithDependecy() throws Exception {
        BeanNode beanNodeOne = new BeanNode().addName("BeanOne").addClazz(BeanOne.class).addScope(BeanScope.PROTOTYPE);
        BeanNode beanNodeTwo = new BeanNode().addName("BeanTwo").addClazz(BeanTwo.class).addScope(BeanScope.PROTOTYPE).addDependency(beanNodeOne);
        Assert.assertNotNull(beanNodeOne);
        Assert.assertNotNull(beanNodeTwo);
        List<BeanNode> dependencies = beanNodeTwo.getDependencies();
        Assert.assertEquals(beanNodeOne, dependencies.get(0));
    }

}
