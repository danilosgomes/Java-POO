package Empresa;

public class Solver{
    static Shell sh = new Shell();
    static Empresa empresa = new Empresa();
    public static void main(String[] args) {
        sh.setfn("addEmpregado",   () -> empresa.adicionaEmpregado( 
                                                new Empregado(sh.par(1), 
                                                toInt(sh.par(2)), 
                                                toDouble(sh.par(3))) ) );
        sh.setfn("addTerceirizado",   () -> empresa.adicionaEmpregado( 
                                                new Terceirizado(sh.par(1), 
                                                toInt(sh.par(2)), 
                                                toDouble(sh.par(3)),
                                                toDouble(sh.par(4))) ) );
        
                                                sh.setfn("mostra",    () -> empresa.mostraEmpregado() );
        sh.setfn("calculaFolha",  () -> System.out.printf( "Folha de pagamento: %.2f\n", 
                                        empresa.calculaFolha() )
        );
        sh.execute();
    }

    static int toInt(String s){
        return Integer.parseInt(s);
    }

    static double toDouble(String s){
        return Double.parseDouble(s);
    }
}