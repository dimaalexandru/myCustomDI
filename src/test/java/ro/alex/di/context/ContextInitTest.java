package ro.alex.di.context;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.alex.di.core.context.ApplicationContext;
import ro.alex.di.core.context.Context;

/**
 * User: Alexandru.Dima
 * Date: 11/12/13
 * Time: 7:34 PM
 */

public class ContextInitTest {

    Context context;

    @Before
    public void setUp() throws Exception {
        context = new ApplicationContext();
    }

    @Test
    public void testNewContext() throws Exception {
        Assert.assertNotNull(context);
    }

}
