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
public class DemoInputKarakter {
    public static void main(String[]args) throws IOException{
        System.out.println("Masukan sembarang Karakter : ");
        char ch ;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ch = (char)br.read();
        System.out.println("Karakter yg dimaksukan adalah \'" +ch + "\'");
    }
}
