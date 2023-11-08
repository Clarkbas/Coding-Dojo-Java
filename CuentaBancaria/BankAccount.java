package com.coding.bank;

import java.util.Random;

public class BankAccount {
    // Atributos
    private String numCuenta;
    private double saldoCtaCorriente = 1000.0;
    private double saldoCtaAhorro = 100.0;
    // Variable static
    private static int ctasCreadas = 0;
    private static double totalSaldo = 0.0;
    public BankAccount() {
        super();
        this.numCuenta = generarCuenta();
        ctasCreadas++; // Incrementa el contador de cuentas creadas
    }
    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public double getSaldoCtaCorriente() {
        return saldoCtaCorriente;
    }
    // Método que permite depositar dinero en su cuenta corriente
    public void setSaldoCtaCorriente(double saldoCtaCorriente) {
        this.saldoCtaCorriente = saldoCtaCorriente;
    }
    public double getSaldoCtaAhorro() {
        return saldoCtaAhorro;
    }
    // Método que permite depositar dinero en su cuenta Ahorro
    public void setSaldoCtaAhorro(double saldoCtaAhorro) {
        this.saldoCtaAhorro = saldoCtaAhorro;
    }

    
     // Devuelve una representación en cadena de la cuenta bancaria.
    public String toString() {
        return "BankAccount [getNumCuenta()=" + getNumCuenta() + ", getSaldoCtaCorriente()=" + getSaldoCtaCorriente()
                + ", getSaldoCtaAhorro()=" + getSaldoCtaAhorro() + ", totalFondos()=" + totalFondos() + "]";
    }
    //  Genera un número de cuenta de 10 dígitos aleatorios.
    private String generarCuenta() {
        String numCta = "";
        Random rdm = new Random();
        for (int i = 0; i < 10; i++) {
            numCta += String.valueOf(rdm.nextInt(9));
        }
        return numCta;
    }
     // Realiza un depósito en la cuenta especificada.
    public void deposito(double monto, String cuenta) {
        if (cuenta.equals("ahorro")) {
            this.saldoCtaAhorro += monto;
            System.out.println("cuenta ahorro(DEPOSITO) + $" + monto);
        } else if (cuenta.equals("corriente")) {
            this.saldoCtaCorriente += monto;
            System.out.println("cuenta corriente(DEPOSITO) + $" + monto);
        } else {
            System.out.println("Debe depositar en cuenta <ahorro> o <corriente>");
        }
        totalSaldo += monto;
    }
    
     //Realiza un retiro de la cuenta especificada.
     // El monto a retirar.
     // La cuenta de la que se realizará el retiro ("ahorro" o "corriente").
       public void retirar(double monto, String cuenta) {
        if (cuenta.equals("ahorro")) {
            if (monto <= this.saldoCtaAhorro) {
                this.saldoCtaAhorro -= monto;
                totalSaldo -= monto;
                System.out.println("cuenta ahorro(RETIRO) - $" + monto);
            } else {
                System.out.println("Fondos insuficientes en cuenta ahorro!");
            }
        } else if (cuenta.equals("corriente")) {
            if (monto <= this.saldoCtaCorriente) {
                this.saldoCtaCorriente -= monto;
                totalSaldo -= monto;
                System.out.println("cuenta corriente(RETIRO) - $" + monto);
            } else {
                System.out.println("Fondos insuficientes en cuenta corriente");
            }
        } else {
            System.out.println("Debe retirar de cuenta <ahorro> o <corriente>");
        }
    }

    
     //Devuelve el saldo total de todas las cuentas.
          //El saldo total de todas las cuentas.
        public double totalFondos() {
        return totalSaldo;
    }

    
     //Imprime la cantidad de cuentas creadas hasta el momento.
     
    public void cantidadCtas() {
        System.out.println(ctasCreadas);
    }

}