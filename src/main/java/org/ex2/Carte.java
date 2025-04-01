package org.ex2;

import java.util.ArrayList;

public class Carte {
    String editor;
    String data;
    String ISBN;

    ArrayList<Parte> parti;

    public Carte(String editor, String data, String ISBN) {
        this.data=data;
        this.ISBN=ISBN;
        this.editor=editor;
        parti = new ArrayList<>();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public ArrayList<Parte> getParti() {
        return parti;
    }
    public void addParte(Parte parte) {
        parti.add(parte);
    }
}
