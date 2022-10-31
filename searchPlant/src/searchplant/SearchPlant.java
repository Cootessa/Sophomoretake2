/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchplant;

//imports used
import java.util.*; //import for Scanner
import java.io.*; //import for File and IOException
import java.util.ArrayList; //import forArrayList class from java.util package


/**
 *
 * @author malika
 */
public class SearchPlant {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //opens file to read
        Scanner fileIn;
        fileIn = new Scanner(new File("plants.txt"));
         //1st array that holds plant name
        ArrayList<String> name = new ArrayList();
        //2nd array that holds hardiness zones
        ArrayList<String> zone = new ArrayList();

        //while loop to read through txt file
        while (fileIn.hasNext()) {
            //adding elements to arrays
            name.add(fileIn.nextLine());
            zone.add(fileIn.nextLine());    
        }

        //close file
        fileIn.close();

        //prints header for columns 
        System.out.println("Plant Name  Zones");

        //for loop to print plant name + hardiness zone from array
        for (int i = 0; i < name.size(); i++) {
            //output
            System.out.println("" + name.get(i) + "  \n" + zone.get(i));
        }
        
    }
    
    
}
