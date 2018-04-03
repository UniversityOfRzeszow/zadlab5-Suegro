/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Liczba {

    public char cyfry[];
    public int dlugosc;
    Scanner odczyt = new Scanner(System.in);
    
    Liczba()
    {
        System.out.println("Prosze podac liczbe");
        String liczba = odczyt.next();
        this.dlugosc = liczba.length();
        
        for(int i = 0;i<dlugosc;i++)
        {
            this.cyfry[i] = liczba.charAt(i);
        }   
    }
    
    public void wypisz()
    {
        for(int i = 0;i<dlugosc;i++)
        {
            System.out.print(cyfry[i]);
        }
    }
    
    public void mnozenie()
    {
        System.out.println("Prosze podac liczbe");
        String a="";
        int liczba1;
        int liczba2 = odczyt.nextInt();
        for(int i = 0;i<dlugosc;i++)
        {
            a = a+cyfry[i];
        }
        
        liczba1=(int)a;
       
    }
    
     public static void main(String args[])
    {
       Liczba cyfry = new Liczba();
       //cyfry.wypisz();
    }
    
}
