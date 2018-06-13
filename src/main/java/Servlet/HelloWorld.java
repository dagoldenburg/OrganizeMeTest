package Servlet;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("helloWorld")
@SessionScoped
public class HelloWorld implements Serializable {

    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        return "Hello World!";
    }
}