package exam2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudyApp {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("exam2/beans.xml");
		Student st1 = (Student) ac.getBean("homework_b1");
		Student st2 = (Student) ac.getBean("homework_b2");
		Student st3 = (Student) ac.getBean("homework_b3");
		System.out.println(st1.getName() + "는 " + st1.getMyHomework().getHomeworkName() + "를 학습합니다");
		System.out.println(st2.getName() + "는 " + st2.getMyHomework().getHomeworkName() + "를 학습합니다");
		System.out.println(st3.getName() + "는 " + st3.getMyHomework().getHomeworkName() + "를 학습합니다");
		
//		ac = new ClassPathXmlApplicationContext("exam2/beans2.xml");
//		st1 = (Student) ac.getBean("homework_b1");
//		st2 = (Student) ac.getBean("homework_b2");
//		st3 = (Student) ac.getBean("homework_b3");
//		System.out.println(st1.getName() + "는 " + st1.getMyHomework().getHomeworkName() + "를 학습합니다");
//		System.out.println(st2.getName() + "는 " + st2.getMyHomework().getHomeworkName() + "를 학습합니다");
//		System.out.println(st3.getName() + "는 " + st3.getMyHomework().getHomeworkName() + "를 학습합니다");
	}
}
