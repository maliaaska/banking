package com.milewskiarkadiuszmodul6.banking;

public class Konto {
    public String numerRachunku = "1231238  292939 2932 9392";
    private double stanKonta = 111.923;
    private boolean debet = false;


    public void getAccount() {
        System.out.println(numerRachunku);
    }
    public void accountBalance() {
            System.out.println(stanKonta);
    }
    public boolean isDebet() {
        if ( debet == false ) {
            System.out.println("nie mozesz zrobic debetu na koncie");
        }
        return debet;
    }


    public void setStanKonta(double stan) {
        System.out.println(stan);
    }

    public void setNumerRachunku(String numer) {
        System.out.println(numer);
    }

    public boolean setDebet(boolean debet) {
        return debet;
    }

    private double wplacSrodki(double kwota) {
        stanKonta = stanKonta + kwota;
        return stanKonta;
    }

    private double wyplacSrodki(double kwota) {
        double srodki = stanKonta;
        if (!debet) {
            srodki = srodki - kwota;
        } else {
            if (debet && (srodki - kwota) < 0) {
                System.out.println("The account does not have a debet option. You cannot withdraw this amount.");
            }
        }

        return srodki;
    }
}
