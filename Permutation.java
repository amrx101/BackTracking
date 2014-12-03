/* generates power set of a given 
 * struing : 
 * Assumes non repeating character in the input 
 * string 
 */
public class PowerSet{
	public static void genPowerSet(String prefix, String next){
		if ("".equals(next)){
			if(!"".equals(prefix)){
				System.out.println(prefix);
			}
		}
		else{
			String inclusivePrefix = prefix + next.charAt(0);
			String exclusivePrefix = prefix;
			String newNext = next.substring(1);
			genPowerSet(inclusivePrefix,newNext);
			genPowerSet(exclusivePrefix,newNext);
		}

	}
	public static void main(String [] args){
		String first = "abc";
		System.out.println("All power set of "+first +" are");
		genPowerSet("",first);
		String second = "1234";
		System.out.println("All power set of "+ second +" are");
		genPowerSet("",second);
	}
}
