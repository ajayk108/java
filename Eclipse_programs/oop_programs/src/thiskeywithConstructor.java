
public class thiskeywithConstructor {
	
	int num;
	thiskeywithConstructor()
	{}
	thiskeywithConstructor(int num)
	{
		this.num = num;
	}

	public static void main(String[] args) {

		thiskeywithConstructor th = new thiskeywithConstructor(10);
		
		System.out.println("the num value is: "+th.num);
	}

}
