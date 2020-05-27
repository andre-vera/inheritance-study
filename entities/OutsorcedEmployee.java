package entities;

public class OutsorcedEmployee extends Employee {
	double additionalCharge;

	public OutsorcedEmployee(String name, Integer hours, Double valuePerHours, double addiotionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = addiotionalCharge;
	}
	
@Override
	public double payment() {
	return (valuePerHours*hours) + 1.1*additionalCharge;
}
	
	
}
