class Equipe {
  String nome;
  int totalPontos;
  int totalVitorias;
  int saldoGols;
  int golsPro;

  public Equipe(String nome, int totalPontos, int totalVitorias, int saldoGols, int golsPro) {
      this.nome = nome;
      this.totalPontos = totalPontos;
      this.totalVitorias = totalVitorias;
      this.saldoGols = saldoGols;
      this.golsPro = golsPro;
  }

  @Override
  public String toString() {
      return "Equipe [" +
              "nome=" + nome +
              ", totalPontos=" + totalPontos +
              ", totalVitorias=" + totalVitorias +
              ", saldoGols=" + saldoGols +
              ", golsPro=" + golsPro +
              ']';
  } 
}