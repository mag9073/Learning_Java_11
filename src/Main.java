import java.util.Scanner; // need this imported to use Scanner data type
// learning java 11 with linkedin.com/learning

public class Main { // class name = Main
    // chapter 5: functions
    public static void announceDeveloperTeaTime() {
        // beginning of tea time function
        System.out.println("Waiting for developer tea time!");
        // print to ask user to type something to start tea time
        System.out.println("Type in a random word and press Enter to start the developer tea time!");
        Scanner inputTeaTime = new Scanner(System.in); // local to this function
        inputTeaTime.next(); // retrieves the input given by user
        System.out.println("It's developer tea time!");
    }

    // chapter 5: function with parameters
    // function with inputs in brackets (defined below)
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice; // the tip based on the meal price
        double tax = taxRate * listedMealPrice; // the tax based on the meal price
        double result = listedMealPrice + tip + tax; // total based on the tip, tax, and meal price
        System.out.println("Your total meal price is " + result); // prints total cost of meal
    }
    // chapter 5: function with return type
    // function with inputs in brackets (defined below) and a return type
    public static double calculateReturnMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice; // the tip based on the meal price
        double tax = taxRate * listedMealPrice; // the tax based on the meal price
        double result = listedMealPrice + tip + tax; // total based on the tip, tax, and meal price
        return result; // will return the result (double)
    }


    // chapter 5: calculate employee salary
    public static double grossAnnualSalary(double hoursWorkedPerWeek, int hoursVacation, double hourlyWage) {
        if (hoursWorkedPerWeek < 0) {
            return -1; // return -1 if hours worked are less than 0
        }

        if (hourlyWage < 0) {
            return -1; // return -1 if hourly wage is less than 0
        }
        double weeklyPay = (hoursWorkedPerWeek - hoursVacation) * hourlyWage;
        // input that accounts for unpaid vacation days; 1 day = 8 hours
        return weeklyPay * 52; // 52 weeks in a year
    }




    //
    public static void main(String[] args) { // function name = main
        // chapter 1: getting started with Java; printing Hello World
        // System.out.println("Hello World from me!"); // print out this statement


        // chapter 2: Building strong foundations
        // primitive data types (not capitalized)
        int studentAge = 25;
        double studentGPA = 3.85;
        // char studentFirstInitial = 'M'; // use different method below to access first initial
        // char studentLastInitial = 'G'; // use different method below to access last initial
        boolean hasPerfectAttendance = true;

        // reference variable types
        // string data type has double quotation
        String studentFirstName = "Mag"; // String is built out of characters
        String studentLastName = "Gordon"; // note String is capitalized

        // using charAt (a string operation) to access first and last initial
        char studentFirstInitial = studentFirstName.charAt(0); // 0 is the index number to be accessed in the string
        // variable studentFirstName; string operation is charAt
        char studentLastInitial = studentLastName.charAt(0); // 0 is the index number to be accessed



        // chapter 2: printing the data types
        System.out.println(studentAge); // print statement for student age
        System.out.println(studentGPA); // print statement for student GPA
        System.out.println(studentFirstInitial); // print statement for student first initial
        System.out.println(studentLastInitial); // print statement for student last initial
        System.out.println(hasPerfectAttendance); // print statement for student attendance
        System.out.println(studentFirstName); // print statement for student first name
        System.out.println(studentLastName); // print statement for student last name
        // concatenating strings: putting strings together in the same line
        // use + to concatenate and the literal string of " " (etc...) between the variables
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);


        // chapter 2: printing to ask user for input
        System.out.println("What do you want to update the GPA to?");
        // need to import java.util.Scanner;
        // Scanner gathers input from user
        Scanner input = new Scanner(System.in); // this is the input from user
        // Scanner is the data type; it is the user input; it is a tool to get user input
        studentGPA = input.nextDouble(); // this will be the input for the new
        // print statement for new GPA
        System.out.println(studentFirstName + " " + studentLastName + " has an updated GPA of " + studentGPA);


        // chapter 3: Control flow
        System.out.println("Please pick a number between 1 and 10!"); // asks user to input number
        Scanner scanner = new Scanner(System.in); // scanner reads the int input by user

        int inputtedNum = scanner.nextInt(); // variable inputtedNum is saved here
        // if statement used: if true performs one action (using if), if false performs another action (using else)
        // makes a decision about inputtedNum using if-else
        if (inputtedNum < 5) {
            System.out.println("Number less than 5 was chosen, enjoy the finer things in life!");
        } else {
            System.out.println("Number greater than 5 was chosen, enjoy everything as it comes!");
        }

        // condition of music player on repeat using while statement
        Scanner newInput = new Scanner(System.in); // set up scanner
        boolean isOnRepeat = true; // true if on repeat
        while(isOnRepeat) {
            // while condition is true, run these statements
            System.out.println("This is playing the current song on repeat!"); // print statement for user
            // print statement asking user for input
            System.out.println("Would you like me to remove this current song on repeat? If so, answer yes");
            String userInput  = newInput.next(); // save input into string called userInput

            if(userInput.equals("yes")) {
                isOnRepeat = false; //  if user inputs yes, it makes isOnRepeat false

            }
        }
        System.out.println("Ok! Time to play the next song!");

        // multiple choice question to print out mc question and notification of answer
        Scanner newAnswer = new Scanner(System.in); // set up scanner
        String question = "What is 9-3?"; // this is the question
        String choiceOne = "7"; // this is choice 1
        String choiceTwo = "6"; // this is choice 2
        String choiceThree = "5"; // this is choice 2

        String correctAnswer = choiceTwo;
        System.out.println(question); // this is the question
        System.out.println("choose one of the following answers: " + choiceOne + ", " + choiceTwo + ", " + choiceThree + ".");
        String userAnswer = newAnswer.next(); // save user answer into string called newAnswer

        if (correctAnswer.equals(correctAnswer)) {
            System.out.println("Congratulations! You are correct!"); // print this if correct
        } else {
            System.out.println("Sorry, your answer is incorrect! The correct answer was " + correctAnswer); //print this if incorrect
        }


        // chapter 4: debugging (corrected)
        System.out.println("Let's calculate the area of a triangle!"); // initial print statement

        Scanner inputHere = new Scanner(System.in); // set up the Scanner

        System.out.println("Please input the base of the triangle in inches: "); // ask for user input for base
        double base = inputHere.nextDouble(); // assign base to input

        while (base <= 0) {
            System.out.println("That's not valid. Please input the base of the triangle in inches: ");
            base = input.nextDouble(); // base must be positive
        }
        System.out.println("Please input the height of the triangle in inches: "); // ask for user input for height
        double height = inputHere.nextDouble(); // assign height to input

        while (height <=0) {
            System.out.println("That's not valid. Please input the height of the triangle in inches: ");
            height = input.nextDouble(); // height must be positive
        }
        double area = (base * height) / 2; // formula for area of triangle
        System.out.println("Area = " + area); // print the area of the triangle


        // chapter 5: functions
        System.out.println("Welcome to your new job!");

        announceDeveloperTeaTime(); // call the function (was defined outside the main function)
        // it is called here inside the main function
        System.out.println("Write the code!"); // print this statement
        System.out.println("Review the code!"); // print this statement

        announceDeveloperTeaTime(); // call the function again

        System.out.println("Get promotion!!!"); // print this statement


        // chapter 5: function with parameters
        calculateTotalMealPrice(15, .2, 0.08);
        calculateTotalMealPrice(25, .18, 0.08);

        // chapter 5: function with return type
        // calculate the total of the meal for the group
        double groupTotalMealPrice = calculateReturnMealPrice(100, .2, 0.08);
        System.out.println(groupTotalMealPrice); //  print the total

        double individualMealPrice = groupTotalMealPrice / 5; // divides the total meal price by 5
        System.out.println(individualMealPrice); // prints the individual price of meal

        // chapter 5: built-in functions
        // Math is part of the java standard library, so you can call it without defining
        double result = Math.pow(2, 5); // using the Math pow() function; 2 as base, 5 as exponent
        System.out.println(result); // print result, that is the saved answer of the function

        // chapter 5: calculate employee salary
        double salary = grossAnnualSalary(40, 8, 37.50); // call function
        System.out.println("The gross amount salary is $" + salary); // print out gross salary


        // this is part of chapter 6: classes in java
        // Triangle class
        // triangle instances (making triangle A and B) in Main class using constructor from Triangle class
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        // area for triangle instances created; findArea is an instance method (non-static) and is called with instances
        // triangleA and triangleB
        double triangleAArea = triangleA.findArea(); // use method to find area of triangle A
        System.out.println(triangleAArea); // print out area of triangle A

        double triangleBArea = triangleB.findArea(); // use method to find area of triangle B
        System.out.println(triangleBArea); // print out area of triangle B

        // use dot operator on sideLenThree (on triangleA) to access (non-static) instance variable sideLenThree
        System.out.println(triangleA.sideLenThree); // sideLenThree; instance variable

        // use dot operator on base (on triangleB) to access (non-static) instance variable base
        System.out.println(triangleB.base); // base; instance variable

        // access static variable (numOfSides) with class name Triangle and print out
        System.out.println(Triangle.numOfSides); // numOfSides, class variable; associated with the whole class

        // this is part of chapter 6: classes in java
        // Student Class
        // Student instances; making student A and B in Main class using constructor from Student Class
        Student studentA = new Student("Kennedy", "John", 2025, 3.9, "Science");
        Student studentB = new Student("Homer", "Graham", 2025, 3.87, "Mathematics");

        // need to increment graduation year with incrementYearToGraduate, will be called with instances studentA and
        // studentB
        studentA.incrementYearToGraduate(); // call increment year to graduate for student A
        System.out.println(studentA.expectedYearToGraduate); // instance variable incremented for student A

        studentB.incrementYearToGraduate(); // call increment year to graduate for student B
        System.out.println(studentB.expectedYearToGraduate); // instance variable incremented for student B


    }
}
