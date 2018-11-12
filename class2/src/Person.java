
public class Person {
	//姓名
	private String name;
	//年龄
	private int age;
	//城市名称
	static String cityName;
	
	//设置值
	public void setAge(int age)
	{
		if (age>0&&age<=300)
		{
			this.age=age;
		}
		else
		{
			System.out.println("您的年龄不合法");
		}
	}
	//获取值
	public int getAge()
	{
		if(this.age>0&&this.age<=300)
		{
			return this.age;
		}
		else
		{
			return 0;
		}
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	

}
