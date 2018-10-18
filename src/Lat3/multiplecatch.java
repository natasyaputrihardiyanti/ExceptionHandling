/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat3;

/**
 *
 * @author acer
 */
public class multiplecatch {
    public static void main(String []args){
        try {
            int a = 3/0; //berpotensi untuk menimbulkan kesalahan yaitu pemabgian dengan blangan 0
            int num= Integer.parseInt(args[0]);
            System.out.println("Perintah selanjutnay..");
        }
        catch (ArrayIndexOutOfBoundsException e){
        }
        catch (NullPointerException e){
        }
        catch (Exception e){
            
        }
    }
            
}
