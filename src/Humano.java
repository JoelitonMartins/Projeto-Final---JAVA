public class Humano extends Herois {

    public Humano(String nome, int vida, int armadura) {
        super(nome, vida, armadura);
    }

    @Override
    protected int getModificadorAtaque(Personagem alvo) {
        if (alvo instanceof Troll) {
            return 5; // Bônus de ataque contra Trolls
        }
        return 0;
    }
}
