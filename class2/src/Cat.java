
public class Cat {
   private String name;
   private String color;
   
   public void showCat()
   {
	   System.out.println(this.name+",��ɫΪ:"+this.color);
   }
   
   public static void main(String[] args) {
	Cat b1=new Cat();
	b1.name="�ε�";
	b1.color="��ɫ";
	b1.showCat();
}
}
