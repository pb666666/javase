
public class Stu1 {
	
	//学生姓名
	String name;
	//学生年龄
	byte age;
	
	//学校名字
	static String schoolname;
	//学生数量
	static int count;
	
	 public static void main(String[] args) {
		schoolname="南科院";
		Stu1 one=new Stu1();
		one.name="彭大";
		one.age=20;
		System.out.println(one.schoolname);
		
		Stu1 two=new Stu1();
		two.name="彭二";
		two.age=21;
		System.out.println(two.schoolname);
		
		one.schoolname="南科大";
		System.out.println(two.schoolname);
		System.out.println(one.schoolname);
		
		
		
	}

}
