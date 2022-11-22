import java.io.File;
import java.util.ArrayList;
import java.util;

public class Mercantil {
  
    ArrayList<Pessoa> espera = new ArrayList<Pessoa>();
    Pessoa caixas[];
    int qtdCaixas;
   
    Mercantil(int qtdCaixas){
      this.qtdCaixas = qtdCaixas;
      this.caixas = new Pessoa[qtdCaixas];
    }

    public void chegar(Pessoa p){
       this.espera.add(p);
    }

    public boolean chamarNoCaixa(int indice){

        if(this.espera.size() > 0){
          this.caixas[indice] = this.espera.get(0);
          this.espera.remove(0);
          return true;
        }else{
          System.out.println("fail: fila vazia");
          return false;
        }
        
    }

    public Pessoa finalizarAtendimento(int indice){
      Pessoa temp = this.caixas[indice];
      this.caixas[indice] = null;
      return temp;
    }

    public String toString(){
      StringBuilder retorno = new StringBuilder("|");

      for(int i=0; i < this.qtdCaixas; i++){
        if(this.caixas[i] != null){
          retorno.append(i + ":" + this.caixas[i] + "|");
        }else{
          retorno.append(i + ":-----|");
        }
      }

      retorno.append("\nEspera: " + this.espera);

      return retorno.toString();

    }


}