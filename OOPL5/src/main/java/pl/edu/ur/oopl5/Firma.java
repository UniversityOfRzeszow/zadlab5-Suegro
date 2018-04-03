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
public class Firma {
    
    Scanner odczyt = new Scanner(System.in);
    public int ilosc = 0;
    Pracownik pracownicy[] = new Pracownik[100];

    public void dodajPracownika()
    {
        System.out.println("Prosze podac imie, nazwisko, stanowisko oraz wiek pracownika");
        String i,n,s;
        int w;
        i = odczyt.next();
        n = odczyt.next();
        s = odczyt.next();
        w = odczyt.nextInt();
        
        pracownicy[ilosc] = new Pracownik(i,n,s,w);
        ilosc++;
    }
    
    public void pokazPracownikow()
    {
        
        System.out.println("Ilosc pracownikow: "+ilosc);
        for(int i=0;i<ilosc;i++)
        {
            System.out.println(i+". "+pracownicy[i].imie+" "+pracownicy[i].nazwisko+" "+pracownicy[i].stanowisko+" "+pracownicy[i].wiek);
        }
    }
    
}
