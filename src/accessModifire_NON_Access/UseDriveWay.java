package accessModifire_NON_Access;

public class UseDriveWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriveWay myDriveWay = new DriveWay();
	
		myDriveWay.setLength(50);
		System.out.println(myDriveWay.getLength());
		DriveWay neighborDriveWay = new DriveWay();
		neighborDriveWay.setLength(20);
		
		System.out.println("Neighbour DriveWay " + neighborDriveWay.getLength());
//		neighborDriveWay.lengthOfDriveWay();
//		neighborDriveWay.widthOfDriveWay();
		
	}

}
