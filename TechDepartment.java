package model;

public class TechDepartment extends SuperDepartment {
	private String DepartmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String getStackInformation;
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
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
	public String getGetStackInformation() {
		return getStackInformation;
	}
	public void setGetStackInformation(String getStackInformation) {
		this.getStackInformation = getStackInformation;
	}
	@Override
	public String toString() {
		return "TechDepartment [DepartmentName=" + DepartmentName + ", getTodaysWork=" + getTodaysWork
				+ ", getWorkDeadline=" + getWorkDeadline + ", getStackInformation=" + getStackInformation
				+ ", getDepartmentName()=" + getDepartmentName() + ", getGetTodaysWork()=" + getGetTodaysWork()
				+ ", getGetWorkDeadline()=" + getGetWorkDeadline() + ", getGetStackInformation()="
				+ getGetStackInformation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
