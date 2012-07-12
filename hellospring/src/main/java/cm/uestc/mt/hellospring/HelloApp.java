package cm.uestc.mt.hellospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloApp {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new
				ClassPathResource("hello.xml"));
		GreetingService service=(GreetingService)factory.getBean("greetingService");
		service.sayHello();
	}

}
