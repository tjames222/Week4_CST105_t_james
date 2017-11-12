/** Program: Read file to array
 * File: Player.java
 * Summary: Reads file and inserts text to a two dimensional array
 * Author: Tim James
 * Date: November 11, 2017
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileToArray {
    
    public static void main(String[] args) {
        
        String allText = "";
        char[][] array;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/timjames/Documents/inputFile.txt"));
            
                String readLine = "";
                
                while((readLine = reader.readLine()) != null) { 
                    allText += readLine;
                    
                    System.out.println(allText);
                }
                reader.close();
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        array = FillArray(allText);
        
        arrayOut(array);
        
    }
    
    public static char[][] FillArray(String completeText) {
        char[][] array = new char[20][45];
        int count = 0;
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 45; j++) {
                if (count < completeText.length()) {
                    array[i][j] = completeText.charAt(count);
                    System.out.println(array[i][j]);
                    count++;
            }
                else {
                    array[i][j] = '@';
                    
                }
            }
        }
        
        return array;
    
    }
    private static void arrayOut(char[][] array) {
        StringBuilder outText = new StringBuilder();
        
        for (int i = 0; i < 45; i++) {
            for (int j = 0; j < 20; j++) {
            outText.append(array[j][i]);
            }
        }
    
    System.out.println(outText);
    }
}
