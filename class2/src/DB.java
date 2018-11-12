
public class DB {
	String host;
	String username;
	String userpwd;
	String ur1;
	
	public void display()
	{
		System.out.println("-----display()------");
	}
  //构造函数
	public  DB(String host,String username,String userpwd,String ur1)
	{
		this.host=host;
		this.username=username;
		this.userpwd=userpwd;
		this.ur1=ur1;
		System.out.println("-----这是有参数的DB构造函数");
	}
	DB()
	{
		System.out.println("------这是没有参数的DB构造函数");
	}
	public static void main(String[] args) {
		DB db=new DB("127.0.0.1","student","student","jdbc");
		DB db1=new DB();
	}
}
