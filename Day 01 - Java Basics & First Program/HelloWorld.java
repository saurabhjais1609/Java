/*
    Introduction to Java
    Java is a widely used programming language for building web, desktop, mobile, and enterprise applications.
	It is known for its simple syntax, portability, and powerful features that make development easier and more secure.
*/

/*
    Features of Java
	    Object-Oriented Programming: Supports modular and reusable code using classes, objects, inheritance, encapsulation, polymorphism, and abstraction.
	    Platform Independence: Java bytecode can run on any platform that provides a compatible JVM.
	    Robustness: Provides features such as automatic memory management, exception handling, and type checking.
        Security: Includes built-in mechanisms such as bytecode verification, class loading controls, and Java security APIs.
        Multithreading and Concurrency: Provides APIs for executing and coordinating multiple tasks concurrently.
        Rich Standard Library: Provides built-in APIs for collections, I/O, networking, concurrency, database connectivity, and other common programming tasks.
        Automatic Memory Management: The JVM manages object memory and automatically reclaims unreachable objects through garbage collection.
        High Performance: JVM technologies such as Just-In-Time (JIT) compilation can compile frequently executed bytecode into native machine code at runtime.
*/

/* 
    Hello World Program 
    The first program that developers usually write while learning any programming language. 
    It introduces the basic structure of a Java program, including a class, the main() method, and the statement used to display output on the console.
*/

public class HelloWorld {
    // The main method is the entry point of any Java application
    public static void main(String[] args) {
        // Prints "Hello, World!" to the terminal window.
        System.out.println("Hello World!");  
    }
}

/*
    Explanation:
        public class HelloWorld declares a public class named HelloWorld.
        public allows the class to be accessed from other classes.
        static allows the main() method to be invoked without creating an object of HelloWorld.
        void indicates that the main() method does not return a value.
        main() is the method that the Java launcher uses to start the application.
        String[] args stores command-line arguments passed to the program.
        System.out.println() prints the specified text and moves the cursor to the next line.
        "Hello, World!" is the string displayed on the console.
*/
