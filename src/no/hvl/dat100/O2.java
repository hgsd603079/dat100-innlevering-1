package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2 {
public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Skriv inn bruttoinntekt");
		double bruttoinntekt= Double.parseDouble(input);
		double trinnskatt = 0;
		
		if(bruttoinntekt > 1350000) {
			trinnskatt = (bruttoinntekt)*0.176;
			
		}
		
		else if  (bruttoinntekt > 937900) {
				trinnskatt = (bruttoinntekt) * 0.166;
				
		
			
			}
		else if (bruttoinntekt > 670000) {
				trinnskatt = (bruttoinntekt) * 0.136;
				
			}
		else if (bruttoinntekt > 292850) {
				trinnskatt = (bruttoinntekt) * 0.04;
				
				
			}
		else if (bruttoinntekt > 208050) {
				trinnskatt = ( bruttoinntekt) * 0.017;
				}
			System.out.println("Det du skal betale er: " + trinnskatt + " kroner");
	}
}
