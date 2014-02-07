package com.danyalvarez.generadordeclases;

import java.util.ArrayList;

/**
 * Clase Clase
 * @author Daniel Alvarez (a3dany)
 */
public class Clase {

    private String nombre;
    private ArrayList<Atributo> atributos;
    private boolean padre;
    private boolean hija;
    private String nombrePadre;

    public Clase() {
        this.nombre = "";
        this.atributos = new ArrayList<Atributo>();
        this.padre = false;
        this.hija = false;
        this.nombrePadre = "";
    }

    public Clase(String nombre, boolean padre, boolean hija, String nombrePadre) {
        this.nombre = nombre;
        this.atributos = new ArrayList<Atributo>();
        this.padre = padre;
        this.hija = hija;
        this.nombrePadre = nombrePadre;
    }

    public void adicionarAtributo(Atributo a) {
        atributos.add(a);
    }

    public String generarCodigoJava(boolean setterYGetter, boolean leerYMostrar) {
        String X = "";
        X += "public class " + nombre + (hija ? " extends " + nombrePadre + " " : " ") + "{\n";
        String tipoAcceso = padre ? "protected" : "private";
        // atributos
        X += "\n";
        for (Atributo atributo : atributos) {
            X += "    " + tipoAcceso + " " + atributo.getDefinicionJava() + ";\n";
        }
        X += "\n";
        X += generarConstructorPorDefectoJava();
        X += "\n";
        X += generarConstructorConParametrosJava();
        if (leerYMostrar) { // solo si el usuario lo selecciono
            X = "import java.util.Scanner;\n\n" + X; //importamos clase Scanner
            X += "\n";
            X += generarMetodoLeerJava();
            X += "\n";
            X += generarMetodoMostrarJava();
        }
        if (setterYGetter) { // solo si el usuario lo selecciono
            X += generarGetterYSetterJava();
        }
        X += "}";
        return X;
    }

    public String generarCodigoCSharp(boolean setterYGetter, boolean leerYMostrar) {
        String X = "";
        X += "public class " + nombre + (hija ? " : " + nombrePadre + " " : " ") + "{\n";
        String tipoAcceso = padre ? "protected" : "private";
        // atributos
        X += "\n";
        for (Atributo atributo : atributos) {
            X += "    " + tipoAcceso + " " + atributo.getDefinicionCSharp() + ";\n";
        }
        X += "\n";
        X += generarConstructorPorDefectoCSharp();
        X += "\n";
        X += generarConstructorConParametrosCSharp();
        if (leerYMostrar) { // solo si el usuario lo selecciono
            X = "using System;\n\n" + X; //importamos clase Console
            X += "\n";
            X += generarMetodoLeerCSharp();
            X += "\n";
            X += generarMetodoMostrarCSharp();
        }
        if (setterYGetter) { // solo si el usuario lo selecciono
            X += generarGetterYSetterCSharp();
        }
        X += "}";
        return X;
    }

    public String generarConstructorPorDefectoJava() {
        String X = "";
        X += "    public " + nombre + "() {\n";
        X += hija ? "        super();\n" : "";
        for (Atributo atributo : atributos) {
            X += atributo.getSentenciaConstructorPorDefectoJava();
        }
        X += "    }\n";
        return X;
    }

    public String generarConstructorConParametrosJava() {
        String X = "";
        X += "    public " + nombre + "(";
        for (int i = 0; i < atributos.size() - 1; i++) {
            X += atributos.get(i).getDefinicionJava() + ", ";
        }
        X += atributos.get(atributos.size() - 1).getDefinicionJava();
        X += ") {\n";
        X += hija ? "        super();\n" : "";
        for (Atributo atributo : atributos) {
            X += atributo.getSentenciaConstructorConParametro();
        }
        X += "    }\n";
        return X;
    }

    public String generarConstructorPorDefectoCSharp() {
        String X = "";
        X += "    public " + nombre + "()";
        X += hija ? " : base() {\n" : " {\n";
        for (Atributo atributo : atributos) {
            X += atributo.getSentenciaConstructorPorDefectoCSharp();
        }
        X += "    }\n";
        return X;
    }

    public String generarConstructorConParametrosCSharp() {
        String X = "";
        X += "    public " + nombre + "(";
        for (int i = 0; i < atributos.size() - 1; i++) {
            X += atributos.get(i).getDefinicionCSharp() + ", ";
        }
        X += atributos.get(atributos.size() - 1).getDefinicionCSharp();
        X += ")";
        X += hija ? " : base() {\n" : " {\n";
        for (Atributo atributo : atributos) {
            X += atributo.getSentenciaConstructorConParametro();
        }
        X += "    }\n";
        return X;
    }

    public String generarMetodoLeerJava() {
        String X = "";
        X += "    public void leer() {\n";
        X += hija ? "        super.leer();\n" : "";
        X += "        Scanner in = new Scanner(System.in);\n";
        X += "        System.out.println(\"" + nombre.toUpperCase() + "\");\n";
        for (Atributo atributo : atributos) {
            X += atributo.getModoLecturaJava();
        }
        X += "    }\n";
        return X;
    }

    public String generarMetodoMostrarJava() {
        String X = "";
        X += "    public void mostrar() {\n";
        X += hija ? "        super.mostrar();\n" : "";
        X += "        System.out.println(\"" + nombre.toUpperCase() + "\");\n";
        for (Atributo atributo : atributos) {
            X += atributo.getModoEscrituraJava();
        }
        X += "    }\n";
        return X;
    }

    public String generarMetodoLeerCSharp() {
        String X = "";
        X += "    public void leer() {\n";
        X += hija ? "        base.leer();\n" : "";
        X += "        Console.WriteLine(\"" + nombre.toUpperCase() + "\");\n";
        for (Atributo atributo : atributos) {
            X += atributo.getModoLecturaCSharp();
        }
        X += "    }\n";
        return X;
    }

    public String generarMetodoMostrarCSharp() {
        String X = "";
        X += "    public void mostrar() {\n";
        X += hija ? "        base.mostrar();\n" : "";
        X += "        Console.WriteLine(\"" + nombre.toUpperCase() + "\");\n";
        for (Atributo atributo : atributos) {
            X += atributo.getModoEscrituraCSharp();
        }
        X += "    }\n";
        return X;
    }

    public String generarGetterYSetterJava() {
        String X = "";
        for (Atributo atributo : atributos) {
            X += "\n";
            X += atributo.getGetterJava();
            X += "\n";
            X += atributo.getSetterJava();
        }
        return X;
    }

    public String generarGetterYSetterCSharp() {
        String X = "";
        for (Atributo atributo : atributos) {
            X += "\n";
            X += atributo.getPropiedadCSharp();
        }
        return X;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHija() {
        return hija;
    }

    public void setHija(boolean hija) {
        this.hija = hija;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public boolean isPadre() {
        return padre;
    }

    public void setPadre(boolean padre) {
        this.padre = padre;
    }
}
