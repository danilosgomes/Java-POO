package Calculadora;

import java.text.*;
class Calculator {
    public int batteryMax;
    public int battery;
    public float display;

    //Inicia os atributos, battery e display começam com o zero.
    public Calculator(int batteryMax) { 
        this.batteryMax = batteryMax;
        this.display = 0;
        this.battery = 0;
    }

    //Aumenta a bateria, porém não além do máximo.
    public void chargeBattery(int value) {
        if((value + this.battery) > this.batteryMax){
            this.battery = batteryMax;
        } else {
            this.battery += value;
        }
    } 

    //Tenta gastar uma unidade da bateria e emite um erro se não conseguir.
    public boolean useBattery() {
        if(this.battery > 0){
            this.battery--;
            return true;
        } else {
            System.out.println("fail: bateria insuficiente");
            return false;
        }
    } 

    //Se conseguir gastar bateria, armazene a soma no atributo display.
    public void sum(int a, int b) {
        if(useBattery()){
            this.display = a + b;
        }
    } 

    //Se conseguir gastar bateria e não for divisão por 0.
    public void division(int num, int den) {
        if(den == 0){
            useBattery();
            System.out.println("fail: divisao por zero");
        } else if(useBattery()){
            this.display = (float) num / den;
        }
    }

    //Retorna o conteúdo do display com duas casas decimais.
    public String toString() { 
        DecimalFormat form = new DecimalFormat("0.00");
        return "display = " + form.format(this.display).replace(",",".") + ", battery = " + this.battery;
    }
}
