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

        Logger.s("PAGE","ONE" + "\n");

            Logger.s("Problem 1. The Blah Blah","Problem 6. The Blah Blah");
            Logger.s("Problem 2. The Blah Blah","Problem 7. The Blah Blah");
            Logger.s("Problem 3. The Blah Blah","Problem 8. The Blah Blah");
            Logger.s("Problem 4. The Blah Blah","Problem 9. The Blah Blah");
            Logger.s("Problem 5. The Blah Blah","Problem 10. The Blah Blah" +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: " );
            String choice = sc.nextLine();
    switch (choice){
        
        case "1","one" -> {
        System.out.println("You have chosen: Addition");
        run.num1();
        }
        case "2","two" -> {
        run.num2();    
        }
        case "3","three" -> {
        System.out.println("You have chosen: Addition");
        run.num3();
        }
        case "4","four" -> {
        run.num4();    
        }
        case "5","five" -> {
        System.out.println("You have chosen: Addition");
        run.num5();
        }
        case "6","six" -> {
        run.num6();    
        }
        case "7","seven" -> {
        System.out.println("You have chosen: Addition");
        run.num7();
        }
        case "8","eight" -> {
        run.num8();    
        }
        case "9","nine" -> {
        System.out.println("You have chosen: Addition");
        run.num9();
        }
        case "10","0","ten" -> {
        run.num10();    
        }
        case "next","n" -> {
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

        Logger.s("PAGE","TWO" + "\n");
            
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah" +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: ");
            String choice = sc.nextLine();
        switch (choice){
        
                case "1","one" -> {
        System.out.println("You have chosen: Addition");
        run.num1();
        }
        case "2","two" -> {
        run.num2();    
        }
        case "3","three" -> {
        System.out.println("You have chosen: Addition");
        run.num3();
        }
        case "4","four" -> {
        run.num4();    
        }
        case "5","five" -> {
        System.out.println("You have chosen: Addition");
        run.num5();
        }
        case "6","six" -> {
        run.num6();    
        }
        case "7","seven" -> {
        System.out.println("You have chosen: Addition");
        run.num7();
        }
        case "8","eight" -> {
        run.num8();    
        }
        case "9","nine" -> {
        System.out.println("You have chosen: Addition");
        run.num9();
        }
        case "10","0","ten" -> {
        run.num10();    
        }
        case "previous","p" -> {
        index.indexloop();    
        }
        case "next","n" -> {
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

        Logger.s("PAGE","THREE" + "\n");

            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah" +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: ");
            String choice = sc.nextLine();
    switch (choice){
        
                case "1","one" -> {
        System.out.println("You have chosen: Addition");
        run.num1();
        }
        case "2","two" -> {
        run.num2();    
        }
        case "3","three" -> {
        System.out.println("You have chosen: Addition");
        run.num3();
        }
        case "4","four" -> {
        run.num4();    
        }
        case "5","five" -> {
        System.out.println("You have chosen: Addition");
        run.num5();
        }
        case "6","six" -> {
        run.num6();    
        }
        case "7","seven" -> {
        System.out.println("You have chosen: Addition");
        run.num7();
        }
        case "8","eight" -> {
        run.num8();    
        }
        case "9","nine" -> {
        System.out.println("You have chosen: Addition");
        run.num9();
        }
        case "10","0","ten" -> {
        run.num10();    
        }
        case "previous","p" -> {
        index.index1();    
        }
        case "next","n" -> {
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

        Logger.s("PAGE","FOUR" + "\n");

            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah" +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: ");
            String choice = sc.nextLine();
    switch (choice){
        
                case "1","one" -> {
        System.out.println("You have chosen: Addition");
        run.num1();
        }
        case "2","two" -> {
        run.num2();    
        }
        case "3","three" -> {
        System.out.println("You have chosen: Addition");
        run.num3();
        }
        case "4","four" -> {
        run.num4();    
        }
        case "5","five" -> {
        System.out.println("You have chosen: Addition");
        run.num5();
        }
        case "6","six" -> {
        run.num6();    
        }
        case "7","seven" -> {
        System.out.println("You have chosen: Addition");
        run.num7();
        }
        case "8","eight" -> {
        run.num8();    
        }
        case "9","nine" -> {
        System.out.println("You have chosen: Addition");
        run.num9();
        }
        case "10","0","ten" -> {
        run.num10();    
        }
        case "previous","p" -> {
        index.index2();    
        }
        case "next","n" -> {
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

    Logger.s("PAGE","FIVE" + "\n");
    
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah");
            Logger.s("Problem 1. The Blah Blah","Problem 1. The Blah Blah" +"\n");
        
        System.out.print("Choose your program by inputting it's corresponding value: ");
            String choice = sc.nextLine();
    switch (choice){
        
                case "1","one" -> {
        System.out.println("You have chosen: Addition");
        run.num1();
        }
        case "2","two" -> {
        run.num2();    
        }
        case "3","three" -> {
        System.out.println("You have chosen: Addition");
        run.num3();
        }
        case "4","four" -> {
        run.num4();    
        }
        case "5","five" -> {
        System.out.println("You have chosen: Addition");
        run.num5();
        }
        case "6","six" -> {
        run.num6();    
        }
        case "7","seven" -> {
        System.out.println("You have chosen: Addition");
        run.num7();
        }
        case "8","eight" -> {
        run.num8();    
        }
        case "9","nine" -> {
        System.out.println("You have chosen: Addition");
        run.num9();
        }
        case "10","0","ten" -> {
        run.num10();    
        }
        case "previous","p" -> {
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

