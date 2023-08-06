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
                fileOut.println("4,");
                fileOut.println("4,");
                fileOut.println("4,");
                fileOut.println("4,");
                fileOut.println("4,");
                fileOut.println("4,");
                fileOut.println("4,");


                fileOut.close();

                System.out.println("DONE!");


                Scanner fileIn = new Scanner(new File("New text.txt"));
                System.out.println("Reading the file....");

                int sum = 0;
                do {

                    String textIn = fileIn.nextLine();
                    String[] inputText = textIn.split(",");

                    for (int i = 0; i < inputText.length; i++) {
                        sum += Integer.parseInt(inputText[i]);
                    }

                }  while (fileIn.hasNext());

                System.out.println("Done!");
                System.out.println(sum);

            }



            catch (IOException e) {
                System.out.println("File not found");
        }
            // Print out a running total of all the
            // values in the input file.
        }
}