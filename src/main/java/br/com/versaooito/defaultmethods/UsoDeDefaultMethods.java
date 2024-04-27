package br.com.versaooito.defaultmethods;

public class UsoDeDefaultMethods {

    public static void main(String[] args) {
        A classeA = new A();
        classeA.metodo1();
        classeA.metodo2();
        classeA.metodoComum();

        B classeB =  new B();
        classeB.metodo1();
        classeB.metodo2();
        classeB.metodoComum();

    }

}

class A implements C{

    public void metodo1() {
        System.out.println("Implementação classe A para o método 1");

    }

    public void metodo2() {
        System.out.println("Implementação classe A para o método 2");

    }
    //Implementando metodos default Methods voce define o comportamento especifico para sua classe
    @Override
    public void metodoComum() {
        System.out.println("Implementação classe A metodo Comum - Sobrescrita metodo comum");
    }


}
//Defaults metodos mesmo que definidos no contrato nao precisam ser declarados e sobrescritos,
//utilizarão o comportamento definido na interface
class B implements C{

    public void metodo1() {
        System.out.println("Implementação classe B para o método 1");

    }

    public void metodo2() {
        System.out.println("Implementação classe B para o método 2");

    }

}

interface C{
    //Todo metodo de interface ja é inferido pelo java que é publico e abstrato
    public abstract void metodo1();
    void metodo2();

    //esse default Method nao necessariamente precisará ser sobrescrito em suas classes que implementam a interface C
    default void metodoComum() {
        System.out.println("Lógica comum - definida na interface");
    }
}
