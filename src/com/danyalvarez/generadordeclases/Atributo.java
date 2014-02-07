package com.danyalvarez.generadordeclases;

/**
 * Clase Atributo
 * @author Daniel Alvarez (a3dany)
 */
public class Atributo {

    private String nombre;
    private String variable;
    private Tipo tipo;

    public Atributo() {
        this.nombre = "";
        this.variable = "";
        this.tipo = new Tipo();
    }

    public Atributo(String nombre, String variable, Tipo tipo) {
        this.nombre = nombre;
        this.variable = variable;
        this.tipo = tipo;
    }

    public String getDefinicionJava() {
        return tipo.getDefinicionJava() + " " + variable;
    }

    public String getDefinicionCSharp() {
        return tipo.getDefinicionCSharp() + " " + variable;
    }

    public String getSentenciaConstructorPorDefectoJava() {
        return "        this." + variable + " = " + tipo.getValorDefectoJava() + ";\n";
    }

    public String getSentenciaConstructorPorDefectoCSharp() {
        return "        this." + variable + " = " + tipo.getValorDefectoCSharp() + ";\n";
    }

    public String getSentenciaConstructorConParametro() {
        return "        this." + variable + " = " + variable + ";\n";
    }

    public String getGetterJava() {
        return "    public " + tipo.getDefinicionJava() + " get" + Formato.mayusculaPrimeraLetra(variable) + "() {\n"
                + "        return " + variable + ";\n"
                + "    }\n";
    }

    public String getSetterJava() {
        return "    public void set" + Formato.mayusculaPrimeraLetra(variable) + "(" + tipo.getDefinicionJava() + " " + variable + ") {\n"
                + "        this." + variable + " = " + variable + ";\n"
                + "    }\n";
    }

    public String getPropiedadCSharp() {
        return "    public " + tipo.getDefinicionCSharp() + " " + Formato.mayusculaPrimeraLetra(variable) + " {\n"
                + "        get { return " + variable + "; }\n"
                + "        set { " + variable + " = value; }\n"
                + "    }\n";
    }

    public String getModoLecturaJava() {
        if (tipo.getArray().equals("no-array")) {
            if (tipo.isObjeto()) {
                return "        " + variable + ".leer();\n";
            } else {
                return "        System.out.print(\" " + nombre + ": \");\n"
                        + "        " + variable + " = " + tipo.getLecturaPrimitivaJava() + ";\n";
            }
        } else {
            if (tipo.getArray().equals("vector")) {
                if (tipo.isObjeto()) {
                    return "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            " + variable + "[i] = new " + nombre + "();\n"
                            + "            " + variable + "[i].leer();\n"
                            + "        }\n";
                } else {
                    return "        System.out.println(\" " + nombre + "\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            System.out.print(\"  [\" + i + \"]> \");\n"
                            + "            " + variable + "[i] = " + tipo.getLecturaPrimitivaJava() + ";\n"
                            + "        }\n";
                }
            } else {
                if (tipo.isObjeto()) {
                    return "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            for(int j = 0; j < " + tipo.getVariableArray2() + "; j++) {\n"
                            + "                " + variable + "[i][j] = new " + nombre + "();\n"
                            + "                " + variable + "[i][j].leer();\n"
                            + "            }\n"
                            + "        }\n";
                } else {
                    return "        System.out.println(\" " + nombre + ":\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            System.out.println(\" [\" + i + \"]\");\n"
                            + "            for(int j = 0; j < " + tipo.getVariableArray2() + "; j++) {\n"
                            + "                System.out.print(\"  [\" + j + \"]> \");\n"
                            + "                " + variable + "[i][j] = " + tipo.getLecturaPrimitivaJava() + ";\n"
                            + "            }\n"
                            + "        }\n";
                }
            }
        }
    }

    public String getModoEscrituraJava() {
        if (tipo.getArray().equals("no-array")) {
            if (tipo.isObjeto()) {
                return "        " + variable + ".mostrar();\n";
            } else {
                return "        System.out.println(\" " + nombre + ": \" + " + variable + ");\n";
            }
        } else {
            if (tipo.getArray().equals("vector")) {
                if (tipo.isObjeto()) {
                    return "        System.out.println(\" " + nombre + ":\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            " + variable + "[i].mostrar();\n"
                            + "        }\n";
                } else {
                    return "        System.out.println(\" " + nombre + ":\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            System.out.println(\"  [\" + i + \"] \" + " + variable + "[i]);\n"
                            + "        }\n";
                }
            } else {
                if (tipo.isObjeto()) {
                    return "        System.out.println(\" " + nombre + ":\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            for(int j = 0; j < " + tipo.getVariableArray2() + "; j++) {\n"
                            + "                " + variable + "[i][j].mostrar();\n"
                            + "            }\n"
                            + "        }\n";
                } else {
                    return "        System.out.println(\" " + nombre + ":\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            System.out.println(\" [\" + i + \"]\");\n"
                            + "            for(int j = 0; j < " + tipo.getVariableArray2() + "; j++) {\n"
                            + "                System.out.println(\"  [\" + j + \"] \" + " + variable + "[i][j]);\n"
                            + "            }\n"
                            + "        }\n";
                }
            }
        }
    }

    public String getModoLecturaCSharp() {
        if (tipo.getArray().equals("no-array")) {
            if (tipo.isObjeto()) {
                return "        " + variable + ".leer();\n";
            } else {
                return "        Console.Write(\" " + nombre + ": \");\n"
                        + "        " + variable + " = " + tipo.getLecturaPrimitivaCSharp() + ";\n";
            }
        } else {
            if (tipo.getArray().equals("vector")) {
                if (tipo.isObjeto()) {
                    return "        Console.WriteLine(\" " + nombre + "\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            " + variable + "[i] = new " + nombre + "();\n"
                            + "            " + variable + "[i].leer();\n"
                            + "        }\n";
                } else {
                    return "        Console.WriteLine(\" " + nombre + "\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            Console.Write(\"  [\" + i + \"]> \");\n"
                            + "            " + variable + "[i] = " + tipo.getLecturaPrimitivaCSharp() + ";\n"
                            + "        }\n";
                }
            } else {
                if (tipo.isObjeto()) {
                    return "        Console.WriteLine(\" " + nombre + ":\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            for(int j = 0; j < " + tipo.getVariableArray2() + "; j++) {\n"
                            + "                " + variable + "[i, j] = new " + nombre + "();\n"
                            + "                " + variable + "[i, j].leer();\n"
                            + "            }\n"
                            + "        }\n";
                } else {
                    return "        Console.WriteLine(\" " + nombre + ":\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            Console.WriteLine(\" [\" + i + \"]\");\n"
                            + "            for(int j = 0; j < " + tipo.getVariableArray2() + "; j++) {\n"
                            + "                Console.Write(\"  [\" + j + \"]> \");\n"
                            + "                " + variable + "[i, j] = " + tipo.getLecturaPrimitivaCSharp() + ";\n"
                            + "            }\n"
                            + "        }\n";
                }
            }
        }
    }

    public String getModoEscrituraCSharp() {
        if (tipo.getArray().equals("no-array")) {
            if (tipo.isObjeto()) {
                return "        " + variable + ".mostrar();\n";
            } else {
                return "        Console.WriteLine(\" " + nombre + ": \" + " + variable + ");\n";
            }
        } else {
            if (tipo.getArray().equals("vector")) {
                if (tipo.isObjeto()) {
                    return "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            " + variable + "[i].mostrar();\n"
                            + "        }\n";
                } else {
                    return "        Console.WriteLine(\" " + nombre + ":\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            Console.WriteLine(\"  [\" + i + \"] \" + " + variable + "[i]);\n"
                            + "        }\n";
                }
            } else {
                if (tipo.isObjeto()) {
                    return "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            for(int j = 0; j < " + tipo.getVariableArray2() + "; j++) {\n"
                            + "                " + variable + "[i][j].mostrar();\n"
                            + "            }\n"
                            + "        }\n";
                } else {
                    return "        Console.WriteLine(\" " + nombre + ":\");\n"
                            + "        for(int i = 0; i < " + tipo.getVariableArray1() + "; i++) {\n"
                            + "            Console.WriteLine(\" [\" + i + \"]\");\n"
                            + "            for(int j = 0; j < " + tipo.getVariableArray2() + "; j++) {\n"
                            + "                Console.WriteLine(\"  [\" + j + \"] \" + " + variable + "[i][j]);\n"
                            + "            }\n"
                            + "        }\n";
                }
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
