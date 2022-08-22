package hive_udf;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

public class Base64Url {

    public String urlDecode(String url, String apiSecret) {
            try {
                // 某些参数值可能存在非ascii字符，需做URL编码（utf-8）
                url = url + "&" + "unused=" + java.net.URLEncoder.encode("中文", "utf-8");
                long expireTime = System.currentTimeMillis() + 1000 * 1000L;
                url = url + "&" + "expireTime=" + expireTime;
                byte[] apiSecretBytes = Base64.getUrlDecoder().decode(apiSecret);
                Key key = new SecretKeySpec(apiSecretBytes, "HmacSHA256");

                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(key);
                byte[] signatureBytes = mac.doFinal(url.getBytes("UTF-8"));

                String signatureString = Base64.getUrlEncoder().withoutPadding().encodeToString(signatureBytes);
                String urlWithSignature = url + "&" + "signature=" + signatureString;

                return urlWithSignature;
            }
            catch (Exception e){
                System.out.println("Error");
                return null;
            }
        }
    public static void main(String[] args) {
        String apiSecret = "Qqq";
        String url = "https://localhost";
        Base64Url s = new Base64Url();
        System.out.println(s.urlDecode(url,apiSecret));

    }
}


