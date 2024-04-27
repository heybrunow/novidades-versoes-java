package br.com.versaooito.methodreferences;

import java.util.Arrays;
import java.util.List;

public class UsoDosMethodReferences {

    public static void main(String[] args) {

        List<String> letras = Arrays.asList("a", "b", "c");
        //maneira comum de chamar um método
        letras.stream().forEach(letra -> System.out.println(letra));
        //usando method reference:
        letras.stream().forEach(System.out::println);
        //Chama o método a partir de sua classe mais :: e o método a ser chamado
        letras.stream().map(String::toUpperCase).forEach(System.out::println);

    }

}
