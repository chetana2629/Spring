package example.spring.mvc.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringApplicationInitialization implements WebApplicationInitializer {

	private WebApplicationContext getContext() {
				AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.setConfigLocation("example");
		// The code is quivalent to
		// @ComponentScan(basePackages="controller")
		return webCtx;
	}

	@Override
	public void onStartup(ServletContext servletContextRef) throws ServletException {
		// This method gets called when the application is getting loaded
		System.out.println("Application is beging loaded");
		WebApplicationContext webCtxRef = getContext();
		DispatcherServlet frontControllerRef = new DispatcherServlet(webCtxRef);

		ServletRegistration.Dynamic registration =
		servletContextRef.addServlet("frontController",
				frontControllerRef);
		
		registration.addMapping("/");

	}

}
