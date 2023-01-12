package chapter08;

public class StudentMain2 {

	public static void main(String[] args) {
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이재민");
		System.out.println("이름: "+studentLee.StudentName+ "id: "+ studentLee.studentID);
		
		System.out.println("===");
		Student2 studentkim = new Student2();
		studentkim.setStudentName("김창우");
		System.out.println("이름: "+studentkim.StudentName+ "id: "+ studentkim.studentID);
		
		System.out.println("===");
		Student2 studentpark = new Student2();
		studentpark.setStudentName("박창훈");	
		System.out.println("이름: "+studentpark.StudentName+ "id: "+ studentpark.studentID);

	}

}
