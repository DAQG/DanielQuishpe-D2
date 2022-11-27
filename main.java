import java.util.Scanner;

public class main {
    static vehiculos vehiculo1 = new vehiculos();
        public static void main(String[] args) {

            int menu,op;
            int numvehiculos = 1;
            int num2 = 1;
            Scanner sc= new Scanner(System.in);


            do{
                System.out.println("\n MENU PRINCIPAL");
                System.out.println(" ==================== ");
                System.out.println("|1.  Ingresar 5 vehiculos         |");
                System.out.println("|2.  Mostrar Vehiculos      |");
                System.out.println("|0.  SALIR           |");
                System.out.println(" ===================== ");
                System.out.print("Digita la opcion a realizar: ");
                menu = sc.nextInt();

                while (menu<0||menu> 2){
                    System.out.println("Ingrese una opcion valida : ");
                    menu= sc.nextInt();
                }

                switch (menu){
                    case 1:
                        System.out.println("Ingresa Los vehiculos");

                            vehiculo1.ingresarvehiculos(vehiculo1,numvehiculos );
                            vehiculo1.ingresarvehiculos(vehiculo1, numvehiculos +1);
                            vehiculo1.ingresarvehiculos(vehiculo1, numvehiculos +2);
                            vehiculo1.ingresarvehiculos(vehiculo1, numvehiculos +3);
                            vehiculo1.ingresarvehiculos(vehiculo1, numvehiculos +4);


                        break;
                    case 2:
                        System.out.println("Mostrando vehiculos ingresados");
                        vehiculo1.vehiculos(vehiculo1, num2);
                        vehiculo1.vehiculos(vehiculo1, num2 +1);
                        vehiculo1.vehiculos(vehiculo1, num2 +2);
                        vehiculo1.vehiculos(vehiculo1, num2 +3);
                        vehiculo1.vehiculos(vehiculo1, num2 +4);

                        break;
                }
                System.out.print("Desea salir del programa 1 --> SI :");
                op=sc.nextInt();
            }while(op!=1);

        }
    }

