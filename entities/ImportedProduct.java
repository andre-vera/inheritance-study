package entities;

public class ImportedProduct extends Product {
	public Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override	
	public String priceTag() {
		System.out.println(name + " $" + price + " (Customs fee: $" + customsFee + ")");
		return null;
	}
}
