class vehical
{
	int myspeed = 50;
}
class car extends vehical
{
	int myspeed =60;
	
	void display() 
	{
		
		int myspeed = 30;
		System.out.println("display() speed is:"+myspeed);
		System.out.println("car class speed is:"+this.myspeed);
		System.out.println("vehical speed is:"+super.myspeed);
	}
}

public class super1 {

	public static void main(String[] args) {
		
		car obj = new car();
				
		obj.display();
		
	}

}
