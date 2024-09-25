package spring_mvc_Helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer 
{

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		Class[] configClasses = {ConfigCLass.class};
		return configClasses;
	}

	@Override
	protected String[] getServletMappings() 
	{
		String[] urls = {"/"};
		return urls;
	}
	
}
