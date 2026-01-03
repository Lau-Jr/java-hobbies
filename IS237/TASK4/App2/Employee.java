import java.time.LocalDate;

public class Employee{
	
	private String name;
	private int age;
	private double salary;
	
	public Employee(String name, int year, double salary){
		
		this.name = name;
		this.age = calculateAge(year);
		this.salary = salary;
		
	}
	
	public void setAge(int year){
		this.age = calculateAge(year);
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}	
	
	private int calculateAge(int year){
		LocalDate now = LocalDate.now();
		return now.getYear() - year;
	}

	@Override
	public String toString() {

        return String.format("{Name:%s,Salary:%.2f,Age:%d}",getName(),getSalary(),getAge());
	}
}