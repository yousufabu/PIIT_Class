package classObjectConstractor;

public class House {

	int numOfRoom = 4;
	String color = "white";

	// Constructor//
	House() {

	}

	House(int myNumberOfRoom) {
		numOfRoom = myNumberOfRoom;

	}
	

	void kitchen() {
		System.out.println("Yuammy");
	}

	void room() {
		System.out.println("ZZZZZZ");
		System.out.println("num of rom");
	}

	void bathRoom() {

		System.out.println("Lalalalal");
	}

}
