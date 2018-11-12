
public class Cat {
   private String name;
   private String color;
   
   public void showCat()
   {
	   System.out.println(this.name+",ÑÕÉ«Îª:"+this.color);
   }
   
   public static void main(String[] args) {
	Cat b1=new Cat();
	b1.name="µÎµÎ";
	b1.color="»ÒÉ«";
	b1.showCat();
}
}
