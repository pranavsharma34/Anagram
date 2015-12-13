import java.util.*;

public class UniqueHashMap extends HashMap<String, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6123565988725649972L;
	HashMap<String, String> map = new HashMap<String, String>();
	
	public UniqueHashMap() 
	{
	}
	
	public String put(String key, String value)
	{
		if(value != map.get(key))
		{
			map.put(key, value);
			return null;
		}
		else
		{
			String s = map.get(key);
			map.remove(key);
			map.put(key, value);
			return s;
		}
	}
	
	public void putAll()
	{
		
	}
}
