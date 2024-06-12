package RAILW;

import java.util.Scanner;
 public class bank {
		
			private  double  bal=10000;
			private int pwd;
			
		    void deposit(double money)
		   {
			   System.out.println("ENTER PASSWORD:-");
			   Scanner sc=new Scanner(System.in);
			   pwd=sc.nextInt();
			   if(pwd==9990)
			   {
				   bal=bal+money;
				   System.out.println("DEPOSITED MOMEY:-"+money);
				   System.out.println("TOTAL BAL:-"+bal);
				   
			   }
			   else
			   {
				   System.out.println("WRONG PASSWORD !");
			   }
						   
		   }
		   
		   
		   void withdraw(double money)
		   {
			   System.out.println("ENTER PASSWORD:-");
			   	Scanner sc=new Scanner(System.in);
			   	pwd=sc.nextInt();
			   	if(pwd==9990)
			   	{
			   		bal=bal-money;
					   System.out.println("WITHDRAW AMMOUNT:-"+money);
					   System.out.println("TOTAL BAL="+bal);
			   	}
			   	else
			   	{
			   		System.out.println("WRONG PASSWORD !");
			   	}
			   				
		   }
		   
		   void checkbal()
		   {
			   System.out.println("ENTER PASSWORD:-");
			   Scanner sc=new Scanner(System.in);
			   pwd=sc.nextInt();
			   
			   if(pwd==9990)
			   {
				   System.out.println("YOUR BAL:-"+bal);
			   }
			   else
			   {
				   System.out.println("WRONG PASSWORD !");
			   }
		   }
}

 class user extends bank
{
	public static void main(String[]args)
	{
		user str=new user();
		System.out.println("ENTER YOUR CHOISE:-");
		   System.out.println();
		   System.out.println("1. DEPOSIT AMMOUNT :-");
		   System.out.println("2. WITHDRAW AMMOUNT :-");
		   System.out.println("3. CHECKBAL:-");
		   
		   int ch;
		   
		   Scanner sc=new Scanner(System.in);
		   ch=sc.nextInt();
	
		   	switch(ch)
		   	{
		   	case 1: 
		   		str.deposit(2000);
	
		   	case 2: 
		   		str.withdraw(7000);
		   		
		   	case 3: 
		   		str.checkbal();
		   	
		   		default :
		 		   System.out.println(" INVAILED CHOISE !");
		   	}
	}
	
	
}
