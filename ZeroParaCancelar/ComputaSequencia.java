package ZeroParaCancelar;

import java.util.ArrayList;
public class ComputaSequencia{
    
  private ArrayList<Integer> seq = new ArrayList<Integer>();
  
  public void cadastra(int valor){
      if(valor != 0){
          this.seq.add(valor);
      } else {
          this.seq.remove(seq.size() - 1);
      }
  }

  public int computa(){
      int soma = 0;
      for(int i : seq){
          soma += i;
      }
      return soma;
  }

  public String toString(){
      StringBuilder str = new StringBuilder("valores = [");
      for(int i = 0; i < seq.size(); i++){
          if(i < seq.size() - 1){
              str.append(seq.get(i));
              str.append(", ");
          } else {
              str.append(seq.get(i));
              str.append("]");
          }
      }
      return str.toString();
  }
}