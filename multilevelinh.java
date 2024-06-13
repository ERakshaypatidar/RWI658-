					// MULTI-LEVEL INHERTENCE

package RAILW;

class h
{
	int a=10, b=20,
			c=a+b;
	void add()
	{
		System.out.println(" ADDITION OF A AND B :-"+c);
	}
	
}

class B extends h
{
	int a=10,
	b=20,
	c=a-b;
	void sub()
	{
		System.out.println("SUB OF A AND B:-"+c);
	}
}

class C extends B
{
	int a=10,
	b=20,
	c=a/b;

	void division()
	{
		System.out.println("DIVIDION OF AS AND B:-"+c);
	}
}


class D extends C
{
	int a=10,
			b=20,
			c=a*b;
	void multiple()
	{
		System.out.println("MULTIPLE OF A AND B:-"+c);
	}
}
public class multilevelinh
{
public static void main(String[]args)
{
	D str=new D();
	str.add();
	str.sub();
	str.division();
	str.multiple();
}
}
