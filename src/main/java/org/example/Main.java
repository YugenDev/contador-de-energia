package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random  vRandom = new Random();
        Scanner entradaTeclado= new Scanner(System.in);


        String perfil;
        Double tarifaEnergia;
        Integer opcion;
        final String contraseña="admin123";
        String contraAdmin;
        Integer contadorEnergia=0;


        System.out.println("SOMOS GRUPO EPM");
        System.out.println("---Bienvenido!---");
        System.out.println("********************");
        System.out.println("Eres administrador?");
        System.out.println("si, o no?");
        System.out.println("--->");
        perfil = entradaTeclado.nextLine();

        if (perfil.equalsIgnoreCase("si")){

                System.out.println("Digita la contraseña");
                System.out.println("-->");
                contraAdmin=entradaTeclado.nextLine();

                if (contraAdmin.equals(contraseña)){

                System.out.println("Bienvenido, admin.");
                //puedo actualizar la tarifa de energia
                System.out.println("cual es la tarifa de energia?");
                System.out.println("--> ");
                tarifaEnergia =entradaTeclado.nextDouble();
                System.out.println("La tarifa de energia ha quedado en "+tarifaEnergia+"Kwh");

                //generando datos para una empresa
                //generar un loop que de 30 giros
                    Integer numeroVueltas=0;
                    Integer contadorDePicos=0;

                do {
                    numeroVueltas=numeroVueltas+1;
                    Integer numeroGenerado=vRandom.nextInt(401);
                    System.out.println(numeroGenerado);
                    contadorEnergia=contadorEnergia+numeroGenerado;
                    if (numeroGenerado>300){

                        System.out.println("Pico detectado");
                        contadorDePicos=contadorDePicos+1;
                    }else {

                        System.out.println("Todo funciona correctamente");

                    }

                } while (numeroVueltas<30);

                    System.out.println(numeroVueltas);
                    System.out.println(contadorDePicos);

                    //menu

                    System.out.println("1. Ver tarifa");
                    System.out.println("2. Mostrar consumo promedio");
                    System.out.println("3. Mostrar picos de consumo");
                    System.out.println("4. Mostrar factura");
                    System.out.println("5. SALIR");

                    do {

                        System.out.println("Apreciado cliente, digita una opcion");
                        opcion = entradaTeclado.nextInt();

                        switch (opcion){

                            case 1:
                                System.out.println("Su tarifa es de "+tarifaEnergia);
                                break;

                            case 2:
                                System.out.println("Su consumo total es de "+contadorEnergia);
                                Double promedioConsumo=contadorEnergia/30.0;
                                System.out.println("El consumo promedio fue de: "+promedioConsumo);
                                break;

                            case 3:
                                System.out.println("La cantidad de picos ha sido de: "+contadorDePicos);
                                break;

                            case 4:
                                System.out.println("Esta es su factura con el costo total: ");
                                Double totalPagar=contadorEnergia*tarifaEnergia;
                                System.out.println("---> "+totalPagar);
                                break;

                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }

                    }while(opcion!=5);

                }else{

                    System.out.println("se cree mr robot o que?");
                }

        } else {

            System.out.println("Hola empresa");

        }



    }
}