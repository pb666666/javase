
public class Person {
	//����
	private String name;
	//����
	private int age;
	//��������
	static String cityName;
	
	//����ֵ
	public void setAge(int age)
	{
		if (age>0&&age<=300)
		{
			this.age=age;
		}
		else
		{
			System.out.println("�������䲻�Ϸ�");
		}
	}
	//��ȡֵ
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
