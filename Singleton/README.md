# Singleton Design Pattern

### What is a Singleton Design Pattern ?
    Singleton is a creational design pattern that lets you ensure that a class has only one instance, 
    while providing a global access point to this instance.

### When to use a Singleton Design Pattern ?
    1. Use the Singleton pattern when a class in your program should have just a single instance available to all clients; 
        for example, a single database object shared by different parts of the program.
    2. Use the Singleton pattern when you need stricter control over global variables.

### How to implement a Singleton Design Pattern ?
    1. Add a private static field to the class for storing the singleton instance.
    2. Declare a public static creation method for getting the singleton instance.
    3. Implement “lazy initialization” (he pattern of putting off the creation of an object or process until it is needed) 
        inside the static method. It should create a new object on its first call and put it into the static field. 
        The method should always return that instance on all subsequent calls.
    4. Make the constructor of the class private. The static method of the class will still be able to call the constructor, 
        but not the other objects.
    5. Go over the client code and replace all direct calls to the singleton’s constructor with calls to its static creation method.



