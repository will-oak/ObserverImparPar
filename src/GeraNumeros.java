public class GeraNumeros implements CriaNumero, NotificadoraDeGeracaoDeNumero {
    private EscutaGeracaoDeNumeros escutaGeracaoDeNumeros;

    public GeraNumeros(EscutaGeracaoDeNumeros escutaGeracaoDeNumeros) {
        this.escutaGeracaoDeNumeros = escutaGeracaoDeNumeros;
    }

    @Override
    public void notificaMudanca(int numero) {
        this.escutaGeracaoDeNumeros.atualiza(numero);
    }
    @Override
    public void criaNumero() {
        int numero = (int) (Math.random() * ((100) + 1));
        this.escutaGeracaoDeNumeros.atualiza(numero);
    }
}
