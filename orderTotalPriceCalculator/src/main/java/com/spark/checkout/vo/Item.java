package com.spark.checkout.vo;

public class Item {
	
	String name;
	int price;
	private int itemQty;
	int promoQty;
	int promoPrice;
	
	public Item(String product, int quantity) {
		this.name=product;
		this.setItemQty(quantity);
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
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPromoQty() {
		return promoQty;
	}
	public void setPromoQty(int promoQty) {
		this.promoQty = promoQty;
	}
	public int getPromoPrice() {
		return promoPrice;
	}
	public void setPromoPrice(int promoPrice) {
		this.promoPrice = promoPrice;
	}
	public int getItemQty() {
		return itemQty;
	}
	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

}
