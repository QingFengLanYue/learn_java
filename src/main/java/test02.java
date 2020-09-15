import com.alibaba.fastjson.JSONObject;

public class test02 {
    public static void main(String[] args) {
        String json = "{" + "abc" + ":" + "1" + "," + "hahah" + ":" + "2" + "}";
        JSONObject jsonObject = JSONObject.parseObject(json);
        System.out.println(jsonObject);

    }
}
