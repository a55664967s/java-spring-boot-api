package com.example.API.product;
public class phone{
    private String name;
    private int price;
	public phone(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public String getname() {
		return name;
	}
    public void setname(String name) {
        this.name = name;
      }
	public int getprice() {
		return price;
	}
    public void setprice(int price) {
        this.price = price;
      }
}