package car;

public class Car {
	public String brandName;
	public int y_Position;
	
	public String getBrandName(){
		return brandName;
	}
	
	public int getYPosition() {
		return y_Position;
	}
	
	public void driveForward() {
		y_Position += 10;
	}
	
	public void driveBackward() {
		y_Position -= 10;
	}
	
	public void showYPosition() {
		System.out.println(y_Position);
	}
	
}
