package interface_examples;

public class Executor {
	public static void main(String[] args) {
		//College reference
		College c1;
		
		//Cse students
		c1=new CseStudents();
		c1.session();
		
		//IT students
		c1=new ItStudents();
		c1.session();
	}

}
