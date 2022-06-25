public class EscutaGeracaoDeNumeros implements Observador {
    void observaCriacaoDeNumeros(int numero) {
        System.out.println("Acabou de chegar a notificacao do numero " + numero);
        if (ePar(numero)) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é impar");
        }
    }

    private boolean ePar(int numero) {
        return numero % 2 == 0;
    }

    @Override
    public void atualiza(int numero) {
        this.observaCriacaoDeNumeros(numero);
    }
}
