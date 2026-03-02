package controller;

import javax.swing.JOptionPane;

public class FatorialController {
	
	public int fatorialDuplo(int num) {
		if (num == 0 ) {
			return 1;
		}
		else if (num%2 == 1){
			return num * fatorialDuplo(num-1);
		}
		return fatorialDuplo(num-1);
	}
	
	public int recebeNum() {
		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero a ser calculado o fatorial duplo: "));
		} while (num%2 != 1);
		return num;
	}
}
