package edu.felipe.primeirasemana;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception{
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; // Type mismatch: cannot convert from int to short
        short numeroCurto2 = (short) numeroNormal; // forma correta.
        int numero = 5;
        numero = 10;
        System.out.print(numero);
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 10.75; // so pode mudar se tiver sem o final. convenção - CAIXA ALTA.
        
    }
    
}
