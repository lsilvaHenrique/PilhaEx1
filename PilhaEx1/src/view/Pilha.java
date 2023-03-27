package view;

import controller.PilhaController;

public class Pilha {

	public static void main (String[] args) {
    	
	// Algoritmo a)
    PilhaController p1 = new PilhaController ();
    	System.out.println("--------Simulacao A-----------");
    	for (int i = 0; i < 10; i++) {
    		if (i % 2 == 0) {
    			p1.push(i * i);
    		} else {
    			if (i <= 5) {
    				p1.push(i);
            } else {
                	p1.pop();
            	}
    		}
    		p1.top();
    	}  
    		p1.size();
    		System.out.println("------------------------------");		
    		System.out.println("                   ");
    		System.out.println("--------Simulacao B-----------");
    // Algoritmo b)
    PilhaController p2 = new PilhaController ();
    	for (int i = 100; i < 115; i++) {
    		if (p2.isEmpty()) {
    			p2.push(i + 100);
        } else {
            if (p2.size() <= 4) {
                p2.push(i + 50);
            } else {
                p2.pop();
            }
        }
        p2.top();
    	}
    	p2.size();	
	} 
}

	
 
	