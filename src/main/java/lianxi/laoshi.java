package lianxi;

public class laoshi {
	    //��������
		
		public static void main(String[] args) {	
			// TODO Auto-generated method stub
		
			int x[] = { 12, 9, 45, 2, 13, 27, 48, 79, 56, 38 };
			
			for(int i=1;i<x.length;i++){
				int k=x[i];//Ҫ�������  9
			    int j=i-1;//��סλ�ƺ��λ��
			    //�ж����ֵ��ǰֵ���ڲ������������λ��
			    while(j>=0&&x[j]>k){
			    	x[j+1]=x[j];
			    	j--;
			    }
			    x[j+1]=k;//��ԭλ�ƺ��λ�ã���������ֵ
			}
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i]+"   ");
			}
			
			
		}
		//ð������
		public void mp(){
			
			int x[] = { 12, 9, 45, 2, 13, 27, 48, 79, 56, 38 };
			int t = 0;
			for(int j=x.length-1;j>=0;j--){
			  for (int i = 0; i < j; i++) {
				if (x[i] > x[i + 1]) {
					t = x[i];
					x[i] = x[i + 1];
					x[i + 1] = t;
				}

			 }
			}
			
			for (int i = 0; i < x.length; i++) {

				System.out.print(x[i] + " ");
			}
		}

		// ѡ������
		public void xz() {  
			int x[] = { 12, 9, 45, 2, 13, 27, 48, 79, 56, 38 };
			int min = 0, t = 0;// min��ʾΪ��Сֵ��t��ʾ��Сֵ���±�
			for (int i = 0; i < x.length; i++) {
				min = x[i];
				t = i;
				// �ҳ���Сֵ�������±�
				for (int j = i + 1; j < x.length; j++) {
					if (min > x[j]) {
						min = x[j];
						t = j;
					}
				}
				// ������Сֵ�͵�i��ֵ��λ��
				x[t] = x[i];
				x[i] = min;
			}
			for (int i = 0; i < x.length; i++) {

				System.out.print(x[i] + " ");
			}
		}
	}
