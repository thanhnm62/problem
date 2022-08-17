package entrytest.problem;

import java.util.Scanner;

public abstract class Thing {
	private String serialNumber;
	private String name;
	private float cost;
	private String type;
	
	public abstract String getDescription ();
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Thing() {
		
	}
	public Thing(String serialNumber, String name, float cost, String type) {
		super();
		this.serialNumber = serialNumber;
		this.name = name;
		this.cost = cost;
		this.type = type;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số serie");
		serialNumber = sc.nextLine();
		System.out.println("Nhập tên:");
		name = sc.nextLine();
		System.out.println("Nhập giá cho thuê: ");
		cost = Float.parseFloat(sc.nextLine()); 
		System.out.println("Nhập thể loại:");
		type = sc.nextLine();
		
	}
	public void display() {
		System.out.println("Số serie: "+ serialNumber);
		System.out.println("Tên sản phẩm: "+ name);
		System.out.println("Thể loại: "+ type);
		System.out.println("Giá cho thuê: "+ cost);
	}
}
