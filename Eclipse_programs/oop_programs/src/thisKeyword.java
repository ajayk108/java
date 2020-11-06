
public class thisKeyword {
	
	int num;
	public void setNum(int num)
	{
		this.num = num;
	}

	public static void main(String[] args) {
		
		thisKeyword obj = new thisKeyword();
		obj.setNum(10);
		
		System.out.println("value of Num is: "+obj.num);
		
	}

}
