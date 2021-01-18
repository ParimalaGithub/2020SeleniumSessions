package seleniumSessions;

import java.util.HashMap;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {
		//HashMap<String,String> userMap = new HashMap<String,String>();
		Map<String,String> userMap = new HashMap<String,String>();
		userMap.put("id", "E111");
		userMap.put("city", "Bangalore");
		userMap.put("name", "Pari");
		userMap.put("State", "CA");
		userMap.put("Country", "USA");
		System.out.println(userMap.get("id"));
		System.out.println(userMap.size());
		System.out.println(userMap.get(0));
		for(Map.Entry m: userMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
