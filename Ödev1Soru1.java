package org.javaturk.oopj.ch09;

import java.util.Date;

import org.javaturk.oopj.ch08.university.Course;
import org.javaturk.oopj.ch08.university.Department;
import org.javaturk.oopj.ch08.university.Professor;
import org.javaturk.oopj.ch08.university.Student;

public class Ödev1Soru1 {

	public static void main(String[] args) {
		class Student{
			String no;
			String name;
			String dob;
			Department department;
			Professor advisor;
			Course[] coursesTaken;
			
		Student(String newNo, String newName, String newDob, Department newDepartment, Professor newAdvisor, Course[] newCoursesTaken){
			no = newNo;
			name = newName;
			dob = newDob;
			department = newDepartment;
			advisor = newAdvisor;
			coursesTaken = newCoursesTaken;	
		}
		
		
		    String newNo;
		    String newName;
		    String newDob;
		    Department newDepartment;
		    Professor newAdvisor;
		    Course[] newCourse;

			public String getNewNo() {
				return newNo;
			}
			public void setNewNo(String newNo) {
				this.newNo = newNo;
			}
			public String getNewName() {
				return newName;
			}
			public void setNewName(String newName) {
				this.newName = newName;
			}
			public String getNewDob() {
				return newDob;
			}
			public void setNewDob(String newDob) {
				this.newDob = newDob;
			}
			public Department getNewDepartment() {
				return newDepartment;
			}
			public void setNewDepartment(Department newDepartment) {
				this.newDepartment = newDepartment;
			}
			public Professor getNewAdvisor() {
				return newAdvisor;
			}
			public void setNewAdvisor(Professor newAdvisor) {
				this.newAdvisor = newAdvisor;
			}
			public Course[] getNewCourse() {
				return newCourse;
			}
			public void setNewCourse(Course[] newCourse) {
				this.newCourse = newCourse;
			}

			
			
/*		public String getNo(String newNo, String No) {
		  //this.no = newNo;
			this.newNo = No;
			return No;
		}
		public void setNo(String newNo, String No) {
			this.newNo = No;
		}
		public String getName(String newName, String Name) {
			this.newName = Name;
			return Name;
		}
		public void setName(String newName, String Name) {
			this.newName = Name;
		}
*/		
		}

		class Professor{
			String no;
		    String name;
		    String dob;
		    String rank;
		    Department department;
		    Student[] advisee;
		    Course[] coursesGiven;
		
		Professor(String newNo, String newName, String newDob, String newRank, Department newDepartment,
				Student[] newAdvisee, Course[] newCoursesGiven){
			no = newNo;
			name = newName;
			dob = newDob;
			rank = newRank;
			department = newDepartment;
			advisee = newAdvisee;
			coursesGiven = newCoursesGiven;
		}
		    String newNo;
		    String newName;
		    String newDob;
		    String newRank;
		    Department newDepartment;
		    Student[] newAdvisee;
		    Course[] newCoursesGiven;

			public String getNewNo() {
				return newNo;
			}
			public void setNewNo(String newNo) {
				this.newNo = newNo;
			}
			public String getNewName() {
				return newName;
			}
			public void setNewName(String newName) {
				this.newName = newName;
			}
			public String getNewDob() {
				return newDob;
			}
			public void setNewDob(String newDob) {
				this.newDob = newDob;
			}
			public String getNewRank() {
				return newRank;
			}
			public void setNewRank(String newRank) {
				this.newRank = newRank;
			}
			public Department getNewDepartment() {
				return newDepartment;
			}
			public void setNewDepartment(Department newDepartment) {
				this.newDepartment = newDepartment;
			}
			public Student[] getNewAdvisee() {
				return newAdvisee;
			}
			public void setNewAdvisee(Student[] newAdvisee) {
				this.newAdvisee = newAdvisee;
			}
			public Course[] getNewCoursesGiven() {
				return newCoursesGiven;
			}
			public void setNewCoursesGiven(Course[] newCoursesGiven) {
				this.newCoursesGiven = newCoursesGiven;
			}
		}
		
		
		class Department{
			private String name;
			Professor head;
			Course[] courses;
			Student[] students;
			
			Department (String newName, Professor newHead, Course[] newCourses, Student[] newStudents){
				name = newName;
				head = newHead;
				courses = newCourses;
				students = newStudents;
			}
			
			String newName;
			Professor newHead;
			Course[] newCourses;
			Student[] newStudents;

			public String getNewName() {
				return newName;
			}
			public void setNewName(String newName) {
				this.newName = newName;
			}
			public Professor getNewHead() {
				return newHead;
			}
			public void setNewHead(Professor newHead) {
				this.newHead = newHead;
			}
			public Course[] getNewCourses() {
				return newCourses;
			}
			public void setNewCourses(Course[] newCourses) {
				this.newCourses = newCourses;
			}
			public Student[] getNewStudents() {
				return newStudents;
			}
			public void setNewStudents(Student[] newStudents) {
				this.newStudents = newStudents;
			}
		}
		
		class Classroom {
			int no;
			String name;
			int capacity;
			Object belongsTo;
			
			Classroom (int newNo, String newName, int newCapacity, Object newBelongsTo){
				no = newNo;
				name = newName;
				capacity = newCapacity;
				belongsTo = newBelongsTo;
			}
			
			
					
			int newNo;
			String newName;
			int newCapacity;
			Object newBelongsTo;

			public int getNewNo() {
				return newNo;
			}
			public void setNewNo(int newNo) {
				this.newNo = newNo;
			}
			public String getNewName() {
				return newName;
			}
			public void setNewName(String newName) {
				this.newName = newName;
			}
			public int getNewCapacity() {
				return newCapacity;
			}
			public void setNewCapacity(int newCapacity) {
				this.newCapacity = newCapacity;
			}
			public Object getNewBelongsTo() {
				return newBelongsTo;
			}
			public void setNewBelongsTo(Object newBelongsTo) {
				this.newBelongsTo = newBelongsTo;
			}			
		}
		
		class Course {
			String code;
		    String name;
		    Department department;
		    Professor teacher;
		    Student[] students;
		    String[] days;
		    Date time;
		    Classroom givenIn;
		    
		    Course (String newCode, String newName, Department newDepartments, Professor newTeachers, 
		    		Student[] newStudents, String[] newDays, Date newTime, Classroom newGivenIn) {
		    	code = newCode;
		    	name = newName;
		    	department = newDepartments;
		    	teacher = newTeachers;
		    	students = newStudents;
		    	days = newDays;
		    	time = newTime;
		    	givenIn = newGivenIn;
		    }
		    

//		    Classroom class1 = new Classroom(1,"class1", 50, course1);
			
//			Classroom class2 = new Classroom();
			
//			Classroom class3 = new Classroom();
			
		    
//		    Course course1 = new Course ("CS101", "Int. to Software Engineering", "ComputerEngineering", "AkınKaldıroglu", 
//		    		50,  "Mon-Tue-Wed", 11.30-12.30, class1);
		  
//		    Course course2 = new Course ("PHIL 101", "Ethics", "Philosophy");
		  
//		    Course course3 = new Course ();
		  
		//course1 name :Int.to Software Engineering
		// course2 name : Ethics
	    // course3 name : Onthology

		    
		    
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 }
}


