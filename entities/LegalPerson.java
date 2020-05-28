package entities;

public class LegalPerson extends TaxPayer {
	protected double numberOfEmployees;
	
	public LegalPerson() {
	}

	public LegalPerson(String name, double annualIncome, double numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public double getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(double numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double taxToPay() {
		if (numberOfEmployees > 10) {
			return annualIncome * 0.14;
		} else {
			return annualIncome * 0.16;
		}
	}

}
