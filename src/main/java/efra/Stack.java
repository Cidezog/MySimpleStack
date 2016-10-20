package efra;

import java.util.EmptyStackException;

/**
 * Created by 21204031 on 20/10/2016.
 */
public class Stack implements Istack {
    int taille = 0;
    Item premier;

    public Stack () {
        this.premier = null;
    }

    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty() {
        return this.premier.equals(null);
    }
    /**
     * Returns the number of items in this stack.
     */
    public int getSize() {
        return this.taille;
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item) {

    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException {

    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException {

    }
}
