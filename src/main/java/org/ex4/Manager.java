package org.ex4;

public class Manager extends Angajat{
    Departament departament = null;
    public Manager(Integer ID, Departament departament) {
        super(ID);
        this.departament = departament;
        departament.manager=this;
    }
}
