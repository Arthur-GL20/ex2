package entities;

public class salary {
	public String name;
	public double GrossSalary;
	public double Tax;
	
	
	public double NetSalary() {
		return GrossSalary-Tax;		
	}
	
	public void increaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage/100;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", NetSalary());
	}
	

}
