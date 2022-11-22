package Relógio;

import java.util.Scanner;
public class Solver {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Time time = new Time(0, 0, 0);
      while (true) {
          String line = scanner.nextLine();
          System.out.println("$" + line);

          String[] ui = line.split(" ");
          String cmd = ui[0];

          if (cmd.equals("end")) {
              break;
          } else if (cmd.equals("set")) {
              time.setHour(Integer.parseInt(ui[1]));
              time.setMinute(Integer.parseInt(ui[2]));
              time.setSecond(Integer.parseInt(ui[3]));
          } else if (cmd.equals("show")) {
              System.out.println(time);
          } else if (cmd.equals("next")) {
              time.nextSecond();
          } else {
              System.out.println("fail: comando inválido");
          }
      }

      scanner.close();
  }
}