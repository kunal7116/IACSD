package com.app.customer;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(3000), PLATINUM(5000);

	private int charges;

	ServicePlan(int charges) {
		this.charges = charges;
	}

	public int getCharges() {
		return charges;
	}

}
