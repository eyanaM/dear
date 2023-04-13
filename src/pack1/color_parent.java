package pack1;

public class color_parent {
	public void eyana() {
		int a =40;
		int b = 60;
		int c = a+b;
		System.out.println(c);
		
	}
public static void eyana2() {
	String firstname= "Matt";
	String lastname = " Gomes";
	String fullname = firstname + lastname;
	System.out.println(fullname);
	
	
}
public void eyana3(double d, double e ) {
	double f= d*e;
	System.out.println(f);
	
}
public void eyana4() {
	String eye= "bangladesh";
	char[] val=eye.toCharArray();
	
	for(int i= val.length-1;i>=0;i--) {
		System.out.println(val[i]);
	}
	
}
public void eyene5(){
	String nam= "matt,gomes,eyana,gomess";
	char[]lame=nam.toCharArray();
	
	for(int i=0; i<lame.length; i++) {
		System.out.println(lame[i]);
		
	}
}

public void eyana6() {
	String country="Bangladesh,India,pakisthan,Nepal";
	String[] laa=country.split(",");
	//int a =country.length();
	//System.out.println(a);
	
	
	for(int i=0;i<laa.length;i++) {
		
		System.out.println(laa[i]);
		//System.out.println(country.length());
		//System.out.println(laa.length);
		
		
	}
	
}


}
