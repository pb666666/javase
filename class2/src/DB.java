
public class DB {
	String host;
	String username;
	String userpwd;
	String ur1;
	
	public void display()
	{
		System.out.println("-----display()------");
	}
  //���캯��
	public  DB(String host,String username,String userpwd,String ur1)
	{
		this.host=host;
		this.username=username;
		this.userpwd=userpwd;
		this.ur1=ur1;
		System.out.println("-----�����в�����DB���캯��");
	}
	DB()
	{
		System.out.println("------����û�в�����DB���캯��");
	}
	public static void main(String[] args) {
		DB db=new DB("127.0.0.1","student","student","jdbc");
		DB db1=new DB();
	}
}
