class Retangulo extends Shape{
    Ponto2D infEsq;
    Ponto2D supDir;
  
    Retangulo(double x1, double y1, double x2, double y2){
        infEsq = new Ponto2D(x1,y1);
        supDir = new Ponto2D(x2,y2);
    }
  
    Retangulo(Ponto2D infEsq, Ponto2D supDir){
        this.infEsq = infEsq;
        this.supDir = supDir;
    }
  
    @Override
    double area() {
        return (supDir.getY() - infEsq.getY()) * (supDir.getX() - infEsq.getX());
    }
  
    @Override
    double perimeter() { 
        return 2 * (supDir.getY() - infEsq.getY()) + 2 * (supDir.getX() - infEsq.getX());
    }
  
    @Override
    boolean inside(Ponto2D p) {
        return (p.getX() <= supDir.getX() && p.getX() >= infEsq.getX()) && (p.getY() <= supDir.getY() && p.getY() >= infEsq.getY());
    }
    
    public String toString(){
        return String.format("Retângulo com cantos %s e %s", infEsq, supDir);
    }
}