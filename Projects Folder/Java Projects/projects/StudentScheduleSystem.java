package projects;
import java.util.*;

/**
 * @author Bronco SSB
 */

public class StudentScheduleSystem {
	
	static Scanner in = new Scanner(System.in);
	static String name;
	static String major;

	public static void main(String[] args) {
		
		StudentInfo();
		ListOfCoursesIT();
		
	}

	public static void StudentInfo() {
		System.out.println("Enter the student's full name:");
		name = in.nextLine();
		System.out.println("Enter the student's date of birth (ex. 02/20/2020 or February 20, 2020): ");
		String dob = in.nextLine();
		System.out.println("Enter the student's school year (ex. Year 4 or 4 years): ");
		String year = in.nextLine();
		System.out.println("Enter " + name + "'s major:");
		major = in.nextLine();
		System.out.println("------------------------------------------------------------");
		System.out.println("STUDENT INFORMATION\n");
		System.out.println("Name: " + name);
		System.out.println("Date of Birth: " + dob);
		System.out.println("School Year: " + year);
		System.out.println("Major: " + major);
		System.out.println("------------------------------------------------------------");
	}
	
	public static void ListOfCoursesIT() {
		System.out.println("------------------------------------------------------------");
		System.out.println(major.toUpperCase() + " required courses: \n");
		
		String cus_code1 = "CUS 1110";
		String cus_class1 = "Intro to Data Analytics";
		String cus_code2 = "CUS 1115";
		String cus_class2 = "Computer Programming I";
		String cus_code3 = "CUS 1116";
		String cus_class3 = "Computer Programming II";
		String cus_code4 = "CUS 1150";
		String cus_class4 = "Systems Programming in Linux";
		String cus_code5 = "CUS 1165";
		String cus_class5 = "Database Management Systems";
		String cus_code6 = "CUS 1167";
		String cus_class6 = "Systems Analysis";
		String cus_code7 = "CUS 1172";
		String cus_class7 = "Web Application Development";
		String cus_code8 = "CSS 1005";
		String cus_class8 = "Fundamentals of Cyber Security";
		String cus_code9 = "IT 1011";
		String cus_class9 = "Information Technology for Business";
		String cus_code10 = "NET 1011";
		String cus_class10 = "Introduction to Networking";
		String elective1 = "CUS 1100";
		String elective_class1 = "Introduction to Game Development";
		String elective2 = "CUS 1126";
		String elective_class2 = "Introduction to Data Structures";
		String elective3 = "CUS 1176";
		String elective_class3 = "Electronic Commerce";
		String elective4 = "CUS 1179";
		String elective_class4 = "Data Mining";
		String elective5 = "CUS 1194";
		String elective_class5 = "SPEC Topics in Computer Science";
		String elective6 = "CSS 1001";
		String elective_class6 = "Introduction to Information Security";
		String elective7 = "HCI 1002";
		String elective_class7 = "Healthcare Information and Data Management";
		
		System.out.println(cus_code1 + " - " + cus_class1.toUpperCase());
		System.out.println(cus_code2 + " - " + cus_class2.toUpperCase());
		System.out.println(cus_code3 + " - " + cus_class3.toUpperCase());
		System.out.println(cus_code4 + " - " + cus_class4.toUpperCase());
		System.out.println(cus_code5 + " - " + cus_class5.toUpperCase());
		System.out.println(cus_code6 + " - " + cus_class6.toUpperCase());
		System.out.println(cus_code7 + " - " + cus_class7.toUpperCase());
		System.out.println(cus_code8 + " - " + cus_class8.toUpperCase());
		System.out.println(cus_code9 + " - " + cus_class9.toUpperCase());
		System.out.println(cus_code10 + " - " + cus_class10.toUpperCase());
		
		System.out.println("\nMajor Area Electives: ");
		System.out.println(elective1 + " - " + elective_class1);
		System.out.println(elective2 + " - " + elective_class2);
		System.out.println(elective3 + " - " + elective_class3);
		System.out.println(elective4 + " - " + elective_class4);
		System.out.println(elective5 + " - " + elective_class5);
		System.out.println(elective6 + " - " + elective_class6);
		System.out.println(elective7 + " - " + elective_class7);
		
	}
	
}
