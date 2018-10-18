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
public class ThrowDemo {
    public static void main(String []args){
        String input = "invalid input";
        try{
            if(input.equals("Invalid input")){
                throw new RuntimeException("trow demo");
            }else{
                System.out.println(input);
            }
            System.out.println("After trowing");
        }
        catch (RuntimeException e){
            System.out.println("Exception caught here..");
            System.out.println(e);
            
            }
        }
    }

