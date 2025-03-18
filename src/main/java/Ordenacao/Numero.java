package Ordenacao;

public class Numero implements Comparable<Numero> {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nr-> ").append(numero).append(" ");
        return sb.toString();
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(this.getNumero(), n.numero);
    }
}
