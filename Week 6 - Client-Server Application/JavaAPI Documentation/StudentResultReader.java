import java.util.*;
import java.io.*;

class StudentResultReader {
	public static void main(String[] args) {
		System.out.println("Reading from file...");
		Vector v = new Vector(); // empty vector for the object read from binary file

		try {
			FileInputStream fileIn = new FileInputStream("result.bin"); // binary file "result.bin"
			ObjectInputStream objectIn = new ObjectInputStream(fileIn); // input stream

			v = (Vector) objectIn.readObject(); // read an object as Vector
			fileIn.close(); // close the file
		} catch (IOException err) { // handle IO exception
			System.err.println(err);
		} catch (ClassNotFoundException err) { // handle ClassNotFound exception
			System.err.println(err);
		}

		for (int i = 0; i < v.size(); i++) { // displays the objects read
			StudentResult temp = (StudentResult) v.elementAt(i);
			temp.display();
		}
	}
}