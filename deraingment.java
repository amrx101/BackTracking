/* generates and prints all
 * deraingments of a given string 
 * Assumption : : Strings without any 
 * repetition as the input 
 */

public class deraingment{
	public static void genDeraign(String prefix, String source){
		if("".equals(source)){
			System.out.println(prefix);

		}
		else{
			for(int i = 0; i< source.length(); i++){
				if(prefix.length() != i){
					String newPrefix = prefix + source.charAt(i);
					String newSource = source.substring(0,i)+ source.substring(i+1);
					genDeraign(newPrefix, newSource);
				}
			}
		}
	}
	public static void main(String [] args){
		String first = "abc";
		System.out.println("All deraingments of string "+first+" are ");
		genDeraign("",first);
		String second = "abcd";
		System.out.println("All deraingments of string "+second +" are ");
		genDeraign("",second);
	}
}
