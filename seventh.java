package RAILW;

import java.util.Arrays;
import java.util.Scanner;

public class seventh {
		
						public static void main(String[]args)
						{
						int a[][]=new int[2][2];
								
									System.out.print("\nENTER ELEMENTS...");
									Scanner sc=new Scanner(System.in);
									
									for( int i=0; i<2; i++)
									{
										for(int j=0; j<2; j++)
										{
											System.out.println();
											a[i][j]=sc.nextInt();	
											
										}
									
									}
										for( int i=0; i<2; i++)
									{
										for(int j=0; j<2; j++)
										{
										
									System.out.print(a[i][j]+" ");
									
										}
									}									
}
}
