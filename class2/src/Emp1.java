
public class Emp1 {
	//员工姓名
	String name;
	//员工工资
	double salary;
	// 方法，通过方法进行业务的实现
		//实现加薪
	void addSalary()
	{
		double addsal=500;
		
		salary=salary+addsal;
		System.out.println("这个员工叫做:"+name+",加了:"+addsal+",现在的工资是:"+salary);
		
	}
  
	public static void main(String[] args) {
		
		Emp1 t1=new Emp1();
	}
}
