package org.ex4;

import java.util.ArrayList;

public class Departament {
    ArrayList<Birou> birouri = new ArrayList<>();
    Birou birouCentral = null;
    Manager manager = null;

    public Departament(Birou central) {
        this.birouCentral= central;
        birouri.add(central);
        this.manager=null;
    }
    public void setManager(Angajat a) {
        if(manager == null) {
            manager= new Manager(a.nr, this);
        }
    }
    public void removeManager() {
        if(manager != null) {
            manager.departament = null;
            manager = null;
        }
    }
}
