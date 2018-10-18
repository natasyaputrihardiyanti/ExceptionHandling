/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MelakukanInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author acer
 */
public class demoNumerik2 {
   public static void main(String[]args)throws IOException{
       System.out.println("Masukan sebuah Bilangan ril : " );
       String tem ;
       double bilangan = 0 ;
       
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader br = new BufferedReader (isr);
       tem = br.readLine();
       
       try {
           bilangan = Double.parseDouble(tem);
       }catch (NumberFormatException nfe){
           System.out.println("Data yg dimasukkan bukan bilangan ");
           System.exit(1);
       }
       System.out.println("Bilangan yg diaksukkan "+"adalah"+bilangan);
       }
   } 

