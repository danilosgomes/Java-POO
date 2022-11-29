package CampeonatoBrasileiro;

import java.lang.Comparable;

class Equipe implements Comparable<Equipe> {

    String nome;
    int totalPontos;
    int totalVitorias;
    int saldoGols; 
    int golsPro;

    public Equipe(String nome, int totalPontos, int totalVitorias, int saldoGols, int golsPro){
        this.nome = nome;
        this.totalPontos = totalPontos;
        this.totalVitorias = totalVitorias;
        this.saldoGols = saldoGols;
        this.golsPro = golsPro;
    }

    @Override
    public int compareTo(Equipe o){
        if(o.totalPontos > this.totalPontos) return 1;
        else if(o.totalPontos < this.totalPontos) return -1;
        else if (o.totalVitorias > this.totalVitorias) return 1;
        else if (o.totalVitorias < this.totalVitorias) return -1;
        else if (o.saldoGols > this.saldoGols) return 1;
        else if (o.saldoGols < this.saldoGols) return -1;
        else return Integer.compare(o.golsPro, this.golsPro);
    }

    @Override
    public String toString(){
        return "Equipe [" +
                "nome=" + nome +
                ", totalPontos=" + totalPontos +
                ", totalVitorias=" + totalVitorias +
                ", saldoGols=" + saldoGols +
                ", golsPro=" + golsPro +
                ']';
    }
}
