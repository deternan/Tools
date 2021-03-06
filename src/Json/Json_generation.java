
package Json;

/*
 * 
 * version: June 14, 2017 02:01 PM
 * Last revision: June 15, 2017 02:47 PM
 * 
 * Author : Chao-Hsuan Ke
 * Institute: Delta Research Center
 * Company : Delta Electronics Inc. (Taiwan)
 * 
 * JAR
 * java-json.jar
 * 
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json_generation 
{
	private JSONArray json_array = new JSONArray();
	private JSONObject obj = new JSONObject(); 
	
	private String userId_str = "aaa";
	private String national = "TW";
	
	public Json_generation() throws JSONException
	{
		// userId
		obj.put("userId", userId_str);
		obj.put("national", national);
				
		json_array.put(obj);
		System.out.println(json_array);
	}
	
	public static void main(String args[]) throws Exception
	{
		Json_generation json = new Json_generation();
	}
	
}
