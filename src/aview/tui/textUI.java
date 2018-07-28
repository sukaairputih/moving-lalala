package aview.tui;

import util.observer.*;

public class textUI implements IObserver {
	
	private static final int WIDTH_SIZE = 20;
	private static final int HIGH_SIZE = 35;
	private static final String LINE = System.getProperty("line.separator"); 
	
	@Override
	public void update(Event e) {
		// TODO Auto-generated method stub
	}
	
	//TODO delete static. Looks dirty for main
	public static void printText() {
		System.out.println("test input grid\n");
		grid(WIDTH_SIZE, HIGH_SIZE);
	}
	
	public static void grid(int ws, int hs) {
		
		for(int i = 0; i <= ws; i++) {
			System.out.println(" | ");
//			System.out.println(LINE);
//			new StringBuilder().append("|");
		}
	}

}
