import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Matriz matrizTeste = new Matriz(3, 4);
        matrizTeste.FillInput(sc);

        System.out.println(matrizTeste.ToString());

        Matriz gaussTeste = LinearAlgebra.Gauss(matrizTeste);
        System.out.println(gaussTeste.ToString());

        Matriz matrizTeste2 = new Matriz(2, 2);
        matrizTeste2.FillInput(sc);

        Matriz transpostaTeste = LinearAlgebra.Tranposta(matrizTeste, 5);
        System.out.println(transpostaTeste.ToString());

        Matriz somaTeste = LinearAlgebra.Soma(matrizTeste, matrizTeste2);

        System.out.println(somaTeste.ToString());

        Matriz dotTeste = LinearAlgebra.Dot(matrizTeste, matrizTeste2);
        System.out.println(dotTeste.ToString());

        Matriz multiplicacaoTeste = LinearAlgebra.Multiplicacao(matrizTeste, matrizTeste2);
        System.out.println(multiplicacaoTeste.ToString());
    }
}
