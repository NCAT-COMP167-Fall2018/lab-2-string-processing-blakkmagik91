/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author krystophermcrae
 */
public class Lab2StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] records= new String[100];
        try{
            Scanner input= new Scanner(new File(args[0]));
            int index=0;
            while(input.hasNext()){
                String[] line=input.nextLine().split(",");
                String fName=line[0];
                String lName=line[1];
                String gender=line[2];
                String age=line[3];
                String phoneNumber=line[4];
                String emailAddress=line[5];
                records[index]=String.format("%-20s%-20s%-20s%-20s%-20s%-20s", fName, lName, gender,age, phoneNumber, emailAddress ); 
                System.out.println(records[index]);
                index++;
                
            }
        }catch(FileNotFoundException ex){
            System.err.println("File Not Found");
        }
    }
  //  public static void readFile(){
        
    }
    

