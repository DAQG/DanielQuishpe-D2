import java.util.Scanner;
public class vehiculos {
    Scanner sc=new Scanner(System.in);
    String  marca,modelo,color;
    int anio;
    public void vehiculo (){
        marca="";
        modelo="";
        color="";
        anio=0;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void vehiculos(vehiculos newvehiculos, int num){

            System.out.println("\n\tMostrando Vehiculo " + num + ": ");
            System.out.println("Marca: " + newvehiculos.getMarca());
            System.out.println("Modelo: " + newvehiculos.getModelo());
            System.out.println("Color: " + newvehiculos.getColor());
            System.out.println("Año: " + newvehiculos.getAnio());
        }


    public void ingresarvehiculos(vehiculos newvehiculos, int num ){
        System.out.println("\n\tIngresa los Datos del Vehiculo " + num + ": ");
        System.out.print("Marca: ");
        newvehiculos.setMarca(sc.next());
        System.out.print("Modelo: ");
        newvehiculos.setModelo(sc.next());
        System.out.print("Color: ");
        newvehiculos.setColor(sc.next());
        System.out.print("Año: ");
        newvehiculos.setAnio(sc.nextInt());

    }
}


