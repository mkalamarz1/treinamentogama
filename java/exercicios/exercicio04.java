package exercicios;

import java.util.Scanner;

public class exercicio04 {
    Scanner entrada = Object  Scanner(System.in);
    final double TAXA_POR_KW = 500 // constante = o valor não pode ser alterado
    double salarioMinimo, kwConsumido;
    double valorKw, valorTotal, valorComDesconto;

    System.out.println("Digite o valor do salario minimo")
    salarioMinimo = entrada.nextDouble();
    System.out.println("Digite o consumo em Kw");
    kwConsumido = entrada.nextDouble();

    valorKw = salarioMinimo / TAXA_POR_KW;
    valorTotal = valorKw * kwConsumido;
    valorComDesconto = valorTotal * 0.85 // valortotal - valortotal * 0.15;

    System.out.println(" 1kw custa: R$" + valorKw);
    System.out.println("Valor Total: r$" + valorTotal);
    System.out.println("Valor com 15% de desconto R$" + valorComDesconto);

    entrada.close();




    
    
}
