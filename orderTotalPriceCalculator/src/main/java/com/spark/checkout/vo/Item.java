package com.spark.checkout.vo;

import com.spark.enums.ProductPrice;
import com.spark.enums.PromoRules;

public class Item {

	String name;
	int price;
	private int itemQty;
	int promoQty;
	int promoPrice;

	public Item(String product, int quantity) {
		this.name = product;
		this.setItemQty(quantity);
		setPrice();
		setPromoValues();

	}

	private void setPromoValues() {
		for (PromoRules c : PromoRules.values()) {
			if (c.name().equals(this.name)) {
				this.promoPrice = c.getPromoPrice();
				this.promoQty = c.getPromoQTY();
			}
		}
	}

	private boolean isPriceAvailable() {
		for (ProductPrice c : ProductPrice.values()) {
			if (c.name().equals(this.name)) {
				return true;
			}
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice() {
		if (isPriceAvailable()) {
			ProductPrice prdPrice = ProductPrice.valueOf(this.name);
			this.price = prdPrice.getPrice();
		}
	}

	public int getPromoQty() {
		return promoQty;
	}

	public int getPromoPrice() {
		return promoPrice;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

}
