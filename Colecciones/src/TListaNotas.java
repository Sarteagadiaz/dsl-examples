import java.util.ArrayList;


public class TListaNotas {
    
    private ArrayList<TNotas> lista;
    
    public TListaNotas(){
        lista = new ArrayList();
    }
    
    public int Cantidad(){
        return lista.size();
    }
    
    public void Agregar(TNotas not){
       lista.add(not);
    }
    
    public void Insertar(int pos, TNotas not){
        lista.add(pos, not);
    }
    
    public void Eliminar(TNotas not){
        lista.remove(not);
    }
    
    public void Eliminar(int pos){
        lista.remove(pos);
    }
    
    public TNotas getNotas(int pos){
        return lista.get(pos);
    }
    
    public void Cambiar(int p1, int p2){
        TNotas n1, n2;
        n1 = lista.get(p1);
        n2 = lista.get(p2);
        lista.set(p1, n2);
        lista.set(p2, n1);
    }
    
    public void OrdenarCod(){
        int i,j;
        int d,n;
        n = lista.size();
        d = n/2;
        while(d >= 1){
            for(i=d; i<n; i++){
                j = i;
                while(j-d >= 0){
                    if(getNotas(j-d).getCodigo() > getNotas(j).getCodigo()){
                        Cambiar(j-d, j);
                        j= j-d;
                    }
                    else{
                        break;
                    }
                }
            }
          d = d/2;  
        }
    }
    
    public void OrdenarNom(){
        int i,j,n;
        n=lista.size();
        
        for(i=1; i<n; i++){
            for(j=0; j<n-i; j++){
                if(getNotas(j).getNombre().compareTo(getNotas(j+1).getNombre()) > 0){
                    Cambiar(j, j+1);
                }
            }
        }
    }
    
    public void OrdenarDef(){
        int i, j, n;
        n = lista.size();
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(getNotas(i).Definitiva() < getNotas(j).Definitiva()){
                    Cambiar(i,j);
                }
            }
        }
    }
    
    
    public TNotas Buscar(long cod){
        int i, n;
        TNotas not;
        n = lista.size();
        not = null;
        i = 0;
        while( i < n && not == null ){
            if( getNotas(i).getCodigo() == cod){
                not = getNotas(i);
            }
            else{
                i++;
            }
        }
        return not;
    }
    
    public int Aprobados(){
        int i, cant;
        cant = 0;
        for(i=0; i<lista.size(); i++){
            if(getNotas(i).Definitiva() >= 3){
                cant += 1;
            }
        }
        return cant;
    }
    
    public int Reprobados(){
        return lista.size() - Aprobados();
    }
    
    public float PromGeneral(){
        int i,n;
        float sum;
        sum=0;
        n = lista.size();
        for(i=0; i<n; i++){
            sum += getNotas(i).Definitiva();
        }
        if(n > 0){
            return sum/n;
        }
        else{
            return 0;
        }
    }
    
    public float PromAprobados(){
        int i, cant;
        float sum, def;
        sum = 0;
        cant = 0;
        for(i=0; i < lista.size(); i++){
            def = getNotas(i).Definitiva();
            if(def >= 3){
                sum += def;
                cant += 1;
            }
        }
        if( cant > 0) {
            return sum/cant;
        }
        else{
            return 0;
        }
    }
    
    public float PromReprobados(){
        int i, cant;
        float sum, def;
        sum = 0;
        cant = 0;
        for(i=0; i < lista.size(); i++){
            def = getNotas(i).Definitiva();
            if(def < 3){
                sum += def;
                cant += 1;
            }
        }
        if( cant > 0) {
            return sum/cant;
        }
        else{
            return 0;
        }
    }
    
    public void Limpiar(){
        lista.clear();
    }
}
