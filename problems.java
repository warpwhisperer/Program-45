package src;
import java.util.Scanner;

public class problems {
    Scanner read = new Scanner(System.in);
    boolean done = false;
//individual STATIC methods that have the functionality to return to the index loop 

    
    public void num1(){      
        ArrayList<Double> xValue = new ArrayList<>();
        ArrayList<String> iValue = new ArrayList<>(); 

        String lineBreak = System.getProperty("line.separator");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
        String answer = read.nextLine();
        
        while(done==false) {
                    
        
        
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
                
                System.out.print("poop");


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

        while(done==false) {
                    
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        int numTerms, sum = 0, i = 0;
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Enter the number of values to be added: ");
                        if(sc.hasNextInt()){
                            numTerms = sc.nextInt();
                            int a[] = new int[numTerms];
                            
                        System.out.println("Enter the " + numTerms + " numbers ");

                            while (i < numTerms) {
                                if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        System.out.println("Enter  number  " + (i + 1) + ":");
                            a[i] = sc.nextInt();
                            sum += a[i];
                            i++;
                            }
                              }
                            System.out.println("sum is =" + sum);
                        
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

        while(done==false) {
                    
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        int numTerms, sum = 0, i = 0;
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Enter the number of values to be added: ");
                        if(sc.hasNextInt()){
                            numTerms = sc.nextInt();
                            int a[] = new int[numTerms];
                            
                        System.out.println("Enter the " + numTerms + " numbers ");

                            while (i < numTerms) {
                                if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        System.out.println("Enter  number  " + (i + 1) + ":");
                            a[i] = sc.nextInt();
                            sum += a[i];
                            i++;
                            }
                              }
                            System.out.println("sum is =" + sum);
                        
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
                    
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        int numTerms, sum = 0, i = 0;
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Enter the number of values to be added: ");
                        if(sc.hasNextInt()){
                            numTerms = sc.nextInt();
                            int a[] = new int[numTerms];
                            
                        System.out.println("Enter the " + numTerms + " numbers ");

                            while (i < numTerms) {
                                if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        System.out.println("Enter  number  " + (i + 1) + ":");
                            a[i] = sc.nextInt();
                            sum += a[i];
                            i++;
                            }
                              }
                            System.out.println("sum is =" + sum);
                        
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
                    
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        int numTerms, sum = 0, i = 0;
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Enter the number of values to be added: ");
                        if(sc.hasNextInt()){
                            numTerms = sc.nextInt();
                            int a[] = new int[numTerms];
                            
                        System.out.println("Enter the " + numTerms + " numbers ");

                            while (i < numTerms) {
                                if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        System.out.println("Enter  number  " + (i + 1) + ":");
                            a[i] = sc.nextInt();
                            sum += a[i];
                            i++;
                            }
                              }
                            System.out.println("sum is =" + sum);
                        
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
                    
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        int numTerms, sum = 0, i = 0;
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Enter the number of values to be added: ");
                        if(sc.hasNextInt()){
                            numTerms = sc.nextInt();
                            int a[] = new int[numTerms];
                            
                        System.out.println("Enter the " + numTerms + " numbers ");

                            while (i < numTerms) {
                                if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        System.out.println("Enter  number  " + (i + 1) + ":");
                            a[i] = sc.nextInt();
                            sum += a[i];
                            i++;
                            }
                              }
                            System.out.println("sum is =" + sum);
                        
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
                    
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        int numTerms, sum = 0, i = 0;
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Enter the number of values to be added: ");
                        if(sc.hasNextInt()){
                            numTerms = sc.nextInt();
                            int a[] = new int[numTerms];
                            
                        System.out.println("Enter the " + numTerms + " numbers ");

                            while (i < numTerms) {
                                if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        System.out.println("Enter  number  " + (i + 1) + ":");
                            a[i] = sc.nextInt();
                            sum += a[i];
                            i++;
                            }
                              }
                            System.out.println("sum is =" + sum);
                        
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
                    
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        int numTerms, sum = 0, i = 0;
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Enter the number of values to be added: ");
                        if(sc.hasNextInt()){
                            numTerms = sc.nextInt();
                            int a[] = new int[numTerms];
                            
                        System.out.println("Enter the " + numTerms + " numbers ");

                            while (i < numTerms) {
                                if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        System.out.println("Enter  number  " + (i + 1) + ":");
                            a[i] = sc.nextInt();
                            sum += a[i];
                            i++;
                            }
                              }
                            System.out.println("sum is =" + sum);
                        
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
                    
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        int numTerms, sum = 0, i = 0;
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Enter the number of values to be added: ");
                        if(sc.hasNextInt()){
                            numTerms = sc.nextInt();
                            int a[] = new int[numTerms];
                            
                        System.out.println("Enter the " + numTerms + " numbers ");

                            while (i < numTerms) {
                                if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        System.out.println("Enter  number  " + (i + 1) + ":");
                            a[i] = sc.nextInt();
                            sum += a[i];
                            i++;
                            }
                              }
                            System.out.println("sum is =" + sum);
                        
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
                    
        System.out.println("Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                        int numTerms, sum = 0, i = 0;
                        Scanner sc = new Scanner(System.in);
                            
                        System.out.println("Enter the number of values to be added: ");
                        if(sc.hasNextInt()){
                            numTerms = sc.nextInt();
                            int a[] = new int[numTerms];
                            
                        System.out.println("Enter the " + numTerms + " numbers ");

                            while (i < numTerms) {
                                if(!sc.hasNextInt()){
                                    System.out.println("That is an Invalid Value!");
                                    break;                                
                                                 }
                        System.out.println("Enter  number  " + (i + 1) + ":");
                            a[i] = sc.nextInt();
                            sum += a[i];
                            i++;
                            }
                              }
                            System.out.println("sum is =" + sum);
                        
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
    
//Gonna have ten max in a single class because holy shit
}//ENCLOSES THE CLASS
