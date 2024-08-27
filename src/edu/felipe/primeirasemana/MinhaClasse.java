package edu.felipe.primeirasemana;
public class MinhaClasse {

public static void main (String [] args) {

    /*System.out.print( "Olá turma, sejam bem vindos");

    int ano = 2024;

    ano = 2025;

    final String BR = "Brasil";
    
    String meuNome = "Felipe";

    int anoFabricacao = 2022;

    boolean verdadeira = false;

    anoFabricacao = 2018;*/

    String primeiroNome = "Felipe";
    String segundoNome = "Zerbinati";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
    System.out.println(nomeCompleto);

}

public static String nomeCompleto(String primeiroNome, String segundoNome){
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}