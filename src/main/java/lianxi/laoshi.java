package lianxi;

public class laoshi {
	    //插入排序
		
		public static void main(String[] args) {	
			// TODO Auto-generated method stub
		
			int x[] = { 12, 9, 45, 2, 13, 27, 48, 79, 56, 38 };
			
			for(int i=1;i<x.length;i++){
				int k=x[i];//要插入的数  9
			    int j=i-1;//记住位移后的位置
			    //判断如果值当前值大于插入的数，进行位移
			    while(j>=0&&x[j]>k){
			    	x[j+1]=x[j];
			    	j--;
			    }
			    x[j+1]=k;//还原位移后的位置，加入插入的值
			}
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i]+"   ");
			}
			
			
		}
		//冒泡排序
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

		// 选择排序
		public void xz() {  
			int x[] = { 12, 9, 45, 2, 13, 27, 48, 79, 56, 38 };
			int min = 0, t = 0;// min表示为最小值，t表示最小值的下标
			for (int i = 0; i < x.length; i++) {
				min = x[i];
				t = i;
				// 找出最小值和他的下标
				for (int j = i + 1; j < x.length; j++) {
					if (min > x[j]) {
						min = x[j];
						t = j;
					}
				}
				// 交换最小值和第i个值的位置
				x[t] = x[i];
				x[i] = min;
			}
			for (int i = 0; i < x.length; i++) {

				System.out.print(x[i] + " ");
			}
		}
	}
