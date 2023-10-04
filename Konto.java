package com.milewskiarkadiuszmodul6;

public class Konto {
    private String numerRachunku;
    private double stanKonta;
    private boolean debet = false;

    public String getAccount () {
        return numerRachunku;
    }

    public double accountBalance() {
        return stanKonta;
    }

    public boolean isDebet() {
        return debet;
    }

    public void setStanKonta() {
        System.out.println(20589.34);
    }

    public void setNumerRachunku() {
        System.out.println("81 5643 4567 0000 0001 2346");
    }

    public boolean setDebet() {
         return debet;
    }
}
