package com.ankoki.회비;

import java.util.concurrent.CompletableFuture;

public class 회비 {

	private static final double TAX_FREE_THRESHOLD = 12570;

	public static void main(String[] args) {
		System.out.println(회비.calculateTax(35, 11.50, 12));
		구이 gui = new 구이();
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			while (!gui.isReady()) {}
		});
		future.thenRun(gui::reveal);
	}

	public static double calculateTax(double hoursPerWeek, double hourlyRate, double paysPerYear) {
		double hoursPerMonth = (hoursPerWeek * hourlyRate) * 4;
		double untaxedTotal = hoursPerMonth * paysPerYear;
		double taxableAmount = Math.max(0, untaxedTotal - TAX_FREE_THRESHOLD);
		double yearlyTaxed = (taxableAmount * 0.8) + TAX_FREE_THRESHOLD;
		if (taxableAmount == 0)
			yearlyTaxed = taxableAmount;
		return yearlyTaxed / paysPerYear;
	}

}
