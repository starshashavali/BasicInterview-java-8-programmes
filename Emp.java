package TestDemo;

public class Emp {

	private Integer empId;

	private String name;
	private String address;

	private Double sal;
	private Integer age;

	private String dept;
	private String gender;
	private Integer exp;
	
	public Emp(Integer empId, String name, String address, Double sal, Integer age, String dept, String gender,
			Integer exp) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.sal = sal;
		this.age = age;
		this.dept = dept;
		this.gender = gender;
		this.exp = exp;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", address=" + address + ", sal=" + sal + ", age=" + age
				+ ", dept=" + dept + ", gender=" + gender + ", exp=" + exp + "]";
	}

	
}
