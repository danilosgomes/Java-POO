import java.util.Comparator;


class ComparaEquipe implements Comparator<Equipe> {
    public int compare(Equipe t1, Equipe t2) {
        if(t2.totalPontos > t1.totalPontos) return 1;
        else if(t2.totalPontos < t1.totalPontos) return -1;
        else if (t2.totalVitorias > t1.totalVitorias) return 1;
        else if (t2.totalVitorias < t1.totalVitorias) return -1;
        else if (t2.saldoGols > t1.saldoGols) return 1;
        else if (t2.saldoGols < t1.saldoGols) return -1; 
        else return Integer.compare(t2.golsPro, t1.golsPro);
    }
}