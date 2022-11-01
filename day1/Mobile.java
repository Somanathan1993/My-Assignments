package week1.day1;

public class Mobile {
	
	private void makeCall() {
		
		String MobileModel="oppo";
		float MobileWeight=172f;

	System.out.println("makeCall");
		
	}
	
	private void sendMsg() {
		
		boolean isFullyCharged=true;
		int MobileCost=40000;
		
		System.out.println("sendMsg");
		

	}
	
	public static void main(String[] args) {
		
		Mobile obj= new Mobile();
		
		obj.makeCall();
		obj.sendMsg();
		
		System.out.println("This is my mobile");
		
	}
	
	
}

	