package org.javatechie;
import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Provide full path for directory(change
        // accordingly)

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter directory: ");
        String directory= sc.nextLine();
        gfg object=new gfg();
        object.printContents(directory);
    }

}
