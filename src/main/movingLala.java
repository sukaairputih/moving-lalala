package main;

import java.util.Scanner;

import aview.tui.textUI;

public class movingLala {
	
	private static movingLala instance = null;
	private static textUI tui;
	private static Scanner scan;

	public static movingLala getInstance() {
        if (instance == null) {
            instance = new movingLala();
        }
        return instance;
        
    }
	
	private movingLala() {
		//tui.printText();
	}
	
	public textUI getTUI() {
		return tui;
	}
	
	public static void main(String[] args) {
		
		boolean continu = true;
		
		tui.printText();
		scan = new Scanner(System.in);
        while (continu) {
            //continu = tui.processInputLine(scan.next());
        }
//		movingLala();
	}

}
