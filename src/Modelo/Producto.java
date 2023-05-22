
package Modelo;


public class Producto {
    
    //ATRIBUTOS
    
    public int  cantidadP;
    public String codeP,descriP, unidadMedida;
    public float precioC, precioV;
    
    //CAPTURAR DATOS
    public Producto(String cod, String des, String uniM, float preC, float preV, int canP ){
        
        this.codeP = cod;
        this.descriP = des;
        this.unidadMedida = uniM;
        this.precioC = preC;
        this.precioV = preV;
        this.cantidadP = canP;
    }
    
    //CLASE VACIA
    public Producto(){
        
        this.codeP = "";
        this.descriP = "";
        this.unidadMedida = "";
        this.precioC = 0;
        this.precioV = 0;
        this.cantidadP = 0;
    }
    
    //DUPLICAR OBJETO
    public Producto(Producto ob){
        
        this.codeP = ob.codeP;
        this.descriP = ob.descriP;
        this.unidadMedida = ob.unidadMedida;
        this.precioC = ob.precioC;
        this.precioV = ob.precioV;
        this.cantidadP = ob.cantidadP;
    }
    
    //SET
    public void setCodeP(String cod){
        
        this.codeP = cod;
    }
    
    public void setDescriP(String des){
            
        this.descriP = des;
    }
    
    public void setUnidadMedida(String uniM){
        
        this.unidadMedida = uniM;  
    }
    
    public void setPrecioCompra(float preC){
        
        this.precioC = preC;
    }
    
    public void setPrecioVenta(float preV){
        
        this.precioV = preV;  
    }
    
    public void setCantidadP(int canP){
        
        this.cantidadP = canP;
    }
    
    
    //GET
    public String getCodeP(){
        
        return codeP;
    }
    
    public String getDescriP(){
        
        return descriP;
    }
    
    public String getUnidadMedida(){
        
        return unidadMedida;
    }
    
    public float getPrecioCompra(){
        
        return precioC;
    }
    
    public float getPrecioVenta(){
        
        return precioV;
    }
    
    public int getCantidadP(){
        
        return cantidadP;
    }
    
    
    //COMPRA
    public float calculaCompra(){
        
        return (getCantidadP() * getPrecioCompra());
    }
    
    
    //VENTA
    public float calcularVenta(){
        
        return (getCantidadP() * getPrecioVenta());
    }
    
    //GANANCIA
    public float calcularGanancia(){
        
        return (calcularVenta()-calculaCompra());
    }
}
