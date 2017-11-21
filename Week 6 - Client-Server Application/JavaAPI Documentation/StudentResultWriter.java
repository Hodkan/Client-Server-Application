import java.util.*; // package for Vector
import java.io.*; // package of OutputStremas

class StudentResultWriter {
	public static void main(String args[]) {
		Vector<StudentResult> resultVector = new Vector<>(); // Vector object

		resultVector.add(new StudentResult(9430, 'B', (float) 76.5)); // add StudentResult object into Vector
		resultVector.add(new StudentResult(9433, 'C', (float) 65.7));
		System.out.println("Writing to file...");

		try {
			FileOutputStream fileOut = new FileOutputStream("result.bin"); // binary file "result.bin"
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut); // output stream

			objectOut.writeObject(resultVector); // save the object in the binary file
			fileOut.close(); // close the file
			System.out.println("Completed - result.bin"); // user feedback
		} catch (IOException e) { // catch if IO exceptions happen
			System.out.println(e);
		}
	}
}