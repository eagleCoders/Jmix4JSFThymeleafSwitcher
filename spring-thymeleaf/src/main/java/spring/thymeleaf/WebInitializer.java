/**
 * 
 */
package spring.thymeleaf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spring.thymeleaf.configuration.WebConfiguration;

/**
 * 
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WebConfiguration.class };
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
