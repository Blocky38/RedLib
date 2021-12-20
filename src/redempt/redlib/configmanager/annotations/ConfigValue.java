package redempt.redlib.configmanager.annotations;

import redempt.redlib.configmanager.ConversionType;

import java.lang.annotation.*;

/**
 * Used to indicate that a field should be saved to and loaded from config
 * @deprecated Old API
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ConfigValue {
	
	/**
	 * @return The path to the config value represented by the field bearing this annotation
	 */
	String value() default "";
	
	/**
	 * @return The priority of this ConfigValue, higher priority will be loaded first
	 */
	int priority() default 1;
	
	/**
	 * @return Which type of conversion this value should use
	 */
	ConversionType type() default ConversionType.AUTO;
	
}
