package lianxi;

public class 字符String {

	
	public static void main(String[] args) {
		String name=" abdsbddh23bgSA1dd23541sdj   ";
		
		
		System.out.println(name.charAt(2));//返回第二个字符
		System.out.println(name.length());//返回字符串长度
		System.out.println(name.indexOf("bd"));//返回bd第一次出现的位置
		System.out.println(name.indexOf("dd", 6));//返回从第6个位置开始第一次出现dd的位置
		System.out.println(name.replace("dd", "啊哈哈"));//把dd字符串换成啊哈哈
		System.out.println(name.toUpperCase());//把字符串的小写换成大写
		System.out.println(name.toLowerCase());//把字符串换成xiaoxie
		System.out.println(name.trim());//把字符串前边和后边的空格去掉
		System.out.println(name.toUpperCase());//
		System.out.println(name.valueOf(32));//转化成其他数据类型
		System.out.println(name.concat("we"));//把字符串we加到字符串的后边
		
		System.out.println(name); 
		
	}
	
}
