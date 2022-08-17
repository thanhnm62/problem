package entrytest.problem;

import java.util.Scanner;

public class BookOnTape extends Thing {
	private String author;

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
public BookOnTape() {
		
	}
	public BookOnTape(String author) {
		super();
		this.author = author;
	}
	
	@Override
	public String getDescription() {
		
		return null;
	}
	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên tác giả: ");
		author = sc.nextLine();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Tên tác giả: "+ author);
	}
}
