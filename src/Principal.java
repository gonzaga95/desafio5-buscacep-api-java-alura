import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        BuscadorCEP buscadorCEP = new BuscadorCEP();
        Scanner scanner = new Scanner(System.in);
        String cep;

        while (true) {
            System.out.println("Digite um CEP para busca: ");
            cep = scanner.nextLine();

            if (cep.contains(("sair"))) break;

            try {
                Endereco novoEndereco = buscadorCEP.buscaEndereco(cep);

                System.out.println(novoEndereco);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Tente novamente ou digite 'sair' ");
            }
        }
    }
}
