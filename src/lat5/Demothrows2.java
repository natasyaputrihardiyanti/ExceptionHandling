/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat5;

/**
 *
 * @author acer
 */
public class Demothrows2 {
    public static void uji (int angka)throws NullPointerException , ArithmeticException {
        if (angka,0){
        throw new NullPointerException ("Kesalahan : null pointer exception");
    }else{
            throw new ArithmeticException("KESALAHAN : arithmetic exception");
            }
    }
    public static void main (String[]args){
        try {
            uji(0);
        }catch (Exception e){
            System.out.println("Exception di tangkap disini");
            System.out.println(e.getMessage());
        }
        System.out.println("Statmen setelah blok try-catch");
        
    }
        
    }
