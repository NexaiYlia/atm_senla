package com.nexai.model;

public class Atm {
    private int pinCode;
    private String cardNumber;
    private double balance;

    public Atm() {
    }

    public Atm(int pinCode, String cardNumber, double balance) {
        this.pinCode = pinCode;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Atm atm = (Atm) o;

        if (pinCode != atm.pinCode) return false;
        if (Double.compare(atm.balance, balance) != 0) return false;
        return cardNumber != null ? cardNumber.equals(atm.cardNumber) : atm.cardNumber == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = pinCode;
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atm{");
        sb.append("pinCode=").append(pinCode);
        sb.append(", cardNumber='").append(cardNumber).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
