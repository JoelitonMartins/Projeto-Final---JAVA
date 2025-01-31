public class Troll extends Bestas {

    public Troll(String nome, int vida, int armadura) {
        super(nome, vida, armadura);
    }

    @Override
    protected int getModificadorAtaque(Personagem alvo) {
        if (alvo instanceof Hobbit) {
            return 10; // Bônus de ataque contra Hobbits
        }
        return 0;
    }
}

