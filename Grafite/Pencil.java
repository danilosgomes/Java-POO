package Grafite;

public class Pencil { //todo
  private float thickness;
  private Lead tip;

  public Pencil(float thickness) { //todo
      setThickness(thickness);
  }

  public float getThickness() { //todo
      return this.thickness;
  }

  public void setThickness(float value) { //todo
      this.thickness = value;
  }

  public boolean hasGrafite() { //todo
      if(this.tip == null){
          return false;
      } else {
          return true;
      }
  }

  public boolean insert(Lead grafite) { //todo
      if(!hasGrafite()){
          if(grafite.getThickness() == this.thickness){
              this.tip = grafite;
              return true;
          } else {
              System.out.println("fail: calibre incompatível");
              return false;
          }
      } else {
          System.out.println("fail: ja existe grafite");
          return false;
      }
  }

  public Lead remove() { //todo
      this.tip = null;
      return tip;
  }

  public void writePage() { //todo
      if(tip.getSize() <= 10){
          System.out.println("warning: grafite com tamanho insuficiente para escrever");
      }else{

          if(tip.getSize() - tip.usagePerSheet() < 10){
              System.out.println("fail: folha incompleta");
              tip.setSize(10);
          }else{
              tip.setSize(tip.getSize() - tip.usagePerSheet());
          }

      }
  }
  
  public String toString() {
      String saida = "calibre: " + thickness + ", grafite: ";
      if (tip != null)
          saida += "[" + tip + "]";
      else
          saida += "null";
      return saida;
  }
}
