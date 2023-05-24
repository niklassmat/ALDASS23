import java.util.Scanner;
import java.util.Stack;

public class Ex02LE4 {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Do you want to enter an operator or a number? Press 1 for operator and 2 for number, something else for printing the result and terminating the program.");
            int nextOp = scanner.nextInt();
            if (nextOp==1){
                System.out.println("Which operation do you want to do? +, -, * or / ?");
                String operation = scanner.next();
                if(operation.equals("+")){
                    double last = stack.lastElement();
                    stack.pop();
                    double secondLast = stack.lastElement();
                    stack.pop();
                    stack.push(last+secondLast);
                    System.out.println(stack);
                }
                else if(operation.equals("-")){
                    double last = stack.lastElement();
                    stack.pop();
                    double secondLast = stack.lastElement();
                    stack.pop();
                    stack.push(secondLast-last);
                    System.out.println(stack);
                }
                else if(operation.equals("*")){
                    double last = stack.lastElement();
                    stack.pop();
                    double secondLast = stack.lastElement();
                    stack.pop();
                    stack.push(last*secondLast);
                    System.out.println(stack);
                }
                else if(operation.equals("/")){
                    double last = stack.lastElement();
                    stack.pop();
                    double secondLast = stack.lastElement();
                    stack.pop();
                    stack.push(secondLast/last);
                    System.out.println(stack);
                }
            }
            else if (nextOp==2) {
                System.out.println("Which number do you want to enter?");
                double number = scanner.nextDouble();
                stack.push(number);
                System.out.println(stack);


            }
            else {
                System.out.println("Your result: " + stack);
                break;
            }

        }

    }
}
