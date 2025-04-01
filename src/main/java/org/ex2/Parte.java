package org.ex2;

import java.util.ArrayList;

public class Parte {
    String titlu;
    Integer nr;

    ArrayList<Capitol> capitole;

    public Parte(String titlu, Integer nr) {
        this.titlu = titlu;
        this.nr = nr;
        capitole = new ArrayList<>();
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

    public ArrayList<Capitol> getCapitole() {
        return capitole;
    }
    public void addCapitol(Capitol c) {
        capitole.add(c);
    }
}
