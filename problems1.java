package src;
import java.util.Scanner;

public class problems1 {
    Scanner read = new Scanner(System.in);
    boolean done = false;
//individual STATIC methods that have the functionality to return to the index loop 

    
    public void num1(){
        
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
        Scanner sc = new Scanner(System.in);
        String[] arr = {"capacity", "gauge", "miles per gallon"};
        int[] input = new int[3];
        while(done==false) {
                    
        System.out.println("\n" + "You have chosen 'Last Chance Gas'. Proceed?" + "\n" + "Press 1 for yes. Press 2 to return to the Index.");
            String answer = read.nextLine();
                switch (answer){
                        
                case "1" -> {                       
                    
                    
                    for (int i = 0; i!=3; i++){
                            System.out.print("Input tank " + arr[i] + ": ");
                            if(!sc.hasNextInt()){
                                System.out.println("That is an Invalid Value!");
                                done=true;
                                index.index1();
                                }
                            input[i] = sc.nextInt();
                            double fuel = (input[0]*(input[1]/100.0));
                            int calc = (int)(fuel*(input[2]));
                            switch(arr[i]){
                                case "gauge" -> {
                                System.out.println("The total amount of fuel you have in the tank is:  " + (int)fuel);    
                                }
                                case "miles per gallon" -> {

                System.out.print("The distance you will be able to traverse by car is: " + calc + "\n" + "Verdict: ");
                            if(calc>=200){
                                System.out.println("SAFE!");
                                        } else {
                                System.out.println("GET GAS!");
                                    }
                                                            }
                                            }
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
