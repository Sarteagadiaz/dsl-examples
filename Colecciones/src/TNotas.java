
public class TNotas {
    
    private long Codigo;
    private String Nombre;
    private float Nota1;
    private float Nota2;
    private float Nota3;
    
    public TNotas(){
        Codigo = 0;
        Nombre = "";
        Nota1 = 0;
        Nota2 = 0;
        Nota3 = 0;
    }
    
    public void setCodigo(long cod){
        Codigo = cod;
    }
    
    public void setNombre(String nom){
        Nombre = nom.trim();
    }
    
    public void setNota1(float n1){
        if(n1>= 0 && n1<=5){
            Nota1 = n1;
        }
    }
    
    public void setNota2(float n2){
        if(n2 >= 0 && n2 <= 5) 
            Nota2 = n2;
    }
    
    public void setNota3(float n3){
        if(n3 >= 0 && n3 <= 5)
            Nota3 = n3;
    }
    
    public long getCodigo(){
        return Codigo;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public float getNota1(){
        return Nota1;
    }
    
    public float getNota2(){
        return Nota2;
    }
    public float getNota3(){
        return Nota3;
    }
    
    public float Definitiva(){
        return (Nota1 + Nota2 + Nota3 ) / 3;
    }
}
