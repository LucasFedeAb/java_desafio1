package com.coderhouse;

public class SeparateIntegerDecimal {

	public static void main(String[] args) {
		float number = (float) 3.14;
        separateIntegerAndDecimal(number);
    }

    public static void separateIntegerAndDecimal(float number) {
        // Obtener numero entero
        int integerPart = (int) number;

        // Obtener decimal
        float decimalPart = number - integerPart;

        // Mostrar los resultados
        System.out.println("Numero entero = " + integerPart);
        System.out.println("Numero decimal = " + decimalPart);
    }
}
