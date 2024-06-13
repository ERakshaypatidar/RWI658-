
			// SINGLE INHERITENCE 

package RAILW;
	
class ank
{
	


		int a;
		String st;
		void show()
		{
			System.out.println("ENTER PROPERTIES...");
		}
}


public class singleinher extends ank 
{
void aks()
{
	a=10;
	st="AKSHAY";
	System.out.println(a+" "+st);
}


public static void main(String[]aegs)
{
	singleinher str=new singleinher();
	str.show();
	str.aks();
}
}
