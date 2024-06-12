package RAILW;

abstract class citters
{
	void legs()
	{
		System.out.println("ANIMAL HAVE 4 LEGS");
	}
	abstract void eat();
	abstract void sound();
}

class dog extends citters
{
	@Override
	void eat()
	{
		System.out.println("DOG IS EAT MEAT");
	}
	void sound()
	{
		System.out.println("BHO... BHO....");
	}
	
}

public class animal
{
	 public static void main(String[]args)
	 {
		 dog str=new dog();
		 str.eat();
		 str.legs();
		 str.sound();
	 }
				
}
