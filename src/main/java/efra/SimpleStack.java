package efra;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21204031 on 20/10/2016.
 */
public class SimpleStack implements Istack {
    Stack<Item> wrappedStack = new Stack<Item>();


    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty() {

        return wrappedStack.isEmpty();
    }
    /**
     * Returns the number of items in this stack.
     */
    public int getSize() {

        return wrappedStack.size();
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item) {
        wrappedStack.push(item);
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException {
        return wrappedStack.peek();
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException {
        return wrappedStack.pop();
    }
}
