package hive_udf;

import org.apache.hadoop.hive.ql.exec.UDF;

public class PrimaryKeyUDF extends UDF {

    public String evaluate(String id, String number) {
        if (number == null || number.equals(""))
            return id;
        int idLength = id.length();
        StringBuffer sb = new StringBuffer();
        sb.append(number);
        for (int i = 0; i < 17 - idLength; i++) {
            sb.append("0");
        }
        sb.append(id);
        return sb.toString();
    }

    public static void main(String[] args) {
        PrimaryKeyUDF p = new PrimaryKeyUDF();
        System.out.println(p.evaluate("261085","1"));
        System.out.println(p.evaluate("261085","1").length());
    }

}
