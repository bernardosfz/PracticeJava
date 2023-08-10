import java.util.Scanner;

public class teste{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int listaCodigos[] = {1, 11, 21, 31, 41, 51, 61, 71, 81, 91};
        System.out.println("Digite um código");
        int codigoSelecionado = input.nextInt();

        int validador = 0;

        for (int codigo : listaCodigos) {
            if (codigo == codigoSelecionado) {
                    validador = 1;
                    break;
            }
        }
        if (validador == 1) {
            System.out.println("Existe");
        } else {
            System.out.println("Não Existe");
        }
        input.close();
    }
}
