
public class Stu1 {
	
	//ѧ������
	String name;
	//ѧ������
	byte age;
	
	//ѧУ����
	static String schoolname;
	//ѧ������
	static int count;
	
	 public static void main(String[] args) {
		schoolname="�Ͽ�Ժ";
		Stu1 one=new Stu1();
		one.name="���";
		one.age=20;
		System.out.println(one.schoolname);
		
		Stu1 two=new Stu1();
		two.name="���";
		two.age=21;
		System.out.println(two.schoolname);
		
		one.schoolname="�Ͽƴ�";
		System.out.println(two.schoolname);
		System.out.println(one.schoolname);
		
		
		
	}

}
