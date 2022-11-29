import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
      ArrayList<Shape> lista = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      while(true){
          String line = sc.nextLine();
          System.out.println("$" + line);
          String[] ui = line.split(" ");
          if(line.equals("end")) {
              break;
          } else if(ui[0].equals("circulo")) {
              double x = Double.parseDouble(ui[1]);
              double y = Double.parseDouble(ui[2]);
              double r = Double.parseDouble(ui[3]);
              lista.add(new Circulo(new Ponto2D(x,y),r));
          } else if(ui[0].equals("retangulo")) {
              double x1 = Double.parseDouble(ui[1]);
              double y1 = Double.parseDouble(ui[2]);
              double x2 = Double.parseDouble(ui[3]);
              double y2 = Double.parseDouble(ui[4]); 
              lista.add(new Retangulo(new Ponto2D(x1,y1), new Ponto2D(x2,y2)));
          }
          else if(ui[0].equals("area")){
              double soma = 0;
              for(Shape a : lista){ 
                  soma += a.area();
              }
              System.out.printf("area total: %.2f\n", soma);
              //System.out.printf("area total: %.2f\n",lista.get(lista.size() - 1).area());
          }
          else if(ui[0].equals("perimetro")) {//value value
              double soma = 0;
              for(Shape a : lista){
                  soma += a.perimeter();
              }
              System.out.printf("perimetro total: %.2f\n", soma);
              //System.out.printf("perimetro total: %.2f\n",lista.get(lista.size()-1).perimeter());
          }
          else if(ui[0].equals("inside")) {//value value
              Ponto2D p = new Ponto2D(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
              for(Shape a : lista){
                  System.out.println(a.inside(p));
              }
          }
          else if(ui[0].equals("mostra")){
              System.out.println("Figura:");
              for(Shape e : lista){
                  System.out.println(e);
              }
          }
          else {
              System.out.println("fail: comando invalido");
          }
      }
      sc.close();
  }
}