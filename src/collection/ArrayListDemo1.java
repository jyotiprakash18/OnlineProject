package collection;

import java.util.ArrayList;

public class ArrayListDemo1 
{

	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		al.add("Raghu");
		al.add("Guru");
		al.add(null);
		al.add("Krishna");
		al.add("Guru");
		al.add(123);
		al.add(null);
		al.add('r');
		al.add("Krishna");
		al.add("Raghu");
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(3));
		System.out.println(al.contains(123));
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("Guru"));
		System.out.println(al.lastIndexOf("Guru"));
		
		al.add(2,"Manju");
		System.out.println(al);
		
		al.set(3,"Kumar");
		System.out.println(al);
	}
}