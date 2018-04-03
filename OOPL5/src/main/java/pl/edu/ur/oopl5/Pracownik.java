/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Dominik
 */
public class Pracownik {
    
    public String imie;      
    public String nazwisko; 
    public String stanowisko;
    public int wiek;        

    
    public Pracownik(String imie, String nazwisko,String stanowisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek = wiek;
    }
    
    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Pracownik() {
    }

    public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("stanowisko: " + this.stanowisko);
        System.out.println("wiek: " + this.wiek + " lat");
    }
} 
    

