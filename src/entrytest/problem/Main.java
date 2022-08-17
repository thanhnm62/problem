package entrytest.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Thing> thingList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int chose;
		do {
			showMenu();
			chose = Integer.parseInt(sc.nextLine());
			switch (chose) {
			case 1:
				inputData();
				break;
			case 2:
				showData();
				break;	
			case 3:
				showDataFurniture();;
				break;
			case 4:
				System.out.println("Chương trình đã thoát");
				break;
			default:
				System.out.println("Nhập sai");
				break;
			}
		} while (chose != 4);

	}

	private static void search() {

	}

	private static void showData() {
		for (Thing thing : thingList) {
			System.out.println("------------------------------");
			thing.display();
		}
	}

	private static void showDataFurniture() {
		System.out.println("Mặt hàng Furniture:");
		for (Thing thing : thingList) {
			if (thing instanceof Furniture) {
				System.out.println("------------------------------");
				thing.display();
			}
		}
	}

	private static void inputData() {
		System.out.println("Nhập số lượng mặt hàng cần thêm:");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Thing thing = createThing();
			thingList.add(thing);
		}

	}

	static Thing createThing() {
		Thing thing = null;
		System.out.println("Chọn mặt hàng cần thêm:");
		System.out.println("1.Video");
		System.out.println("2.Book On Tape");
		System.out.println("3.Furniture");

		int chose = Integer.parseInt(sc.nextLine());

		switch (chose) {
		case 1:
			thing = new Video();
			break;
		case 2:
			thing = new BookOnTape();
			break;
		default:
			thing = new Furniture();
			;
			break;
		}
		thing.input();
		return thing;
	}

	static void showMenu() {
		System.out.println("1.Nhập thông tin mặt hàng:");
		System.out.println("2.Hiển thị tất cả các mặt hàng:");
		System.out.println("2.Hiển thị mặt hàng Furniture:");
		System.out.println("4.Thoát");

	}
}
