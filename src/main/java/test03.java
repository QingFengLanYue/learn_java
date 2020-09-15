import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class test03 {

    public static void main(String[] args) throws JSONException {
        String json = "{'name':'reiz'}";
        JSONObject jsonObj = new JSONObject() ;

        System.out.println(jsonObj);
        String[] likes = new String[] {"JavaScript", "Skiing", "Apple Pie" };
        jsonObj.put("likes", likes);
        System.out.println(jsonObj);
        Map <String, String> ingredients = new HashMap <String, String>();
        ingredients.put("apples", "3kg");
        ingredients.put("sugar", "1kg");
        ingredients.put("pastry", "2.4kg");
        ingredients.put("bestEaten", "outdoors");
        jsonObj.put("ingredients", ingredients);
        System.out.println(jsonObj);
    }
}


