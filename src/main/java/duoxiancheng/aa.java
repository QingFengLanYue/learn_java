package duoxiancheng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class  aa{
	public static void main(String[] args) {
		File a1=new File("D://a//b//c//a.txt");
		File a2=new File("F://a//b");
		try {
			FileInputStream re=new FileInputStream(a1);
			FileOutputStream wr=new FileOutputStream(a2);
			int cc;
			//System.out.print((char)(re.read()));
		
			//System.out.print(re.read());
			System.out.print(re.read());
			while((cc=re.read())!=-1)
			{	
				
				//System.out.print(re.read());
				//System.out.print((char)(re.read()));
				//System.out.print((char)(re.read()));
				System.out.print((char)cc);
				wr.write(cc);
			}
			wr.flush();
			wr.close();
			re.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

