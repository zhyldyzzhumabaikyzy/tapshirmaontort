package com.company;

public class Class {
    private int[] nomer;
    private String[] soz;
    private int[] massiv;


    public Class(int[] nomer) {
        this.nomer = nomer;
    }

    public Class(String[] soz) {
        this.soz = soz;
    }


    public int[] getNomer() {
        return nomer;
    }

    public void setNomer(int[] nomer) {
        this.nomer = nomer;
    }

    public String[] getSoz() {
        return soz;
    }

    public void setSoz(String[] soz) {
        this.soz = soz;
    }

    public int[] getMassiv() {
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }
}
