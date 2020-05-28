package entities;

public class PhysicalPerson extends TaxPayer {
	private double healthSpending;

	public PhysicalPerson() {
	}

	public PhysicalPerson(String name, double annualIncome, double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}
	
	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double taxToPay() {
		if (annualIncome < 20000) {
			return (annualIncome * 0.15) - (healthSpending * 0.5);
		}
		else {
			return (annualIncome * 0.25) - (healthSpending * 0.5);
		}
	}
	
	
}
