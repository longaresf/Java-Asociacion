/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fco
 */
public class Socio {
        String nombre, apellidos, dni, dia, mes, ano;
        char letra;
    
    private String codigoSoc;

    public Socio() {
    }


    public Socio(String codigoSoc) {
        this.codigoSoc = codigoSoc;
    }

    public String getCodigoSoc() {
        return codigoSoc;
    }

    public void setCodigoSoc(String codigoSoc) {
        this.codigoSoc = codigoSoc;
    }
    
        public static boolean codigoValido(String codigoSoc) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^[sSoc]+-[0-9]{2}$");
        Matcher mather = pattern.matcher(codigoSoc);
        if (mather.find() == true) {
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("codigo Socio inválido, Soc-X");
            inputError = false;
        }
        return inputError;
    }
    
        public static boolean nombreValido(String nombre) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}");
        Matcher mather = pattern.matcher(nombre);
        if (mather.find() == true) {
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Nombre inválido, vuelva a escribir su Nombre");
            inputError = false;
        }
        return inputError;
    }
    
        public static boolean apellidoValido(String apellido) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}");
        Matcher mather = pattern.matcher(apellido);
        if (mather.find() == true) {
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Apellido inválido, vuelva a escribir su Apellido");
            inputError = false;
        }
        return inputError;
    }
    
        public static boolean rutValido(String dni) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^[0-9.]+-[0-9kK]{1}$");
        Matcher mather = pattern.matcher(dni);
        if (mather.find() == true) {
        inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Rut inválido, vuelva a escribir su Rut");
            inputError = false;
        }

        return inputError;
    }
        

        public static boolean diaValido(String dia) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^[0-9]{2}$");
        Matcher mather = pattern.matcher(dia);
        if (mather.find() == true) {
            System.out.println("Día válido");
           inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Día inválido, vuelva a escribir su Día");
            inputError = false;
        }

        return inputError;
    }
        
        public static boolean mesValido(String mes) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^[0-9]{2}$");
        Matcher mather = pattern.matcher(mes);
        if (mather.find() == true) {
            System.out.println("Mes válido");
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Mes inválido, vuelva a escribir su Mes");
            inputError = false;
        }

        return inputError;
    }
    
        public static boolean anoValido(String ano) {
        boolean inputError = false;
        Pattern pattern = Pattern.compile("^[0-9]{4}$");
        Matcher mather = pattern.matcher(ano);
        if (mather.find() == true) {
            System.out.println("Año válido");
            inputError = true;
        } else if (mather.find() == false) {
            System.out.println("Año inválido, vuelva a escribir su Año");
            inputError = false;
        }

        return inputError;
    }
        

    
    @Override
    public String toString() {
        return "Socio: "+codigoSoc+", Nombre: "+nombre+", Apellidos: "+apellidos+", DNI: "+dni+"-"+letra+", Fecha de Registro: "+dia+"-"+mes+"-"+ano;
    }
}
