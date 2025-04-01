package org.ex3;

import java.util.ArrayList;

public class Persoana {
    String name;
    Integer age;
    Persoana parent;
    ArrayList<Persoana> copii = new ArrayList<>();
    public Persoana(String name, Integer age) {
        this.parent=null;
        this.name=name;
        this.age=age;
    }
    public void addKid(Persoana p) {
        if(p.parent == this) return;
        this.copii.add(p);
        p.parent=this;
    }
    public void showCopii() {
        System.out.println("Copii:");
        for(Persoana p : copii) {
            System.out.println("\t"+ p.toString());
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + ":" + age+"ani");
        return sb.toString();
    }
}
