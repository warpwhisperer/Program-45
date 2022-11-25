package src;
            
public class Logger {

       private static final int MAX_WHITESPACES = 2;
       
       public static void s(String row1, String row2) {
                String whitespaces = new String(new char[Math.abs(row1.length()-MAX_WHITESPACES)]).replace('\0', ' ');
                String line = String.format("%s"+whitespaces+"%s", row1, row2);
                System.out.println(line);
                }
       
            }