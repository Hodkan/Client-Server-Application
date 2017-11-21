import java.io.Serializable;

class StudentResult implements Serializable {
	private int idNumber;
	private char grade;
	private float mark;

	StudentResult(int i, char g, float m) {
		idNumber = i;
		grade = g;
		mark = m;      
	}

	public int getId() {
		return idNumber;
	}

	public char getGrade() {
		return grade;
	}

	public float getMark() {
		return mark;   
	}   

	public void display() {
		System.out.println(idNumber + " " + grade + " " + mark);
	}   
}