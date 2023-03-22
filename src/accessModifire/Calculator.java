package accessModifire;

public class Calculator {

	public int apple =5;
	protected int ball =4;
	private int cat =3;
	 int doll=1;
	 
	 public void apple() {
		 System.out.println("apple from public");
	 }
	 
	 protected void ball() {
		 System.out.println("Ball from protected");
		 
	 }
	 private void cat() {
		 System.out.println("Cat from Private");
	 }
	 void doll() {
		 System.out.println("void default from void");
	 }
}
