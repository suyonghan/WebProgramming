package exam1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("exam1/beans.xml");
		String time = ((LocalDateTime) ac.getBean("localdatetimebean")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		int hour = Integer.parseInt(time.substring(0, 2));
		if (hour >= 6 && hour < 12)
			((MorningGreetingImpl)ac.getBean("morningbean")).greet();
		else if (hour >= 12 && hour < 17)
			((AfternoonGreetingImpl)ac.getBean("afternoonbean")).greet();
		else if (hour >= 17 && hour < 22)
			((EveningGreetingImpl)ac.getBean("eveningbean")).greet();
		else
			((NightGreetingImpl)ac.getBean("nightbean")).greet();
		((ClassPathXmlApplicationContext) ac).close();
	}

}