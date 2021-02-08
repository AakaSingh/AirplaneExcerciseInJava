import java.util.Scanner;

public class AirplaneExcercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Airplane airplane = new Airplane();
        int choice = 0;
        boolean exit = true;
        while (exit) {
            System.out.println("-------------");
            System.out.println("1 – Start motor\n2 – Take off\n3 – Stop motor\n4 – Increase altitude\n5 – Decrease altitude\n6 – Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    airplane.start();
                    break;

                case 2:
                    airplane.takeOff();
                    break;

                case 3:
                    airplane.stop();
                    break;

                case 4:
                {
                    System.out.println("Enter height for the Airplane to climb :");
                    int alt = sc.nextInt();
                    airplane.changeAltitude(alt);

                    if(!airplane.isFunctional)
                        exit = false;

                    break;
                }

                case 5:
                {
                    System.out.println("Enter height for the Airplane to descend :");
                    int alt = sc.nextInt();
                    airplane.changeAltitude(alt * -1);
                    break;
                }

                case 6:
                {
                    exit = false;
                }

            }
        }
    }
}
