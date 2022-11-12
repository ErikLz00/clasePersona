


import java.util.Scanner;

public class ejercicioPersona {
    
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        Persona miPersona= new Persona();
        
        System.out.print("Ingrese su nombre : ");
        String ingreseNombre=entrada.next();
        
        System.out.print("Ingrese su edad : ");
        int ingreseEdad=entrada.nextInt();
        
        System.out.print("Ingrese su télefono : ");
        String ingreseTelefono=entrada.next();
        
        miPersona.setNombre(ingreseNombre);
        miPersona.setEdad(ingreseEdad);
        miPersona.setTelefono(ingreseTelefono);
        
        System.out.println("Hola "+miPersona.getNombre()+" con "+miPersona.getEdad()
                +" años y con télefono "+miPersona.getTelefono());
        
        
        
        
    }
}

class Persona{
    
    private String nombre;
    private int edad;
    private String telefono;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
        
    }
    public int getEdad(){
        return this.edad;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
        
    }
    public String getTelefono(){
        return this.telefono;
    }

}