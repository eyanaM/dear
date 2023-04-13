package pack1;

import java.util.HashSet;
import java.util.Set;

public class white {

	
	
	//7. Convert String to Integer
	public static void main(String[] args) {
		
		
		
		String price1= "400";
		String price2= "120";
		
		//int p1 =Integer.parseInt(price1);
		//int p2 = Integer.parseInt(price2);
		//System.out.println(p1+p2);
		

		int a1=Integer.parseInt(price1);
		int b2=Integer.parseInt(price2);
		
		System.out.println(a1-b2);
		
	
		 // Swapping value
		int a = 10;
		int b = 20;
		System.out.println("Before swapping a value " + a);
		System.out.println("Before swapping b value " + b);
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println("After swapping a value " + a);
		System.out.println("After swapping b value " + b);
		
		
		
		int e= 25;
		int m= 40;
		System.out.println("before swapping e value "+e);
		System.out.println("before swapping m value "+m);
		e= e+m;//65
		m=e-m;//25
		e=e-m;//40
		
		System.out.println("after swapping e value "+e);
		System.out.println("ater swapping m value "+m);
		
		
		//Split value
		
		/*String classes = "Java-QTP-Cucumber-Selenium-TesNG";
		String [] ab = classes.split("-");
		for(int i= 0; i<ab.length;i++) {
		System.out.println(ab[i]);
		**/
		
	
		//String clas="my-name-is-eyana-matha-fula";
		//String []em=clas.split("-");
		
		//for(int i =0;i<em.length;i++) {
		
		//System.out.println(em[i]);
		
		//Reverse value
		
		
		String ap = "dhaka";
		
	      char[]pl=ap.toCharArray();
	      
		
		
		for(int j= pl.length-1; j>=0;j--) {
			
		System.out.println(pl[j]);
		
		}
		
		
		
		//Find duplicate value
	
		String name [] = {"Java", "JavaScript", "Ruby", "C++", "Java"};
		Set<String> st = new HashSet<String>() ;
		for(String name1:name) {
		if(st.add(name1)== false) {
		System.out.println("Duplicate Value is ::" + name1);

		}
		}
		
		}
}
		
	



