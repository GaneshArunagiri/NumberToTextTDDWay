package com.spark.enums;

public enum PromoRules {

	A(3, 130), B(2, 45);

	private int promoQTY;
	private int promoPrice;

	PromoRules(int qty, int proPrice) {
		this.setPromoQTY(qty);
		this.setPromoPrice(proPrice);
	}

	public int getPromoQTY() {
		return promoQTY;
	}

	public void setPromoQTY(int promoQTY) {
		this.promoQTY = promoQTY;
	}

	public int getPromoPrice() {
		return promoPrice;
	}

	public void setPromoPrice(int promoPrice) {
		this.promoPrice = promoPrice;
	}

}
