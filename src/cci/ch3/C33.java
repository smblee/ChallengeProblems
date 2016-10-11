package cci.ch3;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Bryan Lee
 * Date: 10/9/16
 */
public class C33 {
    // SetOfStacks. Start a new stack when the previous stack exceeds some
    // threshold.
    public class SetOfStacks {
        List<Stack> stacks = new ArrayList<>();
        final int THRESHHOLD = 3;
        int index;

        public SetOfStacks() {
            addStack();
            index = 0;
        }

        void addStack() {
            Stack s = new Stack();
            stacks.add(s);
        }

        int getCurrentStackSize() {
            return getCurrentStack().count;
        }

        Stack getCurrentStack() {
            return stacks.get(index);
        }

        void push(Object o) {
            if (getCurrentStackSize() > THRESHHOLD) {
                addStack();
                index++;
            }
            getCurrentStack().push(o);
        }

        Object pop() {
            Object o = getCurrentStack().pop();
            if (getCurrentStackSize() == 0) {
                stacks.remove(getCurrentStack());
                index--;
            }
            return o;
        }

        Object popAt(int index) {
            if (stacks.get(index) == null)
                System.out.println("The index does not exist");
            return stacks.get(index).pop();
        }

        int stacksSize() {
            return stacks.size();
        }
    }
}
