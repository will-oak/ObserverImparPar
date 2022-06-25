public class Teste {
    public static void main(String[] args) {
        EscutaGeracaoDeNumeros escutaGeracaoDeNumeros = new EscutaGeracaoDeNumeros();
        GeraNumeros geraNumeros = new GeraNumeros(escutaGeracaoDeNumeros);
        geraNumeros.criaNumero();
    }
}
