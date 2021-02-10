package ex2;

public class MainFonction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bissextile b = new Bissextile();
		int i[]= {1900,1901,1996,2000};
		System.out.println("Pour 1900:"+b.bissextile(i[0]));
		System.out.println("Pour 1901:"+b.bissextile(i[1]));
		System.out.println("Pour 1996:"+b.bissextile(i[2]));
		System.out.println("Pour 2000:"+b.bissextile(i[3]));
		
	}

}
