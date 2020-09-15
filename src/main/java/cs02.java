
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.alibaba.fastjson.JSONObject.*;

class cs_02{
    public static void main( String[] args ){

        List<String> list = new ArrayList<String>();
        list.add("username");
        list.add("age");
        list.add("sex");
        JSONArray array = new JSONArray();
        array.add(list);

        System.out.println(array);
        Map<String, String> map = new HashMap<String, String>();
        map.put("abc", "abc");
        map.put("def", "efg");
        JSONArray array_test = new JSONArray();
        array_test.add(map);
        System.out.println(array_test);
    }
}

