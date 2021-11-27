package com.github.hatzlj.springitc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PostgresIntegrationConfig {
    boolean sharedInstance() default true;

    String initWithDump();

    String user();
}
