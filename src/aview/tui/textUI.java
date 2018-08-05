package aview.tui;

import java.util.Scanner;
import util.observer.*;

public class textUI implements IObserver {
	
	private static final int WIDTH_SIZE = 20;
	private static final int HIGH_SIZE = 35;
	private static final String LINE = System.getProperty("line.separator"); 
	static StringBuilder line = new StringBuilder();
	
	@Override
	public void update(Event e) {
		// TODO Auto-generated method stub
	}
	
	//TODO delete static. Looks dirty for main
	public static void printText() {
		System.out.println("test input grid:");
		//grid(WIDTH_SIZE, HIGH_SIZE);
	}
	
	public static void grid(int ws, int hs) {
		
		for(int i = 0; i <= ws; i++) {
			line.append("|");
			for(int j = 0; j < hs; j++) {
				line.append("__|");
			}
			line.append("\n");
//			System.out.println(LINE);
		}
		System.out.println(line);
	}
	
	public static boolean processInput(String s) {

		System.out.println("-> " + s);
		
		if(s.equals("a")){
			System.out.println("continue");
			return true;
		} else if(s.equals("b")){
			System.out.println("continue");
			return true;
		} else if(s.isEmpty()){
			System.out.println("continue, but come on!");
			return true;
		} else
			return false;

	}
	
	private boolean checkRegex(String input) {
		
		String regex = input + ".".matches ("[a-zA-Z]+\\.?");
		
		return true;
	}

}
