package mvc;

/**
 *
 * @author Milena
 */
public class modelo {

    private double numero;
    private double resultado;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double Resultado) {
        this.resultado = Resultado;
    }

    public double Seno() {
        double A = 0,
                i = 0,
                D = 0;
        double H, T, Q, fact, S, R;
        D = Math.toRadians(this.numero);
        while (i <= 1000) {
            T = Math.pow((-1), i);
            Q = ((2 * i) + 1);
            fact = 1;
            if (Q == 0) {
                Q = 1;
            }
            while (Q != 0) {
                fact = fact * Q;
                Q--;
            }

            H = Math.pow(D, ((2 * i) + 1));
            R = H / fact;
            S = T * R;
            this.resultado = this.resultado + S;
            i = i + 1;
        }
        return this.resultado;
    }
}


