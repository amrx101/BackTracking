/* finds k length permutation of 
 * a given string 
 * based on backtracking 
 * Assumes : Non repeating input 
 */

public class KthPermutation {
	public static void KPerm(int len , String prefix, String remaining ){
		if(prefix.length() == len ){
			System.out.println(prefix);
		}
		else{
			for(int i = 0 ; i< remaining.length();i++){
				String newPrefix = prefix+remaining.charAt(i);
				String newRemaining = remaining.substring(0,i)+remaining.substring(i+1);
				KPerm(len,newPrefix,newRemaining);
			}
		}
	}
	public static void main(String [] args){
		String first = "abc";
		String second = "abcd";
		System.out.println("All 2 len permutations os string "+ first +"   are");
		KPerm(2,"",first);
		System.out.println("All 3 length permutations of string "+ second +" are ");
		KPerm(3,"",second);
		System.out.println("All 1 length permutations of string "+ second +" are ");
		KPerm(1,"",second);
	}
}
