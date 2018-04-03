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
public class Stos {
    
    private int liczby[];
    private int wskaznik = 0;
    Scanner odczyt = new Scanner(System.in);
    
    Stos(int rozmiar)
    {
        this.wskaznik = rozmiar-1;
        System.out.println("Prosze podac"+rozmiar+"liczb calkowitych");
        for(int i = 0;i<rozmiar;i++)
        {
            liczby[i] = odczyt.nextInt();
        }
    }

    public int[] getLiczby() {
        return liczby;
    }

    public int getWskaznik() {
        return wskaznik;
    }

    public void setLiczby(int[] liczby) {
        this.liczby = liczby;
    }

    public void setWskaznik(int wskaznik) {
        this.wskaznik = wskaznik;
    }
    
    
    
    public void push()
    {
        System.out.println("Prosze podac liczbe calkowita");
        int liczba;
        liczba = odczyt.nextInt();
        
        liczby[wskaznik] = liczba;
        wskaznik++;
    }
    
    public int pop()
    {
        wskaznik--;
        if(wskaznik<0)
        {
            wskaznik = 0;
            System.out.println("Stos jest pusty");
            
        }
           
        return liczby[wskaznik];
        
        
    }
    
    
    
}
