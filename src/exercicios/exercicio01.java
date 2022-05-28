package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio01 {
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("R$,##0.00");

    public void ex01 () {
        System.out.println("Hello World");
    }

    public void ex02 () {
        System.out.println("Informe um número: ");
        int number = scan.nextInt();

        System.out.println("O número informado foi: " + number);
    }

    public void ex03 () {
        
        System.out.println("Informe o 1° número: ");
        int number = scan.nextInt();
        System.out.println("Informe o 2° número: ");
        int number2 = scan.nextInt();

        int sum = number + number2;

        System.out.println("A soma dos números é igual a " + sum );
    }

    public void ex04 () {
        System.out.println("Digite o 1° número");
        double nota1 = scan.nextDouble();
        System.out.println("Digite o 2° número");
        double nota2 = scan.nextDouble();
        System.out.println("Digite o 3° número");
        double nota3 = scan.nextDouble();
        System.out.println("Digite o 4° número");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua media é: " + media);
    }

    public void ex05 () {
        System.out.println("Digite o valor em metros: ");
        double metros = scan.nextDouble();

        double cm = metros * 100;

        System.out.println(metros + " = " + cm);
    }

    public void ex06 () {
        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.pow(raio, 2) * 3.14;

        System.out.println("A área do círculo é: " + area);
    }

    public void ex07 () {
        System.out.println("Digite lado do quadrado: ");
        int lado = scan.nextInt();

        double area = Math.pow(lado, 2);

        System.out.println("O valoe da área é: " + area);
        System.out.println("O dobro dela é: " + area * 2);
    }

    public void ex08 () {
        System.out.println("Digite o sálario/horario");
        double salHora = scan.nextDouble();
        System.out.println("Digite o total de hora trabalhado no mês: ");
        int hora = scan.nextInt();

        double salario = salHora * hora;

        System.out.println("Seu sálario: " + salario);
    }

    public void ex09 () {
        System.out.println("Digite o valor da temperatura em °F");
        double f = scan.nextDouble();

        double c = 5 * (f-32) / 9;

        System.out.println(f + "°F = " + c + " °C");
    }

    public void ex10 () {
        System.out.println("Digite o valor da temperatura em °C");
        double c = scan.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.println(f + "°F = " + c + " °C");
    }

    public void ex11 () {
        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = scan.nextInt();
        System.out.println("Digite um número real: ");
        double num3 = scan.nextInt();

        double res1 = (2 * num1) + (num2 / 2 );
        double res2 = (3 * num1) + num3;
        double res3 = Math.pow(num3, 3);

        System.out.println("O produto do primeiro com medade do segundo: " +res1);

        System.out.println("A soma do triplo do primeiro com o terceiro: " + res2);

        System.out.println("O terceiro elevado ao cubo: " + res3);

    }

    public void ex12 () {
        System.out.println("Digite sua altura em metros: ");
        double altura = scan.nextDouble();

        double peso = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + peso);
    }

    public void ex13 () {
        System.out.println("Digite seu valor/hora que você ganha: ");
        double valorHora= scan.nextDouble();

        System.out.println("Digite o total de horas trabalado no mês: ");
        int horas = scan.nextInt();

        double salarioBruto = valorHora * horas;

        double ir = salarioBruto * 11 / 100;
        double inss =  salarioBruto * 8 / 100;
        double sindicado =  salarioBruto * 5 / 100;

        double salarioLiquido = salarioBruto - (ir + inss + sindicado);

        System.out.println(
            "Salário bruto: " + df.format(salarioBruto) +
            "\nImposto de renda: " + df.format(ir) +
            "\nINSS: " + df.format(inss) +
            "\nSindicado: " + df.format(sindicado) +
            "\nSalário Liquido: " + df.format(salarioLiquido));


    }

}
