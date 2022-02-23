import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean next = true;
        Calculator calc = new Calculator();
        do{
            Scanner myObj = new Scanner(System.in);
            String input = myObj.nextLine();
            if (input.equals("quit"))
                next = false;
            else {
                String[] splitStr = input.trim().split("\\s+");
                if (splitStr[0].equals("add")){
                    System.out.println(calc.add(Integer.parseInt(splitStr[1]), Integer.parseInt(splitStr[2])));
                }
                else if (splitStr[0].equals("subtract")){
                    System.out.println(calc.subtract(Integer.parseInt(splitStr[1]), Integer.parseInt(splitStr[2])));
                }
                else if (splitStr[0].equals("multiply")){
                    System.out.println(calc.multiply(Integer.parseInt(splitStr[1]), Integer.parseInt(splitStr[2])));
                }
                else if (splitStr[0].equals("divide")){
                    System.out.println(calc.divide(Integer.parseInt(splitStr[1]), Integer.parseInt(splitStr[2])));
                }
                else if (splitStr[0].equals("fibonacci")){
                    System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(splitStr[1])));
                }
                else if (splitStr[0].equals("binary")){
                    System.out.println(calc.intToBinaryNumber(Integer.parseInt(splitStr[1])));
                }
            }
        }while(next);
    }
}
