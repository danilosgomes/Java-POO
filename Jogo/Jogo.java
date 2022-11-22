package Jogo;

import java.util.Arrays;
public class Jogo{
    
  private int numJogadores;
  private int [] armadilha;
  private int [] posicao;
  private boolean [] podeJogar;
  private int numArmadilha = 0;
  private int numCasas;
  private int atual;
  private boolean fimDoJogo = false;
  
  public Jogo(int numJogadores, int numCasas){
      this.numJogadores = numJogadores;
      this.armadilha = new int[3];
      this.posicao = new int[numJogadores];
      this.podeJogar = new boolean[numJogadores];
      Arrays.fill(podeJogar, true);
      this.numCasas = numCasas;
      this.atual = 0;
  }
  
  public void addArmadilha(int t){
      this.armadilha[numArmadilha] = t;
      numArmadilha++;
  }
  
  public void addMove(int d1, int d2){
      if(!fimDoJogo){
          
          if(podeJogar[atual]){
              
              posicao[atual] += (d1 + d2);
              System.out.println("O jogador "+ (atual + 1) +" vai para a casa "+ posicao[atual]);
      
              if(posicao[atual] > numCasas){
                  System.out.println("O jogador "+ (atual + 1) +" venceu o jogo");
                  fimDoJogo = true;
                  return;
              }
              
              for(int i = 0; i < numArmadilha; i++){
                  if(posicao[atual] == armadilha[i]){
                      System.out.println("O jogador "+ (atual + 1) +" caiu em um armadilha");
                      podeJogar[atual] = false;
                  }
              }
              
              atual = atual == numJogadores - 1 ? atual = 0 : atual + 1;
              
          } else {
              System.out.println("O jogador "+ (atual + 1) +" passa a vez");
              podeJogar[atual] = true;
              atual = atual == numJogadores - 1 ? atual = 0 : atual + 1;
              
              addMove(d1 , d2);
          }
          
      } else {
          System.out.println("O jogo acabou");
      }
  }
  
  public String toString(){
      String str = "";
      for(int i = 0; i < numJogadores; i++){
          str += "PosJogador["+ (i + 1) +"] = " + posicao[i] + "\n";
      }
      return str;
  }
  
}
