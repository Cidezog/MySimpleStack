package efra;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackTest {
    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStack();
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String (element1)));
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals (0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item (new String (element1)));
        simpleStack.push(new Item (new String (element1+"2")));
        Assert.assertEquals (2, simpleStack.getSize());
    }

    @Test
    public void testPeek() throws Exception {
        Item ita = new Item (new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        Assert.assertEquals(1, simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals (ita.getValue(),integer);
    }

    @Test
    public void testPop() throws Exception {
        Item ita = new Item (new Integer(8));
        Assert.assertEquals (0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.pop();
        Assert.assertEquals(0,simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(),integer);
    }
}