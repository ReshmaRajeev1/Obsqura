package com.obsqura.training.topic16;

public class Student {
	static String collegeName="Toch";
	private String studentName;
	private int studentAge;
	private char studentGrade;
	Student(String name, int age,char grade){
		studentName=name;
		studentAge =age;
		studentGrade=grade;
		
		
	}
	
	public void display() {
		System.out.println("College is "+collegeName);
		System.out.println("Name is "+studentName);
		System.out.println("Age is "+studentAge);
		System.out.println("Grade is "+studentGrade);
	}
	public static void main(String[] args) {

		System.out.println("Student1----------------------------");
		Student student1 = new Student("Smith", 28, 'A');
		student1.display();
		
		System.out.println("Student2----------------------------");
		Student student2 = new Student("Rahul", 28, 'B');
		student2.display();
		
		System.out.println("Student3----------------------------");
		Student student3 = new Student("Varun", 28, 'C');
		student3.display();
	}

}
