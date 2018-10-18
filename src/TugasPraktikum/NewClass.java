/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author acer
 */
public class NewClass {
     
12
IllegalAccessException Akses ke sebuah class tidak sahInstantiationException Usaha untuk membuat sebuah objek dari abstract class atau interface.
Aritmatic Exception NulPointerException 
class throwDemo{static void demoProc() {try {throw new NullPointerException("demo");}catch (NullPointerException e){
System.out.println("caught inside demoproc…");
 throw e; } }public static void main (String args[]) {try {demoProc();}catch (NullPointerException e) {System.out.println("recaugt : " + e);
}
