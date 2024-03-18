/**
 * @author Gabriel
 */
public class Fatorial {
    int num = 0;
    int fat = 1;
    String formula = "";
    
    public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
        for (int c = n; c > 1; c--){
            f *= c;
            s += c + " x "; 
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial(){
        return fat;
    }
    
    public String getFormula(){
        return formula;
    }
}
