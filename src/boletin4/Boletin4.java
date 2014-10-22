package boletin4;

public class Boletin4 {

    public static void main(String[] args) {
        Consumo coche1= new Consumo();
        coche1.setLitros(50);
        coche1.setpGas(1.57);
        Consumo coche2= new Consumo(80,30,60,1.50);
        System.out.println("Consumo= "+coche2.consumoMedio());
        System.out.println("Consumo= "+coche1.consumoMedio()); 
        coche2.setLitros(10);
        System.out.println("Consumo= "+coche2.consumoMedio());
        System.out.println("Consumo= "+coche2.getvMed());
        }
}
