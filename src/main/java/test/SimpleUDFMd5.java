package test;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.math.BigInteger;
import java.security.MessageDigest;

@Description(
        name = "md5",
        value = "_FUNC_(str) to md5",
        extended = "Example:\n" +
                "  > SELECT md5('11134') ;\n"
)
public class SimpleUDFMd5 extends UDF {

    /**
     * 1. Implement one or more methods named "evaluate" which will be called by Hive.
     * <p>
     * 2. "evaluate" should never be a void method. However it can return "null" if needed.
     */
    public String evaluate(String str) {
        // input parameter validate
        if (null == str) {
            return null;
        }

        // validate
        if (StringUtils.isBlank(str.toString())) {
            return null;
        }

        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            //一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String x = "12345678";
        SimpleUDFMd5 he = new SimpleUDFMd5();
        System.out.println(he.evaluate(x));

    }

}
//e9c5bd2ece7d5f83122a6c06a5d70977