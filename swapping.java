package mypack;

public class swapping {
	public static void main(String[] args) {
		int x=110,y=220;
		System.out.println("---before swap---");
		System.out.println("number1= "+x);
		System.out.println("number2="+y);
		x=x-y;
		y=x+y;
		x=y-x;
				System.out.println("---after swap---");
				System.out.println("number1= "+x);
				System.out.println("number2="+y);		
				
		
	}

}
