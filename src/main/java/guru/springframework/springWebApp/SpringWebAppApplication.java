package guru.springframework.springWebApp;

import guru.springframework.springWebApp.domain.Author;
import guru.springframework.springWebApp.domain.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.AuthenticationException;

@SpringBootApplication
public class SpringWebAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringWebAppApplication.class, args);

		System.out.println("Welcome to Spring");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Book book1 = (Book) context.getBean("book1");
		Author author1 = (Author) context.getBean("author1");

		book1.setTitle("TravAll");

		Book book2 = (Book) context.getBean("book1");

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(author1);

	}

}
