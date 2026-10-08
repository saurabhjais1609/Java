/* 
    Day 01 - HelloWorld.java
    Hello World Program is the first program commonly used to learn Java. 
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