package com.jg.excepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        String numerador = JOptionPane.showInputDialog("Ingrese un numerador");
        String denominador = JOptionPane.showInputDialog("Ingrese un denominador");
        double division;

        try {

            division = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division);

        } catch (FormatoNumeroException fne) {
            System.err.println("Excepcion de tipo FormatoNumeroException: " + fne.getMessage());
            fne.printStackTrace(System.err);

        } catch (DivisionPorCeroException ae) {
            System.err.println("Excepcion de tipo DivsionPorCeroExcepcion: " + ae.getMessage());
            ae.printStackTrace(System.err);

        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepción.");
        }

        System.out.println("\nContinuando con el flujo de la aplicacion...");

    }
}
