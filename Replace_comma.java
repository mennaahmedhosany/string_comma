/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace_comma;

import java.util.Scanner;

/**
 *
 * @author ORIGINAL
 */
public class Replace_comma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  input=new Scanner(System.in);
            String line  ;
            System.out.println("enter the string");
               line=input.next();
                line=line.replaceAll(","," ");

           System.out.println(line); 
    }
    
}
