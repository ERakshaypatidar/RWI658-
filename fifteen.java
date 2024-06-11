package RAILW;

public class fifteen {
				

	int a=100;
						fifteen()
						{
							
						}
}
class n extends fifteen
{
	void show()
	{
		int a=200;
		System.out.println(a);
		System.out.println(super.a);
	}
	class c
	{
		public static void main(String[]args)
		{
			n str=new n();
			str.show();
			
		}
	}
}
