package com.danyalvarez.generadordeclases;

/**
 * Clase Tipo
 * @author Daniel Alvarez (a3dany)
 */
public class Tipo {

    private String nombre;
    private String array;
    private String variableArray1;
    private String variableArray2;
    private boolean objeto;

    public Tipo() {
        this.nombre = "String";
        this.array = "no-array";
        this.variableArray1 = "";
        this.variableArray2 = "";
        this.objeto = false;
    }

    public Tipo(String nombre, String array, String variableArray1, String variableArray2, boolean objeto) {
        this.nombre = nombre;
        this.array = array;
        this.variableArray1 = variableArray1;
        this.variableArray2 = variableArray2;
        this.objeto = objeto;
    }

    public String getArray() {
        return array;
    }

    public void setArray(String array) {
        this.array = array;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isObjeto() {
        return objeto;
    }

    public void setObjeto(boolean objeto) {
        this.objeto = objeto;
    }

    public String getVariableArray1() {
        return variableArray1;
    }

    public void setVariableArray1(String variableArray1) {
        this.variableArray1 = variableArray1;
    }

    public String getVariableArray2() {
        return variableArray2;
    }

    public void setVariableArray2(String variableArray2) {
        this.variableArray2 = variableArray2;
    }

    /**
     * Genera la definicion int[], float, Persona[][]
     * @return
     */
    public String getDefinicionJava() {
        if (array.equals("no-array")) {
            return nombre;
        } else {
            if (array.equals("vector")) {
                return nombre + "[]";
            } else {
                return nombre + "[][]";
            }
        }
    }

    public String getDefinicionCSharp() {
        if (array.equals("no-array")) {
            return objeto ? nombre : nombre.toLowerCase();
        } else {
            if (array.equals("vector")) {
                return objeto ? nombre + "[]" : nombre.toLowerCase() + "[]";
            } else {
                return objeto ? nombre + "[,]" : nombre.toLowerCase() + "[,]";
            }
        }
    }

    public String getValorDefectoJava() {
        if (array.equals("no-array")) {
            if (nombre.equals("String")) {
                return "\"\"";
            }
            if (nombre.equals("int")) {
                return "0";
            }
            if (nombre.equals("float")) {
                return "0.0F";
            }
            if (nombre.equals("double")) {
                return "0.0";
            }
            if (nombre.equals("char")) {
                return "\'\'";
            }
            if (nombre.equals("boolean")) {
                return "false";
            }
            if (nombre.equals("long")) {
                return "0L";
            }
            if (nombre.equals("byte")) {
                return "0";
            }
            if (nombre.equals("short")) {
                return "0";
            }
            return "new " + nombre + "()";
        } else {
            if (array.equals("vector")) {
                return "new " + nombre + "[100]";
            } else {
                return "new " + nombre + "[100][100]";
            }
        }
    }

    public String getValorDefectoCSharp() {
        if (array.equals("no-array")) {
            if (nombre.equals("String")) {
                return "\"\"";
            }
            if (nombre.equals("int")) {
                return "0";
            }
            if (nombre.equals("float")) {
                return "0.0F";
            }
            if (nombre.equals("double")) {
                return "0.0";
            }
            if (nombre.equals("char")) {
                return "\'\'";
            }
            if (nombre.equals("boolean")) {
                return "false";
            }
            if (nombre.equals("long")) {
                return "0L";
            }
            if (nombre.equals("byte")) {
                return "0";
            }
            if (nombre.equals("short")) {
                return "0";
            }
            return "new " + nombre + "()";
        } else {
            if (array.equals("vector")) {
                return "new " + nombre + "[100]";
            } else {
                return "new " + nombre + "[100, 100]";
            }
        }
    }

    public String getLecturaPrimitivaJava() {
        if (nombre.equals("String")) {
            return "in.nextLine()";
        }
        if (nombre.equals("int")) {
            return "in.nextInt()";
        }
        if (nombre.equals("float")) {
            return "in.nextFloat()";
        }
        if (nombre.equals("double")) {
            return "in.nextDouble()";
        }
        if (nombre.equals("char")) {
            return "in.nextLine().charAt(0)";
        }
        if (nombre.equals("boolean")) {
            return "in.nextBoolean()";
        }
        if (nombre.equals("long")) {
            return "in.nextLong()";
        }
        if (nombre.equals("byte")) {
            return "in.nextByte()";
        }
        if (nombre.equals("short")) {
            return "in.nextShort()";
        }
        return "";
    }

    public String getLecturaPrimitivaCSharp() {
        if (nombre.equals("String")) {
            return "Console.ReadLine()";
        }
        if (nombre.equals("int")) {
            return "int.Parse(Console.ReadLine())";
        }
        if (nombre.equals("float")) {
            return "float.Parse(Console.ReadLine())";
        }
        if (nombre.equals("double")) {
            return "double.Parse(Console.ReadLine())";
        }
        if (nombre.equals("char")) {
            return "Console.ReadLine()[0]";
        }
        if (nombre.equals("boolean")) {
            return "boolean.Parse(Console.ReadLine())";
        }
        if (nombre.equals("long")) {
            return "long.Parse(Console.ReadLine())";
        }
        if (nombre.equals("byte")) {
            return "byte.Parse(Console.ReadLine())";
        }
        if (nombre.equals("short")) {
            return "short.Parse(Console.ReadLine())";
        }
        return "";
    }
}
