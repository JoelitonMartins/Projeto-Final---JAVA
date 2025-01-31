public class Orc extends Bestas {

    public Orc(String nome, int vida, int armadura) {
        super(nome, vida, armadura);
    }

    @Override
    protected int getModificadorAtaque(Personagem alvo) {
        if (alvo instanceof Humano) {
            return 10; // Bônus de ataque contra Humanos
        }
        return 0;
    }
}

