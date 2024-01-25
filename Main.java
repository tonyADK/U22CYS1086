import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner class to collect input from user
        Scanner userInput = new Scanner(System.in);

        //Variables where input for first and second numbers will be stored
        long firstNumberValue;
        long secondNumberValue;

        //Variable where the result of calculation will be stored;

        //While loop so user can continuosly use calculator
        while(true){
            //Getting input for first number
            System.out.print("Enter First number: ");
            //Checking if number is the required data type ie handeling edge case
            if(userInput.hasNextLong()){
                //if input is of required datatype it gets stored in firstNumberValue variable
                firstNumberValue = userInput.nextLong();

                //Getting input for second number
                System.out.print("Enter Second number: ");
                //Checking if number is the required data type ie handeling edge case
                if(userInput.hasNextLong()){
                    //if input is of required datatype it gets stored in secondNumberValue variable
                    secondNumberValue = userInput.nextLong();

                    //Getting input for operation (+, -, *, /)
                    System.out.print("Enter Operator (+, -, *, /): ");
                    String operator = userInput.next();

                    //Logical statement for checking type of operation user wants to carry out
                    if(operator.equals("+")){
                        //checking if operation is addition
                        addingTwoNumbers(firstNumberValue, secondNumberValue);
                    }else if(operator.equals("-")){
                        //checking if operation is subtraction
                        subtractingTwoNumbers(firstNumberValue, secondNumberValue);
                    }else if(operator.equals("*")){
                        //checking if operation is multiplication
                        MultiplyingTwoNumbers(firstNumberValue, secondNumberValue);
                    }else if(operator.equals("/")){
                        //checking if operation is division
                        DividingTwoNumbers(firstNumberValue, secondNumberValue);
                    }else if(operator.equalsIgnoreCase("quit")){
                        //Checking if user typed quit so we can exit the program by breaking out of loop
                        System.out.println("Exiting program...");
                        break;
                    }else{
                        //if all of the above cases result to false then we tell the user type a valid operator
                        System.out.println("Invalid operator");
                    }
                }else {
                    //if the input for the second number was not the expected input we execute the code below

                    //using scanner class so if the user typed quit we exit program
                    String input = userInput.next();
                    if(input.equalsIgnoreCase("quit")){
                        //If user typed quit the below code is executed
                        System.out.println("Exiting program...");
                        break;
                    }else{
                        /*if the input is not the expected data type of long and is not quit we tell the
                        user and restart the program
                         */
                        System.out.println("Error: Input has to be a number");
//                        userInput.next();
                    }
                }


            }else{
                //if the input for the first number was not the expected input we execute the code below

                //using scanner class so if the user typed quit we exit program
                String input = userInput.next();
                if(input.equalsIgnoreCase("quit")){
                    //If user typed quit the below code is executed
                    System.out.println("Exiting program...");
                    break;
                }else{
                    /*if the input is not the expected data type of long and is not quit we tell the
                        user and restart the program
                     */
                    System.out.println("Error: Input has to be a number");
//                    userInput.next();
                }
            }

        }
    }


    public static void addingTwoNumbers(long firstNumber, long secondNumber){
        //Function for adding numbers
        double additionResult = Math.addExact(firstNumber, secondNumber);
        System.out.println(additionResult);
    }

    public static void subtractingTwoNumbers(long firstNumber, long secondNumber){
        //Function for subtracting numbers
        double subtractionResult = Math.subtractExact(firstNumber, secondNumber);
        System.out.println(subtractionResult);
    }

    public static void MultiplyingTwoNumbers(long firstNumber, long secondNumber){
        //Function for multiplying numbers
        double multiplicationResult = Math.multiplyExact(firstNumber, secondNumber);
        System.out.println(multiplicationResult);
    }

    public static void DividingTwoNumbers(long firstNumber, long secondNumber){
        //Function for dividing numbers

        //Checking if user is trying to divide numbers by 0
        if(secondNumber != 0){
            //If user is not trying to divide by 0 the below code executes
            double divisionResult = (double) firstNumber / (double) secondNumber;
            System.out.println(divisionResult);
        }else{
            //if user tries to divide a number by 0 the below is printed
            System.out.println("Can not divide by 0");
        }
    }
}