
package tienda;


public class Producto {
    
    //ATRIBUTOS
    
    public int codeP, cantidadP;
    public String descriP, unidadMedida;
    public double precioC, precioV;
    
    //CAPTURAR DATOS
    public Producto(int cod, String des, String uniM, double preC, double preV, int canP ){
        
        this.codeP = cod;
        this.descriP = des;
        this.unidadMedida = uniM;
        this.precioC = preC;
        this.precioV = preV;
        this.cantidadP = canP;
    }
    
    //CLASE VACIA
    public Producto(){
        
        this.codeP = 0;
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
    public void setCodeP(int cod){
        
        this.codeP = cod;
    }
    
    public void setDescriP(String des){
            
        this.descriP = des;
    }
    
    public void setUnidadMedida(String uniM){
        
        this.unidadMedida = uniM;  
    }
    
    public void setPrecioCompra(double preC){
        
        this.precioC = preC;
    }
    
    public void setPrecioVenta(double preV){
        
        this.precioV = preV;  
    }
    
    public void setCantidadP(int canP){
        
        this.cantidadP = canP;
    }
    
    
    //GET
    public int getCodeP(){
        
        return codeP;
    }
    
    public String getDescriP(){
        
        return descriP;
    }
    
    public String getUnidadMedida(){
        
        return unidadMedida;
    }
    
    public double getPrecioCompra(){
        
        return precioC;
    }
    
    public double getPrecioVenta(){
        
        return precioV;
    }
    
    public int getCantidadP(){
        
        return cantidadP;
    }
    
    
    //COMPRA
    public double calculaCompra(){
        
        return (getCantidadP() * getPrecioCompra());
    }
    
    
    //VENTA
    public double calcularVenta(){
        
        return (getCantidadP() * getPrecioVenta());
    }
    
    //GANANCIA
    public double calcularGanancia(){
        
        return (calcularVenta()-calculaCompra());
    }
}
