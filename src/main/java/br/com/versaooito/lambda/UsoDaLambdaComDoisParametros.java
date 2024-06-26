package br.com.versaooito.lambda;

import java.util.LinkedHashMap;
import java.util.Map;

public class UsoDaLambdaComDoisParametros {
    public static void main(String[] args) {

        Map<String, String> jogadores = new LinkedHashMap<>();
        jogadores.put("jogador 1", "Pelé");
        jogadores.put("jogador 2", "Maradona");
        jogadores.put("jogador 3", "Cristiano Ronaldo ");
        jogadores.put("jogador 4", "Messi");

        //recebe um biConsumer, caso seja uma List recebe apenas um consumer
        jogadores.forEach((chave, jogador) ->
                System.out.println("Ranking da fifa: "
                        .concat(chave)
                        .concat(" - ")
                        .concat(jogador)));
        //Caso queira executar mais de uma operação dentro: se abre chaves apos a lambda
        jogadores.forEach((chave, jogador) -> {
            System.out.print("Ranking da fifa: ".concat(chave).concat(" - "));
            System.out.println(jogador);
        });


    }
}