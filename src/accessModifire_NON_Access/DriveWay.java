package accessModifire_NON_Access;

public class DriveWay {
	
	int width = 10;
	static int length;
	
	//
	public static int getLength() {
		return length;
	}
	public static void setLength(int length) {
		DriveWay.length = length;
	}
	public static void lengthOfDriveWay(int myLength) {
		length = myLength;
		
	}
public void widthOfDriveWay() {
	System.out.println("Width of DriveWay: " +width);
	System.out.println("Length of DriveWay: " +length);
	}
}







//Static 
//Static method can use only static attributes;
//Static attributes can use in static and  non-static,
//But not static attributes can not use in static,
//
//Static attributes  is belong with class, 
//Non-Static attributes  is belong with object
//
