package org.ex4;

import java.util.ArrayList;

public class Companie {
    ArrayList<Departament> departamente;
    public Companie() {
        departamente = new ArrayList<>();
    }
    public ArrayList<Departament> getDept() {
        return  this.departamente;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Companie\n");
        sb.append("Departamente: "+departamente.size()+"\n");
        sb.append("Detalii departamente: \n");
        for(Departament d : departamente) {
            if(d.manager != null) sb.append("Manager: " + d.manager.nr + "\n");
            else sb.append("Manager-ul nu este desemnat.\n");
            sb.append("Birou central: " + d.birouCentral.locatie);
            sb.append("\n");
            sb.append("Numar total birouri: " + d.birouri.size() + "\n\n");
        }
        return sb.toString();
    }
}
