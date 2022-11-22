package Motoca;

public class Motorcycle { //todo
  private Person person; //agregacao
  private int power;
  private int time;
  
  //Inicia o atributo power, time com zero e person com null
  public Motorcycle(int power){
      this.power = power;
      this.time = 0;
  }
  public int getPower() {//todo
      return this.power;
  }
  public int getTime() { //todo
      return this.time;
  }
  public Person getPerson() { //todo
      return this.person;
  }
  //Comprar mais tempo
  public void buy(int time){
      this.time += time;
  }
  
  //Se estiver vazio, coloca a pessoa na moto e retorna true
  public boolean enter(Person person) { //todo
      if(this.person != null){
          System.out.println("fail: busy motorcycle");
          return false;
      }else{
          this.person = person;
          return true;
      }
  }
  public Person leave() { //todo
      if(this.person != null){
          System.out.println(this.person);
          this.person = null;
      }else{
          System.out.println("fail: empty motorcycle");
      }
      return this.person;
  }
  public void drive(int time){
      if(this.person.getAge() > 10){
          System.out.println("fail: too old to drive");
      }else{
          if(this.time == 0){
              System.out.println("fail: buy time first");
          }else if(time > this.time){
              System.out.println("fail: time finished after "+this.time+" minutes");
              this.time = 0;
          }else{  
              this.time -= time;
          }
      }
  }
  //buzinar
  public void honk(){
      System.out.print("P");
      for(int i=0; i<this.power; i++){
          System.out.print("e");
      }
      System.out.print("m\n");
  }
  
  public String toString(){
      if(this.person!=null) return String.format("power:%d, time:%d, person:("+this.person+")", this.power, this.time, this.person);
      else return String.format("power:%d, time:%d, person:(empty)", this.power, this.time, this.person);
  }
}
