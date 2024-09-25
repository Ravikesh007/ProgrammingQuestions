package mvc_helper;

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
		Class[]confiClasses = {ConfigClass.class};
		return confiClasses;
	}

	@Override
	protected String[] getServletMappings() 
	{
		String[] urls = { "/" };
		return urls;
	}
	
}
