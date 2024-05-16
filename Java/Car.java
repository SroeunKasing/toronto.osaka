// 1.

public class Car {
    String make;
    String model;
    int year;

    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        
        Car input = new Car("Yamaha", "Sedan", 2019);

        System.out.println("The car is make by: " + input.make);
        System.out.println("The model is: " + input.model);
        System.out.println("It was release in: " +  input.year);
    }

}
// 2. 
// public class Student {
//     private String name;
//     private int rollNumber;
//     private static int numberOfStudents = 0;

//     // Constructor to initialize the instance variables
//     public Student(String name, int rollNumber) {
//         this.name = name;
//         this.rollNumber = rollNumber;
//         numberOfStudents++; // Increment the static variable
//     }

//     // Getter method for numberOfStudents (optional)
//     public static int getNumberOfStudents() {
//         return numberOfStudents;
//     }

//     public static void main(String[] args) {
//         // Create several Student objects
//         Student student1 = new Student("Alice", 101);
//         Student student2 = new Student("Bob", 102);
//         Student student3 = new Student("Charlie", 103);

//         // Print the total number of students
//         System.out.println("Total number of students: " + Student.getNumberOfStudents());
//     }
// }

// 3. 

// public class Calculator {
//     public static void add(int a, int b) {
//         int result = a + b; // Calculate the sum
//         System.out.println("Sum of " + a + " and " + b + " is: " + result);
//     }

//     public static void main(String[] args) {
//         // Example usage
//         add(10, 20);
//     }
// }