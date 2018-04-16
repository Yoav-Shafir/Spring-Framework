package com.springframework.springframework;

import com.springframework.springframework.controllers.ConstructorInjectionController;
import com.springframework.springframework.controllers.FieldInjectionController;
import com.springframework.springframework.controllers.MyController;
import com.springframework.springframework.controllers.SetterInjectionController;
import com.springframework.springframework.thirdparty.A.A;
import com.springframework.springframework.thirdparty.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// By default Spring scans for Components from the current location
// to all child packages.
// If we want to specify where Spring should scan
// we can do something like this:
// @SpringBootApplication(scanBasePackageClasses = {SpringframeworkApplication.class, SomeOtherClass.class})
@SpringBootApplication
@EnableJpaAuditing
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

		// Simple tests to get the "thirdparty" class which we set as a @Bean
        // using java configuration.
		Person person1 = ctx.getBean(Person.class);
		person1.setName("Yoav");
		System.out.println(person1.getName());

        Person person2 = (Person) ctx.getBean("person");
        person2.setName("Yoav");
        System.out.println(person2.getName());

        // Testing the A interface implementations.
        System.out.println(ctx.getBean(A.class).toString());
	}
}
