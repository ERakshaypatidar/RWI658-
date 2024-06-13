package RAILW;

interface N
{
	void show();
	
}

interface M
{
	void disp();
}


public class multipleinheri implements N,M 
{
	public void show()
	{
		System.out.println(" INTERFACE A");
	}
	public void disp()
	{
		System.out.println("INTERFACE B");
	}
			public static void main(String[]args)
			{
				multipleinheri str=new multipleinheri();
				str.show();
				str.disp();
			}
			
}
