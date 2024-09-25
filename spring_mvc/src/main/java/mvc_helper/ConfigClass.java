package mvc_helper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "mvc_controller")
@Configuration
public class ConfigClass 
{
	@Bean
	public InternalResourceViewResolver resolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setSuffix(".jsp"); //setSuffix() specifies the view technology. 
		resolver.setPrefix("/");  //setPrefix() specifies the location of the view files.
									// By default the view resolver point to webapp folder.
		
		return resolver;
	}
}
