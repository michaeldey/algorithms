/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ReadCSV.readCSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mdey
 */
public class readCSV
{
    public static void main (String args[]) throws FileNotFoundException
    {
        // get scanner instance
        Scanner scanner = new Scanner(new File("/Users/mdey 1/Desktop/school/Algorithms/Algorithms/src/algorithms/ReadCSV/readCSV/books.csv"));
        
        //set the delimiter used in file
        scanner.useDelimiter(",");
        
        //get all tokens and store them in some data structure
        //this is just printing them
        while(scanner.hasNext()){
            System.out.print(scanner.next() + " | ");
        
        }
        
        //close the scanner
        scanner.close();
    }
}
