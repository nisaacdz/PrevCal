package view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JPanel;

public class Serializable {

	public static JPanel getRecentPane() {
		String location = "\\recentView.txt";

		return null;
	}

	public static Object deserialize(String location)
			throws ClassNotFoundException, FileNotFoundException, IOException {
		Object obj = new Object();
		ObjectOutputStream str = new ObjectOutputStream(new FileOutputStream(location));
		str.writeObject(obj);
		str.close();
		return obj;
	}

	public static void serialize(Object obj, String location) throws IOException {
		ObjectOutputStream str = new ObjectOutputStream(new FileOutputStream(location));
		str.writeObject(obj);
		str.close();
	}
}
