package Methods;

public class House {
	
// class properties 
	// variable
	int roomNumber =5;
	String Color = "White";
	
	// methods
	void kitchen() {
		System.out.println("This is Kithcen");
	}
	String bathroom() {
		return "value";
		
	}
	int bedRoom() {
		int NumOfRoom=5;
		int NumOfKitchen=2;
		int NumOfBathroom=1;
		int totalRooms=  NumOfRoom+NumOfKitchen+NumOfBathroom;
		return totalRooms;
		
	}
	double LivingRoom() {
		return 44444;
		
	}
	char room4() {
		return 'A';
	}
	boolean rooom6() {
		return true;
		
	}
}
