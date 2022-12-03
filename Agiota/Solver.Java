import java.util.Scanner;

public class Solver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Agiota ag = new Agiota(0);

        label:
        while (true) {
            String line = sc.nextLine();
            String[] ui = line.split(" ");
            System.out.println("$" + line);

            switch (ui[0]) {
                case "init":
                    ag = new Agiota(Integer.parseInt(ui[1]));
                    break;
                case "addCli":
                    ag.addCli(ui[1], Integer.parseInt(ui[2]));
                    break;
                case "lend":
                    ag.lend(ui[1], Integer.parseInt(ui[2]));
                    break;
                case "receive":
                    ag.receive(ui[1], Integer.parseInt(ui[2]));
                    break;
                case "kill":
                    ag.kill(ui[1]);
                    break;
                case "show":
                    System.out.println(ag);
                    break;
                case "end":
                    break label;
                default:
                    System.out.println("fail: comando invalido");
                    break;
            }
        }
        sc.close();
    }
}
