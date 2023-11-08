package com.coding.bank;

public class banKtesting {

	public static void main(String[] args) {
        BankAccount banco = new BankAccount(); // Crear una instancia de BankAccount
        
        // Imprimir información de la cuenta
        System.out.println("Número de cuenta: " + banco.getNumCuenta());
        System.out.println("Saldo de cuenta corriente: $" + banco.getSaldoCtaCorriente());
        System.out.println("Saldo de cuenta ahorro: $" + banco.getSaldoCtaAhorro());
        System.out.println("Total de fondos: $" + banco.totalFondos());
        
        
        // Realizar depósito y retiro de ejemplo
        banco.deposito(50.0, "ahorro");
        banco.retirar(1000.0, "corriente");
        
        // Imprimir información actualizada de la cuenta
        System.out.println("Número de cuenta: " + banco.getNumCuenta());
        System.out.println("Saldo de cuenta corriente: $" + banco.getSaldoCtaCorriente());
        System.out.println("Saldo de cuenta ahorro: $" + banco.getSaldoCtaAhorro());
        System.out.println("Total de fondos: $" + banco.totalFondos());
    }

}
