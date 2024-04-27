package br.com.versaooito.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class UsoDeStreamsAprofundado {

    public static void main(String[] args) {

        List<String> letras = Arrays.asList("A", "A", "C", "C", "D", "E");

        //count: Conta quantos elementos tem no seu stream
        long quantidade = letras.stream().count();
        System.out.println("sua lista tem"+ quantidade + " elementos" );

        //distinct: Remove valores iguais do stream
        letras.stream().distinct().forEach(x -> System.out.println(x));

        //Anymatch Algum elemento segue o criterio?
        boolean anyMatch = letras.stream().anyMatch(x -> x.equals("A"));
        System.out.println("Tem algum elemento A na lista? "+ anyMatch);

        //AlMatch Todos elementos seguem seu criterio?
        boolean allMatch = letras.stream().allMatch(x -> x.equals("A"));
        System.out.println("Todos algum elementos na lista são iguais a A? "+ allMatch);

        //NoneMatch nenhum elemento segue seu criterio?
        boolean noneMatch = letras.stream().noneMatch(x -> x.equals("A"));
        System.out.println("Nenhum elementos na lista é igual a A? "+ noneMatch);

        //Max: Elemento maximo de sua lista baseado em seu criterio, no caso o compareTo de String
        String max = letras.stream().max((letraAtual, letraSeguinte) -> letraAtual.compareTo(letraSeguinte)).get().toString();

        //Min: Elemento minimo de sua lista baseado em seu criterio, no caso o compareTo de String
        String min = letras.stream().min((letraAtual, letraSeguinte) -> letraAtual.compareTo(letraSeguinte)).get().toString();

        //Flatmap: Lida com arrays bidimensionais/matrizes
        System.out.println();
        List<List<Integer>> listaBidimensional = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6)
        );

        listaBidimensional.stream().flatMap(array -> array.stream()).forEach(x -> System.out.println(x));

        //stream e parallel stream: percorrem os elementos, stream de maneira sincrona,
        //já o paralell stream de maneira assincrona em mais de uma thread de seu processador
        letras.stream().forEach(x -> System.out.println(x));
        letras.parallelStream().forEach(x -> System.out.println(x));

        //Stream de array

        int[] arrayInteiro = {1,2};
        Stream.of(arrayInteiro);
        //Stream tipados; tras metodos personalizados a tipagem que podem facilitar a manipulação
        IntStream.of().average();
        DoubleStream.of().boxed();
        LongStream.of().average();
    }

}
