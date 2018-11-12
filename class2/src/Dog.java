
public class Dog {
	//狗的颜色
	private String color;
	//所有的狗都喜欢吃骨头 所以是静态
	public static void eat()
	{
		System.out.println("狗都喜欢吃骨头");
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return this.color;
	}

}
