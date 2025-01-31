public class Hobbit extends Herois {

    public Hobbit(String nome, int vida, int armadura) {
        super(nome, vida, armadura);
    }

    @Override
    protected int getModificadorAtaque(Personagem alvo) {
        if (alvo instanceof Troll) {
            return -5; // Penalidade de ataque contra Trolls
        }
        return 0;
    }
}

