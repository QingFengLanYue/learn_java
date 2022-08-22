package test;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFuncUtils extends UDF {

    private static Log LOG = LogFactory.getLog(DateFuncUtils.class.getName());

    private static final String YYYY_MM_DD = "yyyy-M-d";

    public Text evaluate(String dateStr) {
        String result = dateFormatConvert(dateStr);
        if (StringUtils.isBlank(result)){
            return null;
        }
        return new Text(result);
    }

    /**
     *
     *  日期格式转换 示例2021-01-12 --》12-Jan-22
     *
     * @param dateStr
     * @return
     */
    public String dateFormatConvert(String dateStr){
        if(StringUtils.isBlank(dateStr)){
            return dateStr;
        }
        try{
            SimpleDateFormat formatter = new SimpleDateFormat(YYYY_MM_DD);
            ParsePosition pos = new ParsePosition(0);
            Date d=formatter.parse(dateStr, pos);
            SimpleDateFormat sdf =new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH);
            return sdf.format(d);
        }catch (Exception e){
            LOG.error(e.getMessage());
            return dateStr;
        }

    }
    public static void main(String[] args) {
        String x = "2021-02-08";
        DateFuncUtils he = new DateFuncUtils();
        System.out.println(he.dateFormatConvert(x));

    }
}
