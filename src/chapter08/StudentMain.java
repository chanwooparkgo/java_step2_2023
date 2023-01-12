package chapter08;

public class StudentMain {

	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이재민");
		System.out.println(studentLee.StudentName);
		System.out.println(studentLee.getSerialNum());
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;//100001
		studentLee.serialNum++;
		
		System.out.println("===");
		Student1 studentkim = new Student1();
		studentkim.setStudentName("김창우");
		System.out.print(studentkim.StudentName);
		System.out.println(studentkim.getSerialNum());
		studentkim.serialNum++;
		
		System.out.println("===");
		Student1 studentpark = new Student1();
		studentpark.setStudentName("박창훈");
		System.out.print(studentpark.StudentName);
		System.out.println(studentpark.getSerialNum());
		

	}

}
