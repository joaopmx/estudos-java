package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.modelo = "Sport";
        carro.nome = "Fusca Bala";
        carro.ano = 1969;

        carro2.modelo = "Mustang";
        carro2.nome = "GT 500";
        carro2.ano = 1968;

        carro = carro2;

        System.out.println("Carro 1");
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("-------------------");

        System.out.println("Carro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
