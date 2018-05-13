
public class ForLoopGauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			// System.out.println(i + 1);
		}
		for (int i = 100; i > 0; i--) {
			// System.out.println(i);
		}
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				// System.out.println(i);
			}
		}
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				// System.out.println(i);
			}
		}

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				// System.out.println(i + " is even");
			} else {
				// System.out.println(i + " is odd");
			}
		}

		for (int i = 0; i < 778; i++) {
			if (i % 7 == 0) {
				// System.out.println(i);
			}
		}
		
		for (int i = 2003; i < 2019; i++) {
		//	System.out.println("in " + i + " I was " + (i-2003) + " years old");
			
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//System.out.println(i + " " + j);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 4 ; j++) {
				
				//	System.out.print(j + i*3);
				}
		//	System.out.println(" ");
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 11; j++) {
				//System.out.print(j + i*10 + " ");
			}
		//	System.out.println(" ");
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
			//	System.out.print("*");
			}
			//System.out.println(" ");
		}
		
		for (int i = 0; i < 101; i++) {
			System.out.println(100 - i);
		}
		
		
		

	}
}
