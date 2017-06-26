package Annotaiton;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CityInfo {
	String ct_name();
	int zip();
}