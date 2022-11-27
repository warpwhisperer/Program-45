/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class index{
    
public static void indexloop(){
    Scanner sc = new Scanner(System.in);
    String lineBreak = System.getProperty("line.separator");
    problems run = new problems();   

        Logger.s("PAGE ONE", "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "1/4" + "\n");

            Logger.s("Problem 1. The Value of a Quadratic.","Problem 6. Area of a Circle.");
            Logger.s("Problem 2. The Value of a Quadratic[Modified].","Problem 7. Cents to Dollars.");
            Logger.s("Problem 3. Average Rain Fall.","Problem 8. Correct Change.");
            Logger.s("Problem 4. Trigonometry.","Problem 9. Ohm's Law.");
            Logger.s("Problem 5. Degrees to Radians.","Problem 10. Annual Electricity Consumption Cost." +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: " );
            String choice = sc.nextLine();
    switch (choice){
        
        case "1","one" -> {
        System.out.print("\n");
        run.num1();
        }
        case "2","two" -> {
        System.out.print("\n");
        run.num2();    
        }
        case "3","three" -> {
        System.out.print("\n");
        run.num3();
        }
        case "4","four" -> {
        System.out.print("\n");
        run.num4();    
        }
        case "5","five" -> {
        System.out.print("\n");
        run.num5();
        }
        case "6","six" -> {
        System.out.print("\n");
        run.num6();    
        }
        case "7","seven" -> {
        System.out.print("\n");
        run.num7();
        }
        case "8","eight" -> {
        System.out.print("\n");
        run.num8();    
        }
        case "9","nine" -> {
        System.out.print("\n");
        run.num9();
        }
        case "10","0","ten" -> {
        System.out.print("\n");
        run.num10();    
        }
        case "next","n" -> {
        System.out.print("\n");
        index.index1();
        }
        case "end" -> {
        System.out.print(lineBreak+lineBreak+lineBreak+"Program successfully terminated.");    
        break;
        }
        default -> {
        System.out.println("Invalid Input");
        index.indexloop();
        break;
        }    
    }
}
//indexloop sets the entire thing off, and points to other indexes. you can only traverse into adjacent indexes.
    
public static void index1(){
    Scanner sc = new Scanner(System.in);
    String lineBreak = System.getProperty("line.separator");
    problems1 run = new problems1();   

        Logger.s("PAGE TWO", "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "2/5" + "\n");
            
            Logger.s("Problem 1. Brick Drop.","Problem 6. Last Chance Gas");
            Logger.s("Problem 2. Base 2 Logarithm.","Problem 7. Pie Eating Contest");
            Logger.s("Problem 3. The Harmonic Mean.","Problem 8. Ground Beef Value Calculator");
            Logger.s("Problem 4. Discount Prices.","Problem 9. Y2K Problem Detector");
            Logger.s("Problem 5. Order Checker.","Problem 10. Internet Delicattessen" +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: ");
            String choice = sc.nextLine();
        switch (choice){
        
        case "1","one" -> {
        System.out.print("\n");
        run.num1();
        }
        case "2","two" -> {
        System.out.print("\n");
        run.num2();    
        }
        case "3","three" -> {
        System.out.print("\n");
        run.num3();
        }
        case "4","four" -> {
        System.out.print("\n");
        run.num4();    
        }
        case "5","five" -> {
        System.out.print("\n");
        run.num5();
        }
        case "6","six" -> {
        System.out.print("\n");
        run.num6();    
        }
        case "7","seven" -> {
        System.out.print("\n");
        run.num7();
        }
        case "8","eight" -> {
        System.out.print("\n");
        run.num8();    
        }
        case "9","nine" -> {
        System.out.print("\n");
        run.num9();
        }
        case "10","0","ten" -> {
        System.out.print("\n");
        run.num10();    
        }
        case "previous","p" -> {
        System.out.print("\n");    
        index.indexloop();    
        }
        case "next","n" -> {
        System.out.print("\n");
        index.index2();
        }
        case "end" -> {
        System.out.print(lineBreak+lineBreak+lineBreak+"Program successfully terminated.");    
        break;
        }
        default -> {
        System.out.println("Invalid Input");
        index.index1();
        break;
        }    
    }
    
    
}

public static void index2(){
    Scanner sc = new Scanner(System.in);
    String lineBreak = System.getProperty("line.separator");
    problems2 run = new problems2();   

        Logger.s("PAGE THREE", "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "3/5" + "\n");

            Logger.s("Problem 1. Steam Engine Efficiency.","Problem 6. More Tire Pressure.");
            Logger.s("Problem 2. Microwave Oven.","Problem 7. The Pressure is Building.");
            Logger.s("Problem 3. Fantasy Game.","Problem 8. Find the Range.");
            Logger.s("Problem 4. Check Charge.","Problem 9. String Repeater.");
            Logger.s("Problem 5. Tire Pressure.","Problem 10. Dot Loop." +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: ");
            String choice = sc.nextLine();
    switch (choice){
        
        case "1","one" -> {
        System.out.print("\n");
        run.num1();
        }
        case "2","two" -> {
        System.out.print("\n");
        run.num2();    
        }
        case "3","three" -> {
        System.out.print("\n");
        run.num3();
        }
        case "4","four" -> {
        System.out.print("\n");
        run.num4();    
        }
        case "5","five" -> {
        System.out.print("\n");
        run.num5();
        }
        case "6","six" -> {
        System.out.print("\n");
        run.num6();    
        }
        case "7","seven" -> {
        System.out.print("\n");
        run.num7();
        }
        case "8","eight" -> {
        System.out.print("\n");
        run.num8();    
        }
        case "9","nine" -> {
        System.out.print("\n");
        run.num9();
        }
        case "10","0","ten" -> {
        System.out.print("\n");
        run.num10();    
        }        
        case "previous","p" -> {
        System.out.print("\n");
        index.index1();    
        }
        case "next","n" -> {
        System.out.print("\n");
        index.index3();
        }
        case "end" -> {
        System.out.print(lineBreak+lineBreak+lineBreak+"Program successfully terminated.");    
        break;
        }
        default -> {
        System.out.println("Invalid Input");
        index.index2();
        break;
        }    
    }
}
public static void index3(){
    Scanner sc = new Scanner(System.in);
    String lineBreak = System.getProperty("line.separator");
    problems3 run = new problems3();   

        Logger.s("PAGE FOUR", "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "4/5" + "\n");

            Logger.s("Problem 1. Adding up Integers.","Problem 6. Wedge of Stars.");
            Logger.s("Problem 2. Exponential Sum.","Problem 7. Pine Tree.");
            Logger.s("Problem 3. Standard Deviation Calculator.","Problem 8. Miles per Gallon.");
            Logger.s("Problem 4. Adding up Squares and Cubes.","Problem 9. In-range Adder");
            Logger.s("Problem 5. Power of a Number.","Problem 10. The Shipping Cost Calculator" +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: ");
            String choice = sc.nextLine();
    switch (choice){
        
        case "1","one" -> {
        System.out.print("\n");
        run.num1();
        }
        case "2","two" -> {
        System.out.print("\n");
        run.num2();    
        }
        case "3","three" -> {
        System.out.print("\n");
        run.num3();
        }
        case "4","four" -> {
        System.out.print("\n");
        run.num4();    
        }
        case "5","five" -> {
        System.out.print("\n");
        run.num5();
        }
        case "6","six" -> {
        System.out.print("\n");
        run.num6();    
        }
        case "7","seven" -> {
        System.out.print("\n");
        run.num7();
        }
        case "8","eight" -> {
        System.out.print("\n");
        run.num8();    
        }
        case "9","nine" -> {
        System.out.print("\n");
        run.num9();
        }
        case "10","0","ten" -> {
        System.out.print("\n");
        run.num10();    
        }
        case "previous","p" -> {
        System.out.print("\n");
        index.index2();    
        }
        case "next","n" -> {
        System.out.print("\n");
        index.index4();
        }
        case "end" -> {
        System.out.print(lineBreak+lineBreak+lineBreak+"Program successfully terminated.");    
        break;
        }
        default -> {
        System.out.println("Invalid Input");
        index.index3();
        break;
        }    
    }
}

public static void index4(){
    Scanner sc = new Scanner(System.in);
    String lineBreak = System.getProperty("line.separator");
    problems4 run = new problems4();   

        Logger.s("PAGE FIVE", "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "5/5" + "\n");
    
            Logger.s("Problem 1. Area of Rectangles.","");
            Logger.s("Problem 2. Credit Card Bill.","");
            Logger.s("Problem 3. Drug Potency.","");
            Logger.s("Problem 4. Euler.","");
            Logger.s("Problem 5. Hello World.","" +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: ");
            String choice = sc.nextLine();
    switch (choice){
        
        case "1","one" -> {
        System.out.print("\n");
        run.num1();
        }
        case "2","two" -> {
        System.out.print("\n");
        run.num2();    
        }
        case "3","three" -> {
        System.out.print("\n");
        run.num3();
        }
        case "4","four" -> {
        System.out.print("\n");
        run.num4();    
        }
        case "5","five" -> {
        System.out.print("\n");
        System.out.println("Hello World.");
        }
        case "previous","p" -> {
        System.out.print("\n");
        index.index3();    
        }
        case "end" -> {
        System.out.print(lineBreak+lineBreak+lineBreak+"Program successfully terminated.");    
        break;
        }
        default -> {
        System.out.println("Invalid Input");
        index.index4();
        break;
        }    
    }
}
}  

