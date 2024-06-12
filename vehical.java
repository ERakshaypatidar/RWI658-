package RAILW;

interface bike
{
	String str="TVS";
	int speed=100;
	
	void start();
	void exit();
	
}
class Tvs implements bike 
{
		public void start()
		{
			System.out.println("PRESS START BOTTON ..");
		}
		public void exit()
		{
			System.out.println("PRESS EXIT BOTTON");
		}
	
}



public class vehical extends Tvs 
{
public static void main(String[]args)
{
	vehical s=new vehical();
	s.start();
	s.exit();
}
}
