import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        label:
        while(true){
            String line = sc.nextLine();
            System.out.println("$"+line);
            List<String> ui = Arrays.asList(line.split(" "));

            switch (ui.get(0)) {
                case "end":
                    break label;
                case "addPacs":
                    ui.stream().skip(1)
                            .forEach(tk -> hospital.addPaciente(new Paciente(tk.split("-")[0], tk.split("-")[1])));
                    break;
                case "addMeds":
                    ui.stream().skip(1)
                            .forEach(tk -> hospital.addMedico(new Medico(tk.split("-")[0], tk.split("-")[1])));
                    break;
                case "show":
                    System.out.println(hospital);
                    break;
                case "tie":
                    ui.stream().skip(2).forEach(name -> hospital.vincular(ui.get(1), name));
                    break;
                default:
                    System.out.println("fail: comando invalido");
                    break;
            }
        }
    }
}
