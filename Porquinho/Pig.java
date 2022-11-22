package Porquinho;

public class Pig{
  private String itens = "";
  private double value = 0;
  private int volume = 0;
  private int volumeMax;
  private boolean broken = false;
  int sla = 0;

  //inicializa o volumeMax
  public Pig(int volumeMax){
      this.volumeMax = volumeMax;
  }

  //se nao estiver quebrado e couber, adicione o value e o volume
  public boolean addCoin(Coin moeda){
      if(moeda.value + this.volume <= volumeMax){
          volume += moeda.volume;
          this.value += moeda.value;
          return true;
      }else{
          System.out.println("fail: limite no alto bro");
          return false;
      }
  }

  //se não estiver quebrado e couber, adicione no volume e na descrição
  public boolean addItem(Item item){
      if(item.getVolume() + this.volume <= this.volumeMax){
          this.volume += item.getVolume();
          if(sla==0) itens += item.getDescription();
          else itens += ", "+item.getDescription();
          sla++;
          return true;
      }else{
          System.out.println("fail: volume de item alto bro");
          return false;
      }
  }

  //quebre o pig
  public boolean breakPig(){
      if(isBroken()){
          return false;
      }else{
          this.broken = true;
          return true;
      }
  }

  //se estiver quebrado, pegue e retorne o value
  public double getCoins(){
      if(isBroken()){
          return this.value;
      }else{
          System.out.println("You must break the pig first");
          return 0;
      }
  }

  //se estiver quebrado, pegue e retorno os itens
  public String getItens(){
      if(isBroken()){
          return this.itens;
      }else{
          System.out.println("You must break the pig first");
          return "";
      }
  }

  public int getVolume(){
      return this.volume;
  }

  public int getVolumeMax(){
      return this.volumeMax;
  }

  public boolean isBroken(){
      return this.broken;
  }

  //mostre o conteúdo do pig
  public String toString(){
      return String.format("I:(%s) M:%.1f V:%d/%d EQ:%b", this.itens, this.value, this.volume, this.volumeMax, isBroken());
  }
}