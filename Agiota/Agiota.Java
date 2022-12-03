import java.util.Map;
import java.util.TreeMap;

public class Agiota {
    private int balance;
    private int nextTrId = 0;
    Map<String,Client> repCli;
    Map<Integer,Transaction> repTr;
    
    Agiota(int balance){
        this.balance = balance;
        repCli = new TreeMap<>();
        repTr = new TreeMap<>();
    }

    private void pushTransaction(String codename, int value){
        repTr.put(nextTrId, new Transaction(nextTrId,codename,value));
        nextTrId++;
    }

    public void addCli(String codename, int limite){
        if(!repCli.containsKey(codename)) {
            repCli.put(codename,new Client(codename,limite));
        }
        else{
            System.out.println("fail: cliente ja existe");
        }
    }

    public Client getClient(String codename){
        return repCli.get(codename);
    }

    public void kill(String codename){
        repTr.entrySet().removeIf(integerTransactionEntry -> integerTransactionEntry.getValue().getCodename().equals(codename));
        repCli.remove(codename);
    }

    public void lend(String codename, int value){
        if(!repCli.containsKey(codename)){
            System.out.println("fail: cliente nao existe");
        }
        else if(value > balance){
            System.out.println("fail: fundos insuficientes");
        }
        else if(repCli.get(codename).getLimite() - repCli.get(codename).getBalance() < value){
            System.out.println("fail: limite excedido");
        }
        else{
            int n = repCli.get(codename).getBalance()+value;
            repCli.get(codename).setBalance(n);
            balance -= value;
            pushTransaction(codename, value);
        }
    }

    public void receive(String codename, int value){
        if(!repCli.containsKey(codename)){
            System.out.println("fail: cliente nao existe");
        }
        else if(repCli.get(codename).getBalance() < value){
            System.out.println("fail: valor maior que a divida");
        }
        else{
            repCli.get(codename).setBalance(repCli.get(codename).getBalance()-value);
            balance += value;
            pushTransaction(codename,-value);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("clients:\n");
        for(Client e : repCli.values()){
            sb.append(e).append('\n');
        }
        sb.append("transactions:\n");
        for(Transaction e : repTr.values()){
            sb.append(e).append('\n');
        }
        sb.append("balance: ").append(balance);
        return sb.toString();
    }
}