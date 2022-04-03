package model;

public class HrDepartment extends SuperDepartment  {

		private String DepartmentName;
		private String getTodaysWork;
		private String getWorkDeadline;
		private String doActivity;

		public HrDepartment() {

		}

		public HrDepartment(String DepartmentName, String getTodaysWork, String getWorkDeadline, String doActivity) {
			this.DepartmentName = DepartmentName;
			this.getTodaysWork  =  getTodaysWork;
			this.getWorkDeadline = getWorkDeadline;
			this.doActivity = doActivity;

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

		public String getdoActivity() {
			return doActivity ;
		}

		public void setIsTodayAHoliday(String doActivity) {
			this.doActivity= doActivity;
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
					+ ", getWorkDeadline=" + getWorkDeadline + ", isTodayAHoliday=" + doActivity
					+ ", getGetTodaysWork()=" + getGetTodaysWork() + ", getGetWorkDeadline()=" + getGetWorkDeadline()
					+ ", getIsTodayAHoliday()=" + getdoActivity() + ", getDepartmentName()=" + getDepartmentName()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

		
		

	}


