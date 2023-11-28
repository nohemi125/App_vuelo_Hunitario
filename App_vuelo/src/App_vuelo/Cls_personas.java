
package App_vuelo;

public class Cls_personas {
 private String str_Nombre; 
 private String str_Apellido;
 private String str_Categoria;
 private int int_Edad;
 private int int_Cantidad;
 
 public  Cls_personas (String Nombre, String Apellido,String Categoria,int Cantidad, int Edad){
   this.str_Nombre = Nombre;
   this.str_Apellido = Apellido;
   this.int_Edad = Edad;
   this.int_Cantidad = Cantidad;
   this.str_Categoria = Categoria;
}

    public String getStr_Categoria() {
        return str_Categoria;
    }

    public void setStr_Categoria(String str_Categoria) {
        this.str_Categoria = str_Categoria;
    }

    public int getInt_Cantidad() {
        return int_Cantidad;
    }

    public void setInt_Cantidad(int int_Cantidad) {
        this.int_Cantidad = int_Cantidad;
    }

    public String getStr_Nombre() {
        return str_Nombre;
    }

    public void setStr_Nombre(String str_Nombre) {
        this.str_Nombre = str_Nombre;
    }

    public String getStr_Apellido() {
        return str_Apellido;
    }

    public void setStr_Apellido(String str_Apellido) {
        this.str_Apellido = str_Apellido;
    }

    public int getInt_Edad() {
        return int_Edad;
    }

    public void setInt_Edad(int int_Edad) {
        this.int_Edad = int_Edad;
    }
 
}
