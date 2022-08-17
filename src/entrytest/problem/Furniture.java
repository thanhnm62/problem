package entrytest.problem;

import java.util.Scanner;

public class Furniture extends Thing {
	private String material;
	private String origin;

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public Furniture() {
		
	}
	public Furniture(String material, String origin) {
		super();
		this.material = material;
		this.origin = origin;
	}
	
	@Override
	public String getDescription() {
		
		return null;
	}
	
	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chất liệu: ");
		material = sc.nextLine();
		System.out.println("Nhập xuất xứ: ");
		origin = sc.nextLine();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Chất liệu: "+ material );
		System.out.println("Xuất xứ: "+ origin);
	}
}
