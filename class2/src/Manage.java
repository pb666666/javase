
public class Manage {
	public static void main(String[] args) {
		Person a1=new Person();
		a1.setName("彭大");
		a1.setAge(20);		
		System.out.println("名字为："+a1.getName()+",年龄为:"+a1.getAge());
		Person.cityName="南京市";
	}

}
