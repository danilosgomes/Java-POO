package Empresa;

import java.util.ArrayList;
public class Empresa{

    ArrayList<Empregado> empregados = new ArrayList<>();

    public void adicionaEmpregado(Empregado e){
        this.empregados.add(e);
    }

    public void mostraEmpregado(){

      System.out.println("Empresa: ");
        
      for(Empregado e : empregados){
        System.out.println(e);
      }

    }

    public double calculaFolha(){
        
      double total = 0;

      for(Empregado e : empregados){
        total += e.pagamento();
      }

      return total;
        

    }



}
