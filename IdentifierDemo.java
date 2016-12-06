import java.util.*;

class IdentifierDemo {
	public static void main(String... args) {
		int $ = 4;
		int ＄ = 5;
		int ﹍ = 4;
		int ﹎ = 3;
		int ﹏ = 1;	
		$ = ＄ + ﹍ - ﹏ - ﹎;

		if ((﹍>﹎) || $ == ＄)	 {
			System.out.println("Dollars are equal");			
		} else {
			System.out.println("Dollars are nequal");					
		}
	}
}