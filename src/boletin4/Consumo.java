package boletin4;

public class Consumo {

    private double km;  //
    private double litros;
    private double vMed;
    private double pGas;
    
    public Consumo() {
        
    }
public Consumo(double km, double li, double vMed, double pGas) {
    this.km=km;
    litros=li;
    this.vMed=vMed;
    this.pGas=pGas;
}
public double getTempo(){
   return km/vMed;    
}
public double getTempo(double km, double vMed) {
    return km/vMed;
}
public double consumoMedio(){
    return (100*litros)/km;  
}
public double consumoEuros(){
    return (100*pGas)/km;
 }
public double getvMed(){
    return vMed;
}
public void setKm(double km){
   this.km=km;
}
public void setLitros(double litros){
    this.litros=litros;
}
public void setvMed(double vMed){
   this.vMed=vMed;
}
public void setpGas(double pGas){
    this.pGas=pGas;
}
public double getKm(){
    return km;
    
}

}

