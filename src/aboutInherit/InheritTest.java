package aboutInherit;

public class InheritTest {

	public static void main(String[] args) {
		/**
		 * 错误的调用
		 */
//		B b = new B();
//		A a = new A();
		D d = new D();
		System.out.println(C.dp);
	}
}

/**
 * 
 * 初始化B的时候会初始化A,而初始化A会初始化bp变量,从而导致不断的死循环调用
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
	 * 对于接口而言,变量都是static的,fuck...
	 */
	 D dp = new D();
}

class D implements C{
	
}