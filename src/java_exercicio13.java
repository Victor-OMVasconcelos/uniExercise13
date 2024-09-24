import java.util.*;
public class java_exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salario bruto: ");
        double bruto = sc.nextDouble();
        System.out.println("Valor da prestação: ");
        double prest = sc.nextDouble();

        if (prest > (bruto*0.3)) {
            System.out.println("Emprestimo não pode ser concedido");
        }
        else {
            System.out.println("Emprestimo pode ser concedido");
        }
        System.out.println("Hi");



    }
}