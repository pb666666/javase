
public class Emp1 {
	//Ա������
	String name;
	//Ա������
	double salary;
	// ������ͨ����������ҵ���ʵ��
		//ʵ�ּ�н
	void addSalary()
	{
		double addsal=500;
		
		salary=salary+addsal;
		System.out.println("���Ա������:"+name+",����:"+addsal+",���ڵĹ�����:"+salary);
		
	}
  
	public static void main(String[] args) {
		
		Emp1 t1=new Emp1();
	}
}
