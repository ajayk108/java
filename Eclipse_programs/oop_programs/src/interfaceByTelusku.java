
interface Drawable
{
	void draw();
}
class Rectangles implements Drawable
{
	public void draw()
	{
		System.out.println("drawing Rectangle...");
	}
}
class Circles implements Drawable
{
	public void draw()
	{
		System.out.println("drawing Circle....");
	}
}

public class interfaceByTelusku {

	public static void main(String[] args) {
		
		Drawable d = new Rectangles();
		Drawable d2 = new Circles();
		d.draw();
		d2.draw();
	}

}
