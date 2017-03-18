package interfaces;

public class TEsfera implements ISolido {
    
    private float Radio;
    
    public TEsfera(){
        Radio = 0;
    }
    
    public void setRadio(float Rad){
        if(Rad > 0){
            Radio = Rad;
        }
    }
    
    public float getRadio(){
        return Radio;
    }
    
    @Override
    public double AreaTotal(){
        return 4*Math.PI*Radio*Radio;
    }
    
    @Override
    public double Volumen(){
        return (4*Math.PI*Radio*Radio*Radio)/3 ;
    }
}
