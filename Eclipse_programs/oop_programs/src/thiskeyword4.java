/*
 * constructor chaining.....
 * with thiskeyword....
 */
public class thiskeyword4 {
	
	int rollno;
	String name, cource;
	float fee;
	thiskeyword4(int rollno, String name, String cource)
	{
		this.rollno = rollno;
		this.name = name;
		this.cource = cource;
	}
	thiskeyword4(int rollno, String name, String cource, float fee)
	{
		this(rollno, name, cource); //reusing constructor
		this.fee =  fee;
	}
	void display()
	{
		System.out.println(rollno+"\n"+name+"\n"+cource+"\n"+fee);
	}
	
	public static void main(String[] args) {
		
		thiskeyword4 obj1 = new thiskeyword4(101, "ajay", "java");
		thiskeyword4 obj2 = new thiskeyword4(102, "vijay", "phython", 4000f);
		obj1.display();
		obj2.display();
		

	}

}
