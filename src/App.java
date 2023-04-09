import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada em m²:  ");
        double area = sc.nextDouble();
        System.out.println("");

        double cobertura = area / 6 * 1.10;
        double latas = Math.ceil(cobertura / 18);
        double galao = Math.ceil(cobertura / 3.6);

        double valorlata = latas * 80;
        double valorgalao = galao * 25;

        double latasmisturadas = Math.floor(cobertura / 18);
        double galaomisturado = Math.ceil((cobertura % 18) / 3.6);

        double valormisturado = (latasmisturadas * 80) + (galaomisturado * 25);

        // situação 1: comprar apenas latas de 18 litros
        System.out.println("Comprando apenas latas de 18 litros");
        System.out.println("Valor R$" + valorlata);
        System.out.println("Quantidade de latas: " + latas);
        System.out.println("");

        // situação 2: comprar apenas galões de 3.6 litros
        System.out.println("Comprando apenas galões de 3.6 litros");
        System.out.println("Valor R$" + valorgalao);
        System.out.println("Quantidade de galões " + galao);
        System.out.println("");

        // situação 3: misturar os 2
        System.out.println("comprando misturado ");
        System.out.println("valor R$ " + valormisturado);
        System.out.println("quantidade de latas " + latasmisturadas);
        System.out.print("quantidade de galões " + galaomisturado);

        sc.close();

    }
}
