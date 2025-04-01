package org.ex2;

public class Sectiune {
    String titlu;
    Integer nr;

    public Sectiune(String titlu, Integer nr) {
        this.titlu=titlu;
        this.nr = nr;
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
}
