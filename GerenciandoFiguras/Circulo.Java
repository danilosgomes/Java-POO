class Circulo extends Shape{
    Ponto2D centro;
    double raio;
  
    Circulo(double x, double y, double raio){
        centro = new Ponto2D(x, y);
        this.raio = raio;
    }
  
    Circulo(Ponto2D centro, double raio){
        this.centro = centro;
        this.raio = raio;
    }
  
    @Override
    double area() {
        return Math.PI * Math.pow(raio,2);
    }
  
    @Override
    double perimeter() {
        return 2 * Math.PI * raio;
    }
  
    @Override
    boolean inside(Ponto2D p) {
        double dx = p.getX() - centro.getX();
        double dy = p.getY() - centro.getY();
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2)) <= raio;
    }
    
    public String toString(){ 
        return String.format("Círculo com centro em %s e raio %.1f",
        centro, raio);
    }
}