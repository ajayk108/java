
class Parent
{
	void show()
	{
		System.out.println("parent class");
	}
}
class Child extends Parent
{
	void show()
	{
		System.out.println("child class");
	}
	void showData()
	{
		System.out.println("child showData fun");
	}
}
public class upVSdownCasting {

	public static void main(String[] args) {
		
		Parent obj = new Child(); //UpCasting..
		obj.show();
		//obj.showData(); //it will give us an error because the object we have created
						  //is of parent shoData is the fun of Child which is unique not 
						  // overridden the parent object will access only those fun which 
						  //it has in its class
		
		if( obj instanceof Child)
		{
		Child obj2 = (Child)obj;	//down Casting...
		obj2.showData();
		}
		
	}

}
