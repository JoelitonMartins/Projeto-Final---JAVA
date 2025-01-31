public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int vidaMaxima; // Novo atributo
    protected int armadura;

    public Personagem(String nome, int vida, int armadura) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida; // Vida máxima é definida na criação do personagem
        this.armadura = armadura;
    }

    // Método existente
    public void receberDano(int dano) {
        if (dano > 0) {
            this.vida -= dano;
            if (this.vida < 0) {
                this.vida = 0; // A vida não pode ser negativa
            }
        }
    }

    // Novo método para curar vida
    public void receberCura(int cura) {
        if (cura > 0) {
            this.vida += cura;
            if (this.vida > vidaMaxima) {
                this.vida = vidaMaxima; // Vida não pode exceder o máximo
            }
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public abstract int calcularAtaque(Personagem besta);
}



