import java.util.Random;

public abstract class Bestas extends Personagem {

    public Bestas(String nome, int vida, int armadura) {
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
        int ataqueBase = rand.nextInt(91); // Ataque base entre 0 e 90
        return Math.max(0, ataqueBase + getModificadorAtaque(alvo)); // Aplica o modificador
    }
}

