package joseph.spring.beans;

public class HelloSpring5Bean03Kor implements HelloSpring5Bean03 {
	//HelloSpring5Bean02.java
	
	@Override
	public void sayHello(String msg) {
		System.out.println("안녕하세요 " + msg);
	}
}