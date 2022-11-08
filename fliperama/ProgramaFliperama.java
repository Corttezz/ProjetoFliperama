package fliperama;

public class ProgramaFliperama {
    public static void main(String[] args) {
        Jogo asteroids;
        Cartao cartao1;
        Cartao cartao2;

        asteroids = new Jogo();
        asteroids.setNomeJogo("Asteroids Atari");
        asteroids.setQuantidadeCreditos(50);

        cartao1 = new Cartao();
        cartao2 = new Cartao();

        cartao1.setSaldoAtual(500);
        cartao1.setNumeroCartao(10);

        cartao2.setSaldoAtual(200);
        cartao2.setNumeroCartao(20);

        Terminal t1 = new Terminal();

        t1.verificarSaldoCartao(cartao2);
        
        CategoriaPremio premio = new CategoriaPremio();
        premio.setNome("Boneco");
        premio.setContagemTicketsNecessarios(100);
        premio.setQuantidadePremios(5);

        asteroids.passarCartaoParaJogar(cartao1);
        t1.trocarTicketPorPrêmio(cartao1, premio, 1);

        System.out.println("");
    }
}