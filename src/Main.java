public class Main{
    public static void main(String[] args){
        double[] notas = {4.2, 3.0, 1.5, 2.9, 10.0};
        double mediaf = calcularMedia(notas);
        System.out.println("A media é: " + mediaf);
    }
    public static double calcularMedia(double[] notas){
        double media = 0;
        for (int i = 0; i < notas.length ; i++) {
            media += notas[i];
            System.out.println(notas[i]);
        }
        return media/ notas.length;
    }
}