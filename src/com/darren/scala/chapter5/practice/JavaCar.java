package com.darren.scala.chapter5.practice;

//number9
class JavaCar {
	private final String vendor;
	private final String model;
	private final int date;
	private String card;

	public JavaCar(String vendor, String model, int date, String card) {
		this.vendor = vendor;
		this.model = model;
		this.date = date;
		this.card = card;
	}

	public JavaCar(String vendor, String model, int date) {
		this(vendor, model, date, "");
	}

	public JavaCar(String vendor, String model, String card) {
		this(vendor, model, -1, card);
	}

	public JavaCar(String vendor, String model) {
		this(vendor, model, -1);
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getVendor() {
		return vendor;
	}

	public String getModel() {
		return model;
	}

	public int getDate() {
		return date;
	}

}