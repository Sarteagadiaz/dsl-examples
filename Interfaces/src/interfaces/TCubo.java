package interfaces;

public class TCubo implements ISolido {
    
   private float Lado;
   
   public TCubo(){
       Lado=0;
   }
   
   public void setLado(float _lado){
       if(_lado > 0){
           Lado = _lado;
       }
   }
   
   public float getLado(){
       return Lado;
   }
   
   @Override
   public double AreaTotal(){
       return 6*Lado*Lado;
   }
   
   @Override
   public double Volumen(){
       return Lado*Lado*Lado;
   }
    
}
