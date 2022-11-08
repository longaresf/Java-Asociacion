/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.asociacion;
import java.util.Scanner;
/**
 *
 * @author fco
 */
public class Asociacion {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String nombre, apellidos, codigoSoc, dni, dia, mes, ano;
        char letra;
            
        System.out.println("Favor introduzca su Código(Soc-XX)");
        codigoSoc = dato.nextLine();
        System.out.println("Favor introduzca su Nombre");
        nombre = dato.nextLine();
        System.out.println("Favor introduzca sus Apellidos");
        apellidos = dato.nextLine();
        System.out.println("Favor introduzca DNI XX.XXX.XXX-K");
        dni = dato.nextLine();
        System.out.println("Favor introduzca Día, Formato XX");
        dia = dato.nextLine();
        System.out.println("Favor introduzca Mes, Formato XX");
        mes = dato.nextLine();
        System.out.println("Favor introduzca Año, Formato XXXX");
        ano = dato.nextLine();
        
        Fecha fecha = new Fecha();
        Socio socio1 = new Socio();
        Nombre nombre1 = new Nombre();
        Nif nif1 = new Nif();
        
                boolean inputError = true;
                
            do {
            try {
                inputError = socio1.codigoValido(codigoSoc);
                if (inputError) {
                    socio1.setCodigoSoc(codigoSoc);
                } else if (inputError == false) {
                    codigoSoc = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);
                
        do {
            try {
                inputError = socio1.nombreValido(nombre);
                if (inputError) {
                    nombre1.setNombre(nombre);
                } else if (inputError == false) {
                    nombre = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);
        
                do {
            try {
                inputError = socio1.apellidoValido(apellidos);
                if (inputError) {
                    nombre1.setApellidos(apellidos);
                } else if (inputError == false) {
                    apellidos = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);

                do {
            try {
                inputError = socio1.rutValido(dni);
                if (inputError) {
                    nif1.setDni(dni);
                } else if (inputError == false) {
                    dni = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);

            do {
            try {
                inputError = socio1.diaValido(dia);
                if (inputError) {
                    fecha.setDia(dia);
                } else if (inputError == false) {
                    dia = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);
            
            do {
            try {
                inputError = socio1.mesValido(mes);
                if (inputError) {
                    fecha.setMes(mes);
                } else if (inputError == false) {
                    mes = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);
            
            do {
            try {
                inputError = socio1.anoValido(ano);
                if (inputError) {
                    fecha.setAno(ano);
                } else if (inputError == false) {
                    ano = dato.nextLine();
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (inputError == false);


            
        System.out.println("Socio: "+codigoSoc+", Nombre: "+nombre+", Apellidos: "+apellidos+", DNI: "+dni+", Fecha de Registro: "+dia+"-"+mes+"-"+ano);

        
        

    }
}
