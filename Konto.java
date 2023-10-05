package com.milewskiarkadiuszmodul6.banking;

public class Konto {
    private String numerRachunku;
    private double stanKonta = 1223.03;
    private boolean debet = false;


    public void getAccount() {
        System.out.println(numerRachunku);
    }
    public double getAccountBalance() {
          return stanKonta;
    }
    public boolean isDebet() {
        if (debet) {
            System.out.println(
                    " Twoje konto nie jest debetowe wiec nie możesz zrobić na nim debetu.");
        } else {
            System.out.println("Twoje konto posiada opcję debetu ");
        }

        return debet;
    }

    public void setStanKonta(double stan) {
        System.out.println(stan);
    }

    public String setNumerRachunku(String numer) {
        return numer;
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
