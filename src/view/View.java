package view;

import javax.swing.SwingUtilities;

abstract class View {

	public static void Call() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				launch();
			}
		});
	}

	private static void launch() {
		
	}
}
