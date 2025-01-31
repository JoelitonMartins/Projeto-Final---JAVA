public class SenhorDosAneis {
    public static void main(String[] args) {
        Exército heróis = new Exército();

        // ALTERAÇÃO: Adicionando um Mago ao exército dos heróis
        heróis.adicionarPersonagem(new Mago("Gandalf", 100, 20));
        heróis.adicionarPersonagem(new Elfo("Legolas", 150, 30));
        heróis.adicionarPersonagem(new Hobbit("Frodo", 20, 10));
        heróis.adicionarPersonagem(new Hobbit("Sam", 30, 15));

        Exército bestas = new Exército();
        bestas.adicionarPersonagem(new Orc("Lurtz", 200, 60));
        bestas.adicionarPersonagem(new Orc("Shagrat", 220, 50));
        bestas.adicionarPersonagem(new Troll("Uglúk", 120, 30));
        bestas.adicionarPersonagem(new Troll("Mauhúr", 100, 30));

        Batalha batalha = new Batalha(heróis, bestas);
        batalha.iniciarBatalha();
    }
}

