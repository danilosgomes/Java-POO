public enum Direcao {
  IN("in"), OUT("out");

  final String value;

  Direcao(String value){
      this.value = value;
  }

  public String getValue() {
      return value;
  }
}
