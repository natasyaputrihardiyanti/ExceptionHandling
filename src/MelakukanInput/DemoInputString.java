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
public class DemoInputString {
    public static void main(String[]args)throws IOException {
        System.out.print("Masukan nama Anda : ");
        String nama ;
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader bf = new  BufferedReader(isr);
        nama = bf.readLine();
        System.out.println("Halo "+ nama + ", Sudahkah anda mengerti Java? ");
    }
}
