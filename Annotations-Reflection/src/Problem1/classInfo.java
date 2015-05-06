package Problem1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface classInfo {
	
	String author();
	int revision() default 1;
	boolean isChecked() default true;
	Class<?>[] related();
	
}
