package ContaBancaria;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;
    private static int totalContas = 0;
    private double ultimo = 0;
    
    public Conta(String titular){
        this.titular = titular;
        this.numero = totalContas;
        totalContas++;
        this.saldo = 0;
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    static void deposita(Conta c, double valor){
        c.deposita(valor);
    }

    boolean saca(double valor){
        if(this.saldo >= valor) return true;
        else return false;
        
    }

    static void saca(Conta c, double valor){
        if(c.saca(valor)){
            c.ultimo = c.saldo;
            c.saldo -= valor;
        }else{
            c.ultimo = c.saldo;
            c.saldo = 0;
            System.out.printf("Conta ficou zerada após o saque %.2f reais\n", c.ultimo);
        }
    }

    boolean transfere(Conta c, double valor){
        if(c.saldo >= valor) return true;
        else return false;
        
    }

    static boolean transfere(Conta origem, Conta destino, double valor){
        if(origem.transfere(origem, valor)){
            saca(origem, valor);
            deposita(destino, valor);
            origem.ultimo = valor;
            return true;
        }else{
            System.out.printf("Conta ficou zerada após o saque %.2f reais\n", origem.ultimo);
            return false;
        }
    }
    


    public String toString(){
        return String.format("Nro da conta: %d, Titular: %s, Saldo: %.2f", numero, titular, saldo);
    }

    double getSaldo(){
        return this.saldo; 
    }
}

