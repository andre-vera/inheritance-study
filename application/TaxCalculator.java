package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.TaxPayer;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (c == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healthSpending));
			}
			else if (c == 'c') {
				System.out.print("Number of employees in your company: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new LegalPerson(name, annualIncome, numberOfEmployees));
			}	
		}
		
		System.out.println("TAXES PAID: ");
		double totalTaxes = 0.0;
		for (TaxPayer t : list) {
			System.out.println(t.getName() + ": $" + String.format("%.2f", t.taxToPay()));
			totalTaxes += t.taxToPay();
		}
		
		System.out.printf("Total taxes: %.2f", totalTaxes);
		sc.close();
	}

}
