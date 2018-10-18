/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat6;

/**
 *
 * @author acer
 */
public class demomembuatekspresi3 {
  public static int hitungFaktorial (int n)
          throws NegativeNumberException{
      if(n<0){
          throw new NegativeNumberException("Blangan tidak boleh negative", n);
      }
      int hasil = 1 ;
      for (int i =n ; i>=1 ; i--);
      hasil *= i ;
  
  return hasil ;
  }

public static void main(String[]args){
System.out.println("Pada saa menghitung 5 :");
try{
    System.out.println("Hasil = "+hitungFaktorial(5));
}catch (NegativeNumberException nne){
    System.out.println("Bilangan : "+nne.getBilangan());
}
    System.out.println("\nPada saat Menghitung -5! ");
    try {
        System.out.println("Hasil ="+hitungFaktorial(-5));
    }catch (NegativeNumberException nne){
        System.out.println("Bilangan : "+nne.getBilangan());
        nne.printStackTrace();
}
}
}



  
      
  
          
