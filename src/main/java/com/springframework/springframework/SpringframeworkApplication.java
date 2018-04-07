package com.springframework.springframework;

import com.springframework.springframework.controllers.ConstructorInjectionController;
import com.springframework.springframework.controllers.FieldInjectionController;
import com.springframework.springframework.controllers.MyController;
import com.springframework.springframework.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringframeworkApplication {

	public static void main(String[] args) {

		// The `run()` method returns the ApplicationContext
		ApplicationContext ctx = SpringApplication.run(SpringframeworkApplication.class, args);

		// This is how we get a ref to a Component/Bean in the Application Context.
		MyController myController = (MyController) ctx.getBean("myController");
		myController.hello();

		System.out.println(myController.sayHello());

		// This is a way to test the Application Context,
		// we get a controller bean and invoke one of his methods,
		// so we can make sure all injections works as expected.
		System.out.println(ctx.getBean(FieldInjectionController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
	}
}
