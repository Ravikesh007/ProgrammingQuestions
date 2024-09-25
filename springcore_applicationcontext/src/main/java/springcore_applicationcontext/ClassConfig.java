package springcore_applicationcontext;

import org.springframework.context.annotation.ComponentScan;


/**
 *@componentScan is used to specify packages name to IOC container.
 *@componentScan is used to specify the location of POJO classes to IOC container.
 *In @componentScan, we can specify the prefix word of the package name instead of writing complete package name. 
 */
@ComponentScan(basePackages = "sc_variableInjection")
public class ClassConfig 
{
	
}
