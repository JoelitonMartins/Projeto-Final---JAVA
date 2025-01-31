public class Elfo extends Herois {

    public Elfo(String nome, int vida, int armadura) {
        super(nome, vida, armadura);
    }

    @Override
    protected int getModificadorAtaque(Personagem alvo) {
        if (alvo instanceof Orc) {
            return 10; // Bônus de ataque contra Orcs
        }
        return 0; // Sem modificador adicional
    }
}


