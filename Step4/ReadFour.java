package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {

            try {
                System.out.println("Writing to file....");

                PrintWriter fileOut = new PrintWriter("New text.txt");
                fileOut.println("Hello ");
                fileOut.close();

                System.out.println("DONE!");


                Scanner fileIn = new Scanner(new File("New text.txt"));
                System.out.println("Reading the file....");


                while (fileIn.hasNext()) {

                    String textIn = fileIn.nextLine();
                    String[] inputText = textIn.split(",");

                    int sum = 0;
                    for (int i = 0; i < inputText.length; i++) {
                        sum += Integer.parseInt(inputText[i]);
                    }

                    System.out.println("Done!");
                }

            }



            catch (IOException e) {
                System.out.println("File not found");
        }
            // Print out a running total of all the
            // values in the input file.
        }
}