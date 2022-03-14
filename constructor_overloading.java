package OppsConcept;

class Employee
{
	int empid;
	String name, city, state, country;
	long phno;
	double salary;
	
	public Employee(int empid, String name, double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		
	}
	
	public Employee(int empid, String name, double salary, long phno, String city )
	{
		this(empid,name,salary);		//this is constructor  here for calling above 1st employee constructor
			this.phno=phno;
			this.city=city;
				
	}
	
	public Employee(int empid, String name, double salary, long phno, String city, String state, String country)
	{
		this(empid,name,salary,phno,city);		//this is constructor  here for calling above 2nd employee constructor
		this.state=state;
		this.country=country;
	}

	public int getEmpid() {
		return empid;
	}

		public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public long getPhno() {
		return phno;
	}


	public double getSalary() {
		return salary;
	}

}

public class constructor_overloading {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Sujata", 60000, 862507, "Nagpur", "Maharashtra", "india");

		System.out.println(" "+e1.getEmpid()+" "+e1.getName()+" "+e1.getSalary()+" "+e1.getPhno()+" "+e1.getCity()+" "
		+e1.getState()+" "+e1.getCountry());

		Employee e2 = new Employee(102, "Sachin", 50000, 897563, "Nagpur", "Maharashtra", "india");

		System.out.println(" "+e2.getEmpid()+" "+e2.getName()+" "+e2.getSalary()+" "+e2.getPhno()+" "+e2.getCity()+" "
		+e2.getState()+" "+e2.getCountry());
	}

	
	
}
