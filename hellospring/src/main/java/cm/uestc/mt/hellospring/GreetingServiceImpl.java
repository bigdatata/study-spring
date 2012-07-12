package cm.uestc.mt.hellospring;

public class GreetingServiceImpl implements GreetingService {

	private String greeting;
	public GreetingServiceImpl(){
		
	}
	public GreetingServiceImpl(String greeting){
		this.greeting=greeting;
	}
	public void setGreeting(String greeting){
		this.greeting=greeting;
	}
	public void sayHello() {
		System.out.println(greeting);
	}

}
