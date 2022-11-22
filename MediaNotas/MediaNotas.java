package MediaNotas;

import java.util.ArrayList;
public class MediaNotas{

  private ArrayList<Double> notas = new ArrayList<Double>();

  public void addNota(double nota){
      this.notas.add(nota);
  }

  public void removeNota(int index){
      if(index >= 0 && index < notas.size()){
          notas.remove(index);
      } else {
          System.out.println("falha: indice invalido");
      }
  }

  public void mudaNota(int index, double valor){
      if(index >= 0 && index < notas.size()){
          notas.set(index, valor);
      } else {
          System.out.println("falha: indice invalido");
      }
  }

  public double maiorNota(){
      double maior = 0;
      if(notas.size() > 0){
          for(double i : notas){
          if(i > maior){
              maior = i;
          }
          }
          return maior;
      } else {
          System.out.println("falha: quantidade de notas insuficiente");
          return 1;
      }
  }

  public double menorNota(){
      double menor = 10;
      if(notas.size() > 0){
      for(double i : notas){
          if(i <= menor){
          menor = i;
          }
      }
          return menor;
      }else{
          System.out.println("falha: quantidade de notas insuficiente");
          return 0;
      }
  }

  double media(){
      double media = 0;
      for(double i : notas)media += i;
      media /= notas.size();
      return media;
  }

  void parametriza(){
      double maior = 0;
      for(double i : notas){
          if(i > maior){
              maior = i;
          }
      }
      
      for(int i = 0; i < notas.size(); i++){
          notas.set(i, (notas.get(i)/maior) * 10);
      }
  }

  public String toString(){
      StringBuilder str = new StringBuilder("[");
      for(int i = 0; i < notas.size(); i++){
          if(i < notas.size() - 1){
              str.append(String.format("%.2f", notas.get(i))).append(", ");
          } else {
              str.append(String.format("%.2f", notas.get(i))).append("]");
          }
      }
      return str.toString();
  }
}
