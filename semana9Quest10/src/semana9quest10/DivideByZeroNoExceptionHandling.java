/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9quest10;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author marcos
 */
public class DivideByZeroNoExceptionHandling {

    public static int quociente(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("Por favor, entre um numerador inteiro: ");
                int numerador = scanner.nextInt();
                System.out.print("Por favor, entre um denominador inteiro: ");
                int denominador = scanner.nextInt();

                int resultado = quociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nExceção: %s\n", inputMismatchException);
                scanner.nextLine();
                System.out.println("Você deve inserir números inteiros. Por favor, tente novamente.\n");
            }
            catch(ArithmeticException arithmeticException){
                System.err.printf("\nExceção: %s\n", arithmeticException);
                System.out.println("Zero é um denominador inválido. Por favor, tente novamente.\n");
            }
        } while (continueLoop);
    }
}