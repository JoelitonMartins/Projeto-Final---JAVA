import java.util.Random;

public class Mago extends Herois {

    public Mago(String nome, int vida, int armadura) {
        super(nome, vida, armadura);
    }

    @Override
    protected int getModificadorAtaque(Personagem alvo) {
        if (alvo instanceof Orc || alvo instanceof Troll) {
            return 5; // Bônus de ataque contra Orcs e Trolls
        }
        return 0;
    }

    /**
     * Cura um aliado aumentando sua vida em um valor aleatório.
     *
     * @param aliado O personagem aliado a ser curado.
     */
    public void curarAliado(Personagem aliado) {
        if (aliado.estaVivo()) {
            Random rand = new Random();
            int cura = rand.nextInt(21) + 10; // Cura entre 10 e 30
            aliado.receberCura(cura);
            System.out.println(this.nome + " curou " + aliado.getNome() + " em " + cura + " pontos de vida!");
        } else {
            System.out.println(aliado.getNome() + " está morto e não pode ser curado.");
        }
    }
}
