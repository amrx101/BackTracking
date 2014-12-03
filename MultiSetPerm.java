/* creates and prints all the 
 * permutations of multiset 
 * Backtracking employed with 
 * efficient candidates generation 
 * The basic idea is not to recur on prefix and next 
 * which have been already recurred
 */
import java.util.*;
public class MultiSetPerm{
	public static void genMultiPerm(String prefix, String next){
		// if next is empty , permutation generated
		// Backtracking mechanism : see if obtained result
		if("".equals(next)){
			// result obtained , process the result
			System.out.println(prefix);
		}

		else{
			// generate candidates for next recursion 
			// eliminate those candidates from al possible candidates
			// that need not be explored through further recursion 
			ArrayList<Character> visited = new ArrayList<>();
			for(int i = 0; i< next.length(); i++){
				// if the next candidated has not been previously explored
				if(!visited.contains(next.charAt(i))){
					visited.add(next.charAt(i));
					String newPrefix = prefix + next.charAt(i);
					String newNext = next.substring(0,i)+next.substring(i+1);
					genMultiPerm(newPrefix,newNext);
				}
			}

		}

	}
	public static void main(String [] args){
		String first = "1221";
		genMultiPerm("",first);

	}
}
