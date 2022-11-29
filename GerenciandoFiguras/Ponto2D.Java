class Ponto2D {
    private final double x;
    private final double y;
  
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
  
    public double getX() {
        return x;
    }
  
    public double getY() {
        return y;
    }
    
    public String toString(){ 
        return String.format("(%.1f,%.1f)",x,y);
    }
}