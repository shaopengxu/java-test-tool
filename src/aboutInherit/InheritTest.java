package aboutInherit;

public class InheritTest {

	public static void main(String[] args) {
		/**
		 * ����ĵ���
		 */
//		B b = new B();
//		A a = new A();
		D d = new D();
		System.out.println(C.dp);
	}
}

/**
 * 
 * ��ʼ��B��ʱ����ʼ��A,����ʼ��A���ʼ��bp����,�Ӷ����²��ϵ���ѭ������
 * @author 37wan
 * 
 */
class A {
	
	private B bp = new B();

}

class B extends A {

}

interface C{
	/**
	 * ���ڽӿڶ���,��������static��,fuck...
	 */
	 D dp = new D();
}

class D implements C{
	
}