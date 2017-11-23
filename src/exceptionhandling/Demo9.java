package exceptionhandling;

import java.io.IOException;

class A
{  
 void method()throws IOException
 {  
  throw new IOException("device error");  
 }  
}  
class Demo9
{  
   public static void main(String args[]) throws IOException
   {  
	   A m=new A();  
	   m.method(); 	  
	   System.out.println("normal flow...");  
   }
}