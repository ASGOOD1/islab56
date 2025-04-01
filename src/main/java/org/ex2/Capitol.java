package org.ex2;

import java.util.ArrayList;

public class Capitol {
    String titlu;
    Integer nr;
    String rezumat;
    ArrayList<Sectiune> sectiuni;
    public Capitol(String titlu, Integer nr, String rezumat) {
        this.nr=nr;
        this.titlu=titlu;
        this.rezumat = rezumat;
        sectiuni=new ArrayList<>();
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public String getRezumat() {
        return rezumat;
    }

    public void setRezumat(String rezumat) {
        this.rezumat = rezumat;
    }

    public ArrayList<Sectiune> getSectiuni() {
        return sectiuni;
    }
    public void addSectiune(Sectiune s) {
        sectiuni.add(s);
    }
}
