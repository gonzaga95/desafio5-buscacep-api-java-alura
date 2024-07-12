public class Principal {
    public static void main(String[] args) {
        BuscadorCEP buscadorCEP = new BuscadorCEP();
        Endereco novoEndereco = buscadorCEP.buscaEndereco("79750000");

        System.out.println(novoEndereco);
    }
}
