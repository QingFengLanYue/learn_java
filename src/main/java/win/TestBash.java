package win;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TestBash {

    public static void Runshell(String str,String shell) {
        //String bashCommand = "sh "+"test.sh "+str;
        String sql="\""+str+"\"";
        String[] bashCommand = new String[]{shell,str};
        System.out.println(Arrays.toString(bashCommand));
        Runtime runtime = Runtime.getRuntime();
        try {
            Process pro = runtime.exec(bashCommand);
            int status = pro.waitFor();
            if (status != 0)
            {
                System.out.println("Failed to call shell's command ");
            }
            //打印执行结果
            BufferedReader br = new BufferedReader(new InputStreamReader(pro.getInputStream()));
            StringBuffer strbr = new StringBuffer();
            String line;
            while ((line = br.readLine())!= null)
            {
                strbr.append(line).append("\n");
            }
            String result = strbr.toString();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String shell = "/home/hive/java/test.sh";
        String str="select * from test.tt limit 10 ";
        Runshell(str,shell);
    }
}