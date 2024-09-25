package spring_mvc_Helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = "spring_mvc_controller")
@Configuration
public class ConfigCLass 
{
	@Bean
	public InternalResourceViewResolver resolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setSuffix(".jsp"); //setSuffix shows view technology.
		resolver.setPrefix("/"); //setPrefix specifies the location of view files.
								//by default the view resolver point to webApp folder.
		return resolver;
	}
	public EntityManagerFactory getEmf()
	{
		return Persistence.createEntityManagerFactory("dev");
	}
}
