package interfaces;

public class TCilindro implements ISolido {
      
      private float Radio;
      private float Altura;
      
      public TCilindro(){
          Radio=0;
          Altura=0;
      }
      
      public void setRadio(float rad){
          if(rad > 0){
              Radio = rad;
          }
      }
      
      public void setAltura(float alt){
        if(alt > 0){
            Altura = alt;
        }
      }
      
      public float getRadio(){
          return Radio;
      }
      
      public float getAltura(){
          return Altura;
      }
      
      @Override
      public double AreaTotal(){
          return 2*Math.PI*Radio*(Altura+Radio);
      }
      
      @Override
      public double Volumen(){
       return Math.PI*Radio*Radio*Altura;   
      }
}
