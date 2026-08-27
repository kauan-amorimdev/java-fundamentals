public class Main{
    public static void main(String[] args){
        Carro p1 = new Carro();
            p1.marca = "Toyota";
            p1.modelo = "corola";
            p1.ano = 2000;
            p1.mostrar();
        Carro p2 = new Carro();
        p2.marca = "Ford";
        p2.modelo = "um";
        p2.ano = 1986;
        System.out.println("\nSegundo carro abaixo:\n");
        p2.mostrar();
    }
}

class Carro {
    String marca;
    String modelo;
    int ano;

    public void mostrar(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(ano);
    }
}