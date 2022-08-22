package test;

public class diejia {

		public static void main(String[] args) {
			String [] array =new String [4];
			for(int j=0;j<array.length;j++){
				StringBuilder st=new  StringBuilder();
				for(int i=0; i<j+1;i++){
					st.append(1);	
				}
				
				array[j]=st.toString();
			}
			
			for(int j=0;j<array.length;j++){

				System.out.print(array[j]+" ");
			}
		}

}
