
public class Dog1 {
	public static void main(String[] args) {
		Dog a1=new Dog();
		a1.setColor("灰色");
		a1.eat();
		System.out.println("狗的颜色："+a1.getColor());
		
		Dog a2=new Dog();
		a2.setColor("黑色");
		a2.eat();
		System.out.println("狗的颜色:"+a2.getColor());
	}
}
