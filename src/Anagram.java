
public class Anagram {

	public Anagram() {
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Boolean isAnagram = anagram("ravi", "avir");
		System.out.println(isAnagram);
	}
	
	public static boolean anagram(String str1, String str2)
	{ 
		if(str1.length() != str2.length())
		{ 
			return false; 
		} 
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] chars = str1.toCharArray(); 
		for(char c : chars)
		{ 
			int index = str2.indexOf(c); 
			if(index != -1)
			{ 
				str2 = str2.substring(0,index) + str2.substring(index +1, str2.length()); 
			}
			else
			{ 
				return false; 
			}
		} 
		return str2.isEmpty(); 
	}


}
