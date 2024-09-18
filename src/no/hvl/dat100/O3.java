package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {
public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Skriv inn verdien til n");
		
		int verdi = Integer.parseInt(input);
		int resultat = 1;
		if (verdi > 0) {
		for (int i = 1; i <= verdi; i++) {
			resultat = resultat * i ;
		} 
		 System.out.println("Fakultetet av " + verdi + " er " + resultat );
		}else {
			System.out.println("Ugyldig input");
		}
	}

}
