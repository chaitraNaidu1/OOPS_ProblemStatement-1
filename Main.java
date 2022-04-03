package driver;

import java.util.Scanner;

import model.AdminDepartment;
import model.HrDepartment;
import model.SuperDepartment;
import model.TechDepartment;


public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your department");
		System.out.println("1.Super Dept \n2. Admin Dept \n3.HR Dept\n4.Tech Dept");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		@SuppressWarnings("unused")
		SuperDepartment S=new SuperDepartment();
		@SuppressWarnings("unused")
		AdminDepartment A = new AdminDepartment();
		@SuppressWarnings("unused")
		HrDepartment H = new HrDepartment();
		@SuppressWarnings("unused")
		TechDepartment T=new TechDepartment();// TODO Auto-generated constructor stub
		switch (choice) {
		case 1: 
			S.setDepartmentName("Welcome to Admin Department");
            S.setGetTodaysWork("Complete your Documents Submission");
            S.setGetWorkDeadline("Complete by EOD");
			break;
		case 2:
            A.setDepartmentName("Welcome to Admin Department");
            A.setGetTodaysWork("Complete your Documents Submission");
            A.setGetWorkDeadline("Complete by EOD");
			break;
		case 3:
			 H.setDepartmentName("Welcome to HR Department");
	            H.setGetTodaysWork("Fill marks sheet & mark attendence");
	            H.setGetWorkDeadline("Complete by EOD");
	            H.setIsTodayAHoliday("Team lunch");
				break;
		case 4: 
			T.setDepartmentName("Welcome to Tech Department");
			T.setGetTodaysWork("COmplete Coding module");
			T.setGetWorkDeadline("Complete by EOD");
			T.setGetStackInformation("Core JAVA");
		
	
	}
	}
}


