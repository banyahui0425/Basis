package test.com.test;

import com.test.demo2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * demo2 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>12月 23, 2019</pre>
 */
public class demo2Test {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: add(int x, int y)
     */
    @Test
    public void testAdd() throws Exception {
        demo2 demo2=new demo2();
        int add = demo2.add(8, 9);
        System.out.println("add = " + add);
    }

} 
