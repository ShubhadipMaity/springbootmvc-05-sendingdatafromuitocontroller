package in.shuba.entity;

public class Employee {
	private Integer empNo;
	private String empName;
	private Double empSal;
	
	
	static {
		System.out.println("Employee.class is loaded....");
	}
	

	public Employee() {
		System.out.println("Employee Object is Created....");
	}


	public Integer getEmpNo() {
		System.out.println("Employee.getEmpId");
		return empNo;
	}


	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
		System.out.println("Employee.setEmpId");
	}


	public String getEmpName() {
		System.out.println("Employee.getEmpName");
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
		System.out.println("Employee.setEmpName");

	}


	public Double getEmpSal() {
		System.out.println("Employee.getEmpSal");
		return empSal;
	}


	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
		System.out.println("Employee.setEmpSal");

	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
