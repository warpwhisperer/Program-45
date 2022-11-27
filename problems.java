package src;
import java.util.ArrayList;
import java.util.Scanner;

public class problems {
    Scanner read = new Scanner(System.in);//just for the initial user choice input
    boolean done = false;
//individual STATIC methods that have the functionality to return to the index loop 

    
    public void num1(){
        ArrayList<Double> xValue = new ArrayList<>();
        ArrayList<String> iValue = new ArrayList<>(); 

        String lineBreak = System.getProperty("line.separator");
        Scanner scan = new Scanner(System.in);
        
        while(done==false) {
                    
        System.out.println("\n" + "You have chosen 'The Value of a Quadratic'." + "Proceed?" 
                + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
        String answer = read.nextLine();
        
                switch (answer){
                        
                case "1" -> {                       
                         
                    
                System.out.print("You have chosen to proceed. Input value: ");
                int numberOfValue = Integer.parseInt(scan.nextLine());
                for (int i=0; i<numberOfValue; i++ ) 
                {
                    
                    System.out.println("Enter value of x: ");
                    String num = scan.nextLine();
                    iValue.add(num);
                    Double x = str_input.eval(num);
                    xValue.add(x);            
                                      
                    if (i >= numberOfValue)
                    break;

                } 
                
                System.out.println("Inputs Processed."+ lineBreak + "Number of Values: " + numberOfValue + "." + "\n");
                System.out.print("Calculations Processed." + lineBreak + lineBreak);
                //loop to show results.
                for(int i = 0; i < xValue.size(); i++)
                {    
                    System.out.print("At X = " + iValue.get(i) + " the value is: ");
                        Double X = (xValue.get(i));
                        System.out.print(((3*((X)*(X)))-(8*(X))+4) + lineBreak);
                    if (i>=xValue.size())
                        break;
                    } 
          
            
            }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
        
    public void num2(){             
        ArrayList<Double> xValue = new ArrayList<>();
        String lineBreak = System.getProperty("line.separator");        
        Scanner scan = new Scanner(System.in);
        
    
        while(done==false) {
                    
        System.out.println( "\n" + "You have chosen 'The Value of a Quadratic[Modified]'. Proceed?" 
                + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
        String answer = read.nextLine();
        
                switch (answer){
                        
                case "1" -> {                       
                        
                 
                for (int i=0; i<3; i++ ) 
                {
                    
                    System.out.println("Enter value of x: ");
                    String x = scan.nextLine();
                    Double value = str_input.eval(x);
                    xValue.add(value);            
                                      
                    if (i >= 3)
                    break;

                } 

                System.out.println("Inputs Processed."+ lineBreak + "Number of Values: 3." + "\n");
                System.out.print("Calculations Processed." + lineBreak + lineBreak);
                //loop to show results.
                for(int i = 0; i < xValue.size(); i++)
                {    
                    System.out.print("At X = " + xValue.get(i) + " the value is: ");
                        Double X = (xValue.get(i));
                        Double value = ((3*((X)*(X)))-(8*(X))+4);
                        System.out.print(value + "\n");
                                            
                        
                        if (i>=xValue.size())
                        break;
                    } 
          
            
            }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
    
    public void num3(){

        String[] months = {"April", "May", "June"};
        Double[] rainfall = new Double[3];
        
        
    
        while(done==false) {
                    
        System.out.println( "\n" + "You have chosen 'Average Rain Fall'. Proceed?" 
                + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
        String answer = read.nextLine();
        
                switch (answer){
                        
                case "1" -> {                       
                Scanner scan = new Scanner(System.in);        
                double sum = 0;
                System.out.print("\n");
                for (int i=0; i<months.length; i++ ){
                    
                    System.out.print("Rainfall for " + months[i] + ": ");
                        if(!scan.hasNextDouble()){
                            System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        
                    rainfall[i] = scan.nextDouble();
                    sum += rainfall[i];
                    if (i >= months.length)
                    break;
                    
                        
                }
                
                double AVGrainfall = sum/3;
                System.out.println("The average rainfall is: " + AVGrainfall);
                                                 
            }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
    
    public void num4(){

        while(done==false) {
                    
        System.out.println("\n" + "You have chosen 'Trigonometry'. Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {
                        Scanner sc = new Scanner(System.in);//1.63/0500 / 0866
                            
                        System.out.println("Enter the value of radians: ");
                        if(!sc.hasNextLine()){
                                    System.out.println("That is an Invalid Value!");
                                    break; }    
                            String initValue = sc.nextLine();
                            Double xValue = str_input.eval(initValue);
                            double sin = Math.sin(xValue);
                            double cos = Math.cos(xValue);
                            double sum = (cos*cos) + (sin*sin);
                            
                        System.out.println("sine: " + sin + " cosine: " + cos + " sum: " + sum);
                }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
    
    public void num5(){

        while(done==false) {
                    
         System.out.print("\n" + "You have chosen 'Trigonometry[Degrees to Radians]'. Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {
                        Scanner sc = new Scanner(System.in);//1.63/0500 / 0866  (loss of accuracy? from 0.500 to 4.9999
                            
                        System.out.println("Enter the degrees: ");
                        if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break; }    
                            int degrees = sc.nextInt();
                            double xValue = degrees*Math.PI/180;
                            double sin = Math.sin(xValue);
                            double cos = Math.cos(xValue);
                            double sum = (cos*cos) + (sin*sin);
                        
                        Logger.s("Initial degrees: " + degrees, "Radians: " + xValue);
                        System.out.println("sine: " + sin + " cosine: " + cos + " sum: " + sum);
                        
                             }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
    
    public void num6(){

        while(done==false) {
                    
        System.out.println("\n"+ "You have chosen 'Area of a Circle'. Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Input the radius: ");
                        String input = sc.nextLine();
                        Double radius = str_input.eval(input);
                        Double area = (radius*radius)*Math.PI;           
                        System.out.println("The radius is:" + radius + "The area is:" +area);

                       
                             }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
    
    public void num7(){

        while(done==false) {
                    
        System.out.println("\n" + "You have chosen 'Cents to Dollars'. Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                    Scanner sc = new Scanner(System.in);    
                    
                    System.out.println("Input the number of cents: ");
                    if(!sc.hasNextInt()){
                        System.out.println("That is an invalid value!");
                        break;
                        }
                    int input = sc.nextInt();
                    int dollars = Math.round((int) input / 100);
                    input = input % 100;
                    int cents = Math.round((int) input / 1);                    
                                    
                        System.out.println("You have " + dollars + " dollars, and " + cents + " cents.");
                            
                             }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
    
    public void num8(){

        while(done==false) {
                    
        System.out.println("\n" + "You have chosen 'Correct Change'. Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        Scanner sc = new Scanner(System.in);    
                    
                    System.out.println("Input the number of cents: ");
                    if(!sc.hasNextInt()){
                        System.out.println("That is an invalid value!");
                        break;
                        }
                    int change = sc.nextInt();     
                    int dollars = Math.round((int) change / 100);
                    change = change % 100;
                    int quarters = Math.round((int) change / 25);
                    change = change % 25;
                    int dimes = Math.round((int) change / 10);
                    change = change % 10;
                    int nickels = Math.round((int) change / 5);
                    change = change % 5;
                    int cents = Math.round((int) change / 1);
                    
                    System.out.print("Your change is: ");
                    System.out.print(dollars + " dollars, ");
                    System.out.print(quarters + " quarters, ");
                    System.out.print(dimes + " dimes, ");
                    System.out.print(nickels + " nickels, ");
                    System.out.print(" and " + cents + " cents. ");                
                                    
                        
                    }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
    
    public void num9(){

        while(done==false) {
                    
        System.out.println("\n" + "You have chosen 'Ohm's Law'. Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {
                    
                    Scanner sc = new Scanner(System.in);
                    
                        System.out.println("Input the voltage: ");
                    if(!sc.hasNextInt()){
                        System.out.println("That is an invalid value!");
                        break;
                        }
                    double volts = sc.nextInt()+0.0;
                     
                    System.out.println("Input the resistance (in Ohms): ");
                    if(!sc.hasNextInt()){
                        System.out.println("That is an invalid value!");
                        break;
                        }
                    int ohms = sc.nextInt();
                    double ohmslawCurrent = volts/ohms; 
                    
                    System.out.println("The current is (in amps) is: " + ohmslawCurrent);
                    
                    }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
    
    public void num10(){

        while(done==false) {
                    
        System.out.println("\n"+"You have chosen 'Annual Electricity Consumption Cost'. Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Input the cost per kilowatt-hour (in cents): ");
                    if (!sc.hasNextDouble()) {
                        System.out.println("That is an invalid value!");
                        break;
                    }
                    double costperKWH = sc.nextDouble();

                    System.out.println("Input the kilowatt-hours used per year: ");
                    if (!sc.hasNextDouble()) {
                        System.out.println("That is an invalid value!");
                        break;
                    }
                    double peryearKWH = sc.nextDouble();
                    
                    System.out.println("The annual cost is: " + (peryearKWH*costperKWH));
                    
                             }
                        
                case "2" -> {
                            
                        System.out.println("Returning to Index...");
                        //returns to index class (in actuality creates a new index but it don't matter at this level
                        index.indexloop();
                        done = true;
                            
                            }
                    }//encloses switch statement 
                  
                    }//encloses while loop   
                
                
                }//this encloses the code block itself.
}//ENCLOSES THE CLASS /
