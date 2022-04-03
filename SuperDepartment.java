package model;

public class SuperDepartment {
	public String DepartmentName;
	public String getTodaysWork;
	public String getWorkDeadline;
	public String isTodayaHoliday;

	
	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String DepartmentName) {
		this.DepartmentName = DepartmentName;
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

	public String getIsTodayaHoliday() {
		return isTodayaHoliday;
	}

	public void setIsTodayaHoliday(String isTodayaHoliday) {
		this.isTodayaHoliday = isTodayaHoliday;
	}

	@Override
	public String toString() {
		return "SuperDepartment [DepartmentName=" + DepartmentName + ", getTodaysWork=" + getTodaysWork
				+ ", getWorkDeadline=" + getWorkDeadline + ", isTodayaHoliday=" + isTodayaHoliday
				+ ", getDepartmentName()=" + getDepartmentName() + ", getGetTodaysWork()=" + getGetTodaysWork()
				+ ", getGetWorkDeadline()=" + getGetWorkDeadline() + ", getIsTodayaHoliday()=" + getIsTodayaHoliday()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
