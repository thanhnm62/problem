package entrytest.problem;

import java.util.Scanner;

public class Video extends Thing {
	private String quality;


	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	public Video() {

	}
	public Video(String quality) {
		super();
		this.quality = quality;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void input() {	
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chất lượng video");
		quality = sc.nextLine();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Chất lượng video: "+ quality);
	}
}
