package test;

import java.util.Scanner;

public class chengji {
public static void main(String[] args) {
      Scanner input=new Scanner(System.in) ;
      System.out.println("������ɼ� �� ");
        // ��������ɼ�
        int score = input.nextInt(); 
        
        // ��������ӷִ���
        int count = 0;


        //��ӡ����ӷ�ǰ�ɼ� 
          
       System.out.println("�ӷ�ǰ�ĳɼ���" +score);
        
        // ֻҪ�ɼ�С��60����ѭ��ִ�мӷֲ�������ͳ�Ƽӷִ���
        while (score  < 60)
        {
        	count++;
            score=score+1;
            
            
        }
        
        System.out.println("�ӷֺ�ĳɼ���" +score);
        
        System.out.println("������"+count+"��");
        
        //��ӡ����ӷֺ�ɼ����Լ��ӷִ���
}
}