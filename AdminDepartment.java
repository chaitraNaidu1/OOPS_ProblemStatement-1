package model;

public class AdminDepartment extends SuperDepartment  {

	private String DepartmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String isTodayAHoliday;

	public AdminDepartment() {

	}

	public AdminDepartment(String DepartmentName, String getTodaysWork, String getWorkDeadline, String isTodayAHoliday) {
		this.DepartmentName = DepartmentName;
		this.getTodaysWork  =  getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
		this.isTodayAHoliday = isTodayAHoliday;

	}

	public String getGetTodaysWork() {
		return getTodaysWork;
	}

	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}

	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}

	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}

	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}

	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	@Override
	public String toString() {
		return "AdminDepartment [DepartmentName=" + DepartmentName + ", getTodaysWork=" + getTodaysWork
				+ ", getWorkDeadline=" + getWorkDeadline + ", isTodayAHoliday=" + isTodayAHoliday
				+ ", getGetTodaysWork()=" + getGetTodaysWork() + ", getGetWorkDeadline()=" + getGetWorkDeadline()
				+ ", getIsTodayAHoliday()=" + getIsTodayAHoliday() + ", getDepartmentName()=" + getDepartmentName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
