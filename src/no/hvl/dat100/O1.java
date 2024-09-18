package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0 ; 
		while(i<10) {
			String input = JOptionPane.showInputDialog("Skriv inn poengsum");
			int poengsum = Integer.parseInt(input);
			if (poengsum > 100 || poengsum < 0) {
				System.out.println("Ikkje gyldig");
				i--;
			} else if (poengsum >=90) {
				System.out.println("A");
			} else if ( poengsum >=80) {
				System.out.println("B");
			}else if (poengsum >=60) {
				System.out.println("C");
			}else if (poengsum >=50) {
				System.out.println("D");
				
			}else if ( poengsum >=40) {
				System.out.println("E");
				
			}else {
				System.out.println("F");
			}
			
			i++;		
		}

	}
}
