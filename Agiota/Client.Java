public class Client {
  private int balance;
  private String codename;
  private int limite;
  
  public  Client(String codename, int limite){
      this.codename = codename;
      this.limite = limite;
  }
  
  public int getBalance(){
      return balance;
  }
  
  public void setBalance(int balance){
      this.balance = balance;
  }
  
  public String getCodename(){
      return codename;
  }
  
  public void setCodename(String codename){
      this.codename = codename;
  }
  
  public int getLimite(){
      return limite;
  }
  
  public void setLimite(int limite){
      this.limite = limite;
  }
  
  @Override
  public String toString(){
      return "- " + getCodename() + ":" + getBalance() + "/" + getLimite();
  }
}