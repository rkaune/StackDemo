/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

import java.util.Stack;

/**
 *
 * @author rkaune
 */
// A Stack program to demonstrate a stack data structure

public class StackDemo 
{
     public static void main(String[] args)
     {
        Stack s = new Stack();
     
        System.out.println("Adding 33 and 47 to stack.");
        // push adds the item to the top of the stack
        s.push(33);
        s.push(47);  
                    
        System.out.println("Top of stack: " + s.peek());
        System.out.println("Items in stack: " + s.size());
        
        // pop removes the top item
        System.out.println("Removing top item.");
        s.pop();     
                         
        System.out.println("Top of stack: " + s.peek());
        System.out.println("Items in stack: " + s.size());
        System.out.println("Adding a new item.");
        s.push(3);
        System.out.println("Top of stack: " + s.peek());
        System.out.println("Items in stack: " + s.size());
     }
}
