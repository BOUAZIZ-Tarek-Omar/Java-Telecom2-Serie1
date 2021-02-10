package ex4;

import java.util.Arrays;

public class Anagramme {

	
	public boolean isAnagramme(String s1, String s2) 
	{
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		String h1="";
		String h2="";
		
		for(int k=0;k<s1.length();k++) {
			if(c1[k]!=' '&& c1[k]!=',') {
				h1=h1+c1[k];
			}
			
		}
		System.out.println("la 1ere chaine(h1) devient="+h1);
		for(int k=0;k<s2.length();k++) {
			if(c2[k]!=' '&& c2[k]!=',') {
				h2=h2+c2[k];
			}
			
		}
		System.out.println("la 2eme chaine(h2) devient="+h2);
		System.out.println("taille de h1="+h1.length());
		System.out.println("taille de h2="+h2.length());
		
		char[] cc1=h1.toCharArray();
		char[] cc2=h2.toCharArray();
	
		if(h1.length()!=h2.length())
			return false;
		else 
		{
			
			
			String p1="";
			String p2="";
			Arrays.sort(cc2);
			Arrays.sort(cc1);
				for(int i=0;i<h1.length();i++) {
					
					p1=p1+cc1[i];
				}
				System.out.println("aprés le tri h1="+p1);
				for(int i=0;i<h2.length();i++) {
					
					p2=p2+cc2[i];
				}
				System.out.println("aprés le tri h2="+p2);
				if(p1.equals(p2)==true) {
					
					return true;
				}
				else {
					
					return false;
				}
	

		}

		
	}
}
