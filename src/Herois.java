import java.util.Random;

public abstract class Herois extends Personagem {

    public Herois(String nome, int vida, int armadura) {
        super(nome, vida, armadura);
    }

    /**
     * Defini um modificador base de ataque, podendo ser sobrescrito pelas subclasses.
     *
     * @param alvo O personagem que está sendo atacado.
     * @return O valor do modificador.
     */
    protected int getModificadorAtaque(Personagem alvo) {
        return 0; // Sem modificadores por padrão
    }

    @Override
    public int calcularAtaque(Personagem alvo) {
        Random rand = new Random();
        int ataqueBase = rand.nextInt(101); // Ataque base entre 0 e 100
        return Math.max(0, ataqueBase + getModificadorAtaque(alvo)); // Aplica o modificador
    }
}


