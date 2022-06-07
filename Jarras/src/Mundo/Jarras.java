/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

public class Jarras {

//Atributos 
    private int balde6 = 0;
    private int balde8 = 0;

//Constructor
    public Jarras(int balde6, int balde8) {
        balde6 = this.balde6;
        balde8 = this.balde8;
    }

//Constructor Vacio
    public Jarras() {
    }

//Setters and Getters
    public int getBalde6() {
        return balde6;
    }

    public void setBalde6(int balde6) {
        this.balde6 = balde6;
    }

    public int getBalde8() {
        return balde8;
    }

    public void setBalde8(int balde8) {
        this.balde8 = balde8;
    }

    public static void Llenar8(int balde8) {
        if (balde8 >= 8) {
            System.out.println("El balde tiene un valor de" + " " + balde8 + " " + "No puede ser llenado, Esta lleno!!");
        } else if (balde8 < 8) {
            System.out.println("El balde de 8 lts tiene un valor de:" + " " + balde8);
            balde8 = 8;
            System.out.println("Ahora el balde de 8 lts tiene un valor de:" + " " + balde8);
        }

    }

    public static void Llenar6(int balde6) {
        if (balde6 >= 6) {
            System.out.println("El balde tiene un valor de" + " " + balde6 + " " + "No puede ser llenado de cero, Esta lleno!!");
        } else if (balde6 < 6) {
            System.out.println("El balde de 6 lts tiene un valor de:" + " " + balde6);
            balde6 = 6;
            System.out.println("Ahora el balde de 6 lts tiene un valor de:" + " " + balde6);
        }
    }

    public static void Vaciar8(int balde8) {
        if (balde8 > 0 || balde8 <= 8) {
            System.out.println("El balde de 8 lts tiene un valor de:" + " " + balde8);
            balde8 = 0;
            System.out.println("Ahora el balde de 8 lts tiene un valor de:" + " " + balde8);
        }
    }

    public static void Vaciar6(int balde6) {
        if (balde6 > 0 || balde6 <= 6) {
            System.out.println("El balde de 8 lts tiene un valor de:" + " " + balde6);
            balde6 = 0;
            System.out.println("Ahora el balde de 8 lts tiene un valor de:" + " " + balde6);
        }
    }

    public static void vaciar86(int balde6, int balde8) {
        if ((balde6 < 6 && balde6 >= 0) && (balde8 > 0 && balde8 <= 8)) {

            if ((balde8 + balde6) <= 6) {
                {
                    System.out.println("El balde de 6 lts tiene un valor de:" + " " + balde6);
                    System.out.println("El balde de 8 lts tiene un valor de:" + " " + balde8);
                    balde6 = balde8 + balde6;
                    balde8 = 0;
                    System.out.println("Ahora el balde de 6 lts tiene un valor de:" + " " + balde6);
                    System.out.println("Ahora el balde de 6 lts tiene un valor de:" + " " + balde8);
                }
            } else {
                System.out.println("Los baldes estan demasiado llenos para hacer esta tarea");
            }
        } else {
            System.out.println("No cumple con las condiciones para hacer esta tarea");
        }
    }

    public static void vaciar68(int balde6, int balde8) {
        if ((balde8 < 8 && balde8 >= 0) && (balde6 > 0 && balde6 <= 6)) {

            if ((balde8 + balde6) <= 8) {
                {
                    System.out.println("El balde de 6 lts tiene un valor de:" + " " + balde6);
                    System.out.println("El balde de 8 lts tiene un valor de:" + " " + balde8);
                    balde8 = balde8 + balde6;
                    balde6 = 0;
                    System.out.println("Ahora el balde de 8 lts tiene un valor de:" + " " + balde8);
                    System.out.println("Ahora el balde de 6 lts tiene un valor de:" + " " + balde6);
                }
            } else {
                System.out.println("Los baldes estan demasiado llenos para hacer esta tarea");
            }
        } else {
            System.out.println("No cumple con las condiciones para hacer esta tarea");
        }
    }

    public static void Llenar86(int balde6, int balde8) {
        int temp = 0;

        if ((balde6 <= 6 && balde6 > 0) && (balde8 >= 0 && balde8 < 8)) {
            if ((balde8 + balde6) >= 8) {
                {
                    System.out.println("El balde de 6 lts tiene un valor de:" + " " + balde6);
                    System.out.println("El balde de 8 lts tiene un valor de:" + " " + balde8);
                    temp = 8 - balde8;
                    balde8 = balde8 + temp;
                    balde6 = balde6 - temp;
                    System.out.println("Ahora el balde de 8 lts tiene un valor de:" + " " + balde8);
                    System.out.println("Ahora el balde de 6 lts tiene un valor de:" + " " + balde6);
                }
            } else {
                System.out.println("La suma de los valores de los dos baldes no es >= 8");
            }
        } else {
            System.out.println("No cumple con las condiciones para hacer esta tarea");
        }
    }

    public static void Llenar68(int balde6, int balde8) {
        int temp = 0;

        if ((balde8 <= 8 && balde8 > 0) && (balde6 >= 0 && balde6 < 6)) {
            if ((balde8 + balde6) >= 6) {
                {
                    System.out.println("El balde de 6 lts tiene un valor de:" + " " + balde6);
                    System.out.println("El balde de 8 lts tiene un valor de:" + " " + balde8);
                    temp = 6 - balde6;
                    balde6 = balde6 + temp;
                    balde8 = balde8 - temp;
                    System.out.println("Ahora el balde de 8 lts tiene un valor de:" + " " + balde8);
                    System.out.println("Ahora el balde de 6 lts tiene un valor de:" + " " + balde6);
                }
            } else {
                System.out.println("La suma de los valores de los dos baldes no es >= 6");
            }
        } else {
            System.out.println("No cumple con las condiciones para hacer esta tarea");
        }
    }
}
