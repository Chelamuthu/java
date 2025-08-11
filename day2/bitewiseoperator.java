package day2;

public class bitewiseoperator {
	public static void main(String args[]) {
		int a=20;
		int b=35;
		// rules for bitwise operators
		// a   b  | & | | | ^ |
		// 0   0  | 0 | 0 | 0 |
		// 0   1  | 0 | 1 | 1 |
		// 1   0  | 0 | 1 | 1 |
		// 1   1  | 1 | 1 | 0 |

		
		// 	     32 16  8  4  2  1
		
		// a=20  0   1  0  1  0  0
		// a=35  1   0  0  0  1  1
		//---------------------------
     	//a & b  0   0  0  0  0  0   answer is  0
		
		//a|b    1   1  0  1  1   1  answer is 55
		
		//a|b    1   1  0  1  1   1  answer is 55
		
		System.out.println(a & b);
		System.out.println(a|b);
		System.out.println(a^b);
		
		
	}
	

}
