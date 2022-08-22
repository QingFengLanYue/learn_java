package hive_udf;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.hadoop.hive.ql.exec.UDF;

public class DateFormatUDF extends UDF {
    public DateFormatUDF() {
    }

    public String evaluate(String str) {
        try {
            if (str != null && !"".equals(str) && !str.toUpperCase().contains("NULL")) {
                DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                str = str.replace("/", "-");
                SimpleDateFormat formaten = judgeDateFormat(str);
                Date date = null;

                try {
                    date = formaten.parse(str);
                } catch (ParseException var6) {
                    var6.printStackTrace();
                }

                str = format1.format(date);
                return str;
            } else {
                return "";
            }
        } catch (Exception var7) {
            return "";
        }
    }

    public static SimpleDateFormat judgeDateFormat(String str) {
        Map<String, SimpleDateFormat> dateFormatMaps = new HashMap();
        dateFormatMaps.put("dd-MMM-yy", new SimpleDateFormat("dd-MMM-yy", Locale.ENGLISH));
        dateFormatMaps.put("dd-MMM-yyyy", new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH));
        dateFormatMaps.put("yyyy-MM-dd HH:mm:ss", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        dateFormatMaps.put("yyyy-MM-dd HH:mm", new SimpleDateFormat("yyyy-MM-dd HH:mm"));
        dateFormatMaps.put("yyyy-MM-dd", new SimpleDateFormat("yyyy-MM-dd"));
        dateFormatMaps.put("yyyy-MM-dd HH", new SimpleDateFormat("yyyy-MM-dd HH"));
        Iterator var3 = dateFormatMaps.entrySet().iterator();

        while(var3.hasNext()) {
            Map.Entry<String, SimpleDateFormat> entry = (Map.Entry)var3.next();
            if (isValidDate(str, (String)entry.getKey(), (SimpleDateFormat)entry.getValue())) {
                return (SimpleDateFormat)entry.getValue();
            }
        }

        return null;
    }

    public static boolean isValidDate(String str, String dateFormat, SimpleDateFormat format) {
        boolean convertSuccess = true;

        try {
            format.parse(str);
        } catch (ParseException var5) {
            convertSuccess = false;
        }

        boolean judgelength = str.length() == dateFormat.length();
        return convertSuccess & judgelength;
    }

    public static void main(String[] args) {
        DateFormatUDF aDateFormatUDF = new DateFormatUDF();
        System.out.println(aDateFormatUDF.evaluate("2018-06-11 00:00:00"));
    }
}
