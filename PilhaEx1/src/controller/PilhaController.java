package controller;

import java.util.Stack;

public class PilhaController {
	
	    private Stack<Integer> stack = new Stack<>();
	    
	    public void push(int value) {
	        stack.push(value);
	        System.out.println("Push(" + value + ")");
	    }
	    
	    public int pop() {
	        int value = stack.pop();
	        System.out.println("Pop(" + value + ")");
	        return value;
	    }
	    
	    public int top() {
	        int value = stack.peek();
	        System.out.println("Top(" + value + ")");
	        return value;
	    }
	    
	    public int size() {
	        int size = stack.size();
	        System.out.println("Size(" + size + ")");
	        return size;
	    }
	    
	    public boolean isEmpty() {
	        return stack.isEmpty();
	    } 
}
