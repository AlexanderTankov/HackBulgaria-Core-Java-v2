package Problem1;

import java.lang.annotation.Annotation;

@classInfo(author = "Alexandar", related = {})
public class Car {
	
	public static void main(String[] args) {
		Car a = new Car();
		Annotation[] anot = a.getClass().getAnnotations();
		for (int i = 0; i < anot.length; i++) {
			System.out.println(anot[i].toString());
		}
		
		System.out.println(a.getClass().getAnnotation(classInfo.class));
	}
}
