package lianxi;

public class �ַ�String {

	
	public static void main(String[] args) {
		String name=" abdsbddh23bgSA1dd23541sdj   ";
		
		
		System.out.println(name.charAt(2));//���صڶ����ַ�
		System.out.println(name.length());//�����ַ�������
		System.out.println(name.indexOf("bd"));//����bd��һ�γ��ֵ�λ��
		System.out.println(name.indexOf("dd", 6));//���شӵ�6��λ�ÿ�ʼ��һ�γ���dd��λ��
		System.out.println(name.replace("dd", "������"));//��dd�ַ������ɰ�����
		System.out.println(name.toUpperCase());//���ַ�����Сд���ɴ�д
		System.out.println(name.toLowerCase());//���ַ�������xiaoxie
		System.out.println(name.trim());//���ַ���ǰ�ߺͺ�ߵĿո�ȥ��
		System.out.println(name.toUpperCase());//
		System.out.println(name.valueOf(32));//ת����������������
		System.out.println(name.concat("we"));//���ַ���we�ӵ��ַ����ĺ��
		
		System.out.println(name); 
		
	}
	
}
