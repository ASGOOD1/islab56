package org;

import org.ex3.Persoana;
import org.ex4.*;
import org.ex5.*;

public class Main {
    public static void main(String[] args) {
        /* ex3
        Companie c = new Companie();
        Birou b1 = new Birou("Timisoara");
        Birou b2 = new Birou("Focsani");
        Departament d1 = new Departament(b1);

        Departament d2 = new Departament(b2);
        c.getDept().add(d1);
        c.getDept().add(d2);
        Manager m = new Manager(1, d1);
        Angajat a = new Angajat(2);
        System.out.println(c);

         */
        /* 3x4
        Persoana parinte = new Persoana("Popescu Ion", 40);
        Persoana copil1 = new Persoana("Popescu Mihai", 13);
        Persoana copil2 = new Persoana("Florea Minodora", 11);
        parinte.addKid(copil1);
        parinte.addKid(copil2);

        System.out.println(parinte);
        parinte.showCopii();

         */
        /*ex5
        Document asciiDocument = new Document("ASCII", "Document text in format ASCII.");
        Document postScriptDocument = new Document("PostScript", "Document PostScript cu imagini.");

        WorkstationNode workstation1 = new WorkstationNode("Workstation1", asciiDocument);
        WorkstationNode workstation2 = new WorkstationNode("Workstation2", postScriptDocument);
        PrinterNode asciiPrinter = new ASCIIPrinter("Imprimanta ASCII");
        PrinterNode postScriptPrinter = new PostScriptPrinter("Imprimanta PostScript");

        workstation1.sendToPrinter(asciiPrinter);
        workstation1.sendToPrinter(postScriptPrinter);
        workstation2.sendToPrinter(asciiPrinter);
        workstation2.sendToPrinter(postScriptPrinter);
        */
    }
}
