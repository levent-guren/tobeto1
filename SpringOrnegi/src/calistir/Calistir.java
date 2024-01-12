package calistir;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Garaj;
import beans.Kitap;
import beans.Motosiklet;

public class Calistir {
	public static void main(String[] args) {
		System.out.println("Program basladi");
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//		reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
		ConfigurableApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("xml okundu");

		Motosiklet motosiklet = beanFactory.getBean("motosiklet", Motosiklet.class);
		System.out.println(motosiklet);
		motosiklet.setFiyat(800000);

		Motosiklet motosiklet2 = beanFactory.getBean("moto2", Motosiklet.class);
		System.out.println(motosiklet2);
		Kitap kitap = beanFactory.getBean("k1", Kitap.class);
		System.out.println(kitap);

		Motosiklet m1 = beanFactory.getBean("motosiklet", Motosiklet.class);
		System.out.println(m1);

		Garaj garaj = beanFactory.getBean("benimGaraj", Garaj.class);
		System.out.println(garaj);

		beanFactory.close();
	}
}
