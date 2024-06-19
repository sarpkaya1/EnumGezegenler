package org.example;

public enum Gezegen {
    MERKUR(1,57.9,2440,1416),
    VENUS(2,108.2,6052,5632),
    DUNYA(3,149.6,6371,24),
    MARS(4,227.9,3389,25),
    JUPITER(5,778.3,69911,10),
    SATURN(6,1430.0,58232,11),
    URANUS(7,2870.0,25362,17),
    NEPTUN(8,4500.0,24622,16);

    private int guneseGoreNo;
    private double uzaklık;
    private int yarıCap;

    private int donmeSuresi;

    public int getGuneseGoreNo() {
        return guneseGoreNo;
    }

    public double getUzaklık() {
        return uzaklık;
    }

    public int getYarıCap() {
        return yarıCap;
    }

    public int getDonmeSuresi() {
        return donmeSuresi;
    }

    Gezegen(int guneseGoreNo,double uzaklık, int yarıCap, int donmeSuresi){
        this.guneseGoreNo = guneseGoreNo;
        this.uzaklık = uzaklık;
        this.yarıCap = yarıCap;
        this.donmeSuresi = donmeSuresi;
    }





















}
