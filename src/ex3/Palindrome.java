package ex3;

public class Palindrome {
	
	public boolean palindrome(String p) {
		char[] c=p.toCharArray();
		
		
		boolean b=true;
		String h="";
		String m;
		
		for(int k=0;k<p.length();k++) {
			if(c[k]!=' '&& c[k]!=',') {
				h=h+c[k];
			}
			
		}
		m=h.toLowerCase();
		System.out.println("ma chaine devient: "+m);
		char[] c1=m.toCharArray();
		int i=0;
		int j=m.length()-1;
		do {
			if(c1[i]!=c1[j]) {
				b=false;
			}
			else {
				i++;
				j--;
			}
			
		}while(b==true&&j>0&&i<p.length()-1);
		return b;
	}
}
