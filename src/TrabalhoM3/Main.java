package TrabalhoM3;

import TrabalhoM3.CampeonatoRepositorio;
import TrabalhoM3.JogadorAtacante;
import TrabalhoM3.JogadorDefesa;
import TrabalhoM3.JogadorGoleiro;

import java.time.LocalDate;

public class Main {
    public static void main(String []args){
        ////////////////////////////
        // TIME A
        ////////////////////////////

        JogadorGoleiro goleiro1 = new JogadorGoleiro();
        goleiro1.setNome("Rafael");
        goleiro1.setDataNascimento("29/07/1999");
        goleiro1.setNumeroCamisa(1);
        goleiro1.setAltura(169);
        goleiro1.setReflexos(90);

        // System.out.println("Nota altura goleiro: " + goleiro1.getNotaAltura());
        // System.out.println("Habilidade goleiro : " + goleiro1.getHabilidade());

        JogadorDefesa defensor1 = new JogadorDefesa();
        defensor1.setNome("Abreu");
        defensor1.setDataNascimento("01/01/1998");
        defensor1.setNumeroCamisa(3);
        defensor1.setDesarme(90);
        defensor1.setDesarme(99);

        JogadorDefesa defensor2 = new JogadorDefesa();
        defensor2.setNome("João");
        defensor2.setDataNascimento("01/07/1990");
        defensor2.setNumeroCamisa(4);
        defensor2.setDesarme(91);
        defensor2.setDesarme(85);

        JogadorAtacante atacante1 = new JogadorAtacante();
        atacante1.setNome("José");
        atacante1.setDataNascimento("21/10/2000");
        atacante1.setNumeroCamisa(11);
        atacante1.setTecnica(58);
        atacante1.setVelocidade(87);

        JogadorAtacante atacante2 = new JogadorAtacante();
        atacante2.setNome("Carlos");
        atacante2.setDataNascimento("28/11/1993");
        atacante2.setNumeroCamisa(10);
        atacante2.setTecnica(93);
        atacante2.setVelocidade(75);

        Time time1 = new Time("A");

        time1.insereJogador(goleiro1);
        time1.insereJogador(defensor1);
        time1.insereJogador(defensor2);
        time1.insereJogador(atacante1);
        time1.insereJogador(atacante2);

        time1.mostraJogadores();

        CampeonatoRepositorio.insereTime(time1);
        CampeonatoRepositorio.mostraTimesCadastrados();

        ////////////////////////////
        // TIME 2
        ////////////////////////////
        JogadorGoleiro goleiro2 = new JogadorGoleiro();
        goleiro2.setNome("João");
        goleiro2.setDataNascimento("18/01/1995");
        goleiro2.setNumeroCamisa(10);
        goleiro2.setAltura(150);
        goleiro2.setReflexos(94);

        JogadorDefesa defensor3 = new JogadorDefesa();
        defensor3.setNome("Felipe");
        defensor3.setDataNascimento("19/11/2001");
        defensor3.setNumeroCamisa(2);
        defensor3.setDesarme(91);
        defensor3.setCobertura(90);

        JogadorDefesa defensor4 = new JogadorDefesa();
        defensor4.setNome("Gustavo");
        defensor4.setDataNascimento("02/03/1998");
        defensor4.setNumeroCamisa(3);
        defensor4.setDesarme(79);
        defensor4.setCobertura(85);

        JogadorAtacante atacante3 = new JogadorAtacante();
        atacante3.setNome("Jonas");
        atacante3.setDataNascimento("21/10/1994");
        atacante3.setNumeroCamisa(7);
        atacante3.setTecnica(76);
        atacante3.setVelocidade(86);

        JogadorAtacante atacante4 = new JogadorAtacante();
        atacante4.setNome("Alex");
        atacante4.setDataNascimento("27/07/1997");
        atacante4.setNumeroCamisa(9);
        atacante4.setTecnica(75);
        atacante4.setVelocidade(93);

        Time time2 = new Time("B");
        time2.insereJogador(goleiro2);
        time2.insereJogador(defensor3);
        time2.insereJogador(defensor4);
        time2.insereJogador(atacante3);
        time2.insereJogador(atacante4);

        time2.mostraJogadores();

        CampeonatoRepositorio.insereTime(time2);

        ////////////////////////////
        // PARTIDA 1
        ////////////////////////////
        LocalDate dataPartida1 = LocalDate.of(2015, 5, 1);
        Partida partida1 = new Partida(dataPartida1, time1, time2);
        partida1.geraPlacarPartida();
        System.out.println("TrabalhoM3.Partida  1 : " + partida1.getPlacar());

        CampeonatoRepositorio.mostraTabela();
        time1.mostraJogadores();
        time2.mostraJogadores();
        /**
         *
         */
        // REMOVE JOGADOR TIME 1
        System.out.println("Removendo o jogador do time A");
        time1.removerJogador("Carlos");
        time1.mostraJogadores();
        JogadorAtacante atacante5 = new JogadorAtacante();
        atacante5.setNome("Sidnei");
        atacante5.setDataNascimento("13/07/1998");
        atacante5.setNumeroCamisa(12);
        atacante5.setTecnica(78);
        atacante5.setVelocidade(70);
        System.out.println("Adicionando o jogador no time A");
        time1.insereJogador(atacante5);

        ////////////////////////////
        // PARTIDA 2
        ////////////////////////////
        LocalDate dataPartida2 = LocalDate.of(2015, 5, 3);
        Partida partida2 = new Partida(dataPartida2, time1, time2);
        partida2.geraPlacarPartida();
        System.out.println("\nTrabalhoM3.Partida  2 : " + partida2.getPlacar());

        CampeonatoRepositorio.mostraTabela();

        time1.mostraJogadores();
        time2.mostraJogadores();

    }
}
