
package Controlador;
import Modelo.Producto;
import Vista.dlgProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    
    private Producto pro;
    private dlgProducto vista;

    public Controlador(Producto pro, dlgProducto vista) {
        this.pro = pro;
        this.vista = vista;
        
        /// Hacer que el controlador ESCUCHE los botones de la vista
        
        // BOTONES ABAJO
        vista.btnCancel.addActionListener(this);
        vista.btnCerrar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        
        ///BOTONES ARRIBA
        vista.btnNuevo.addActionListener(this);
        vista.btnGuardar.addActionListener(this);
        vista.btnMostrar.addActionListener(this);
        
    }
    
    // INICIALIZAR INTERFAZ GRAFICA
    private void iniciarVista(){
        
        vista.setTitle(": :     Productos       : :");
        vista.setSize(500,500);
        vista.setVisible(true);
    }
    
    // CODIFICAR BOTON LIMPIAR 
    
    public void limpiar(){
            vista.txtCantidad.setText("");
            vista.txtCodigo.setText("");
            vista.txtDescripcion.setText("");
            vista.txtGanancia.setText("");
            vista.txtPcompra.setText("");
            vista.txtPventa.setText("");
            vista.txtTotalC.setText("");
            vista.txtTotalV.setText("");
            vista.txtUnidad.setText("");
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==vista.btnLimpiar){
            
            limpiar();
            
        }
        
        if(e.getSource()==vista.btnNuevo){
            
            // ACTIVAR BOXES BOTON NUEVO
            
            vista.txtCodigo.setEnabled(true);
            vista.txtCantidad.setEnabled(true);
            vista.txtDescripcion.setEnabled(true);
            vista.txtPcompra.setEnabled(true);
            vista.txtPventa.setEnabled(true);
            
            vista.txtUnidad.setEnabled(true);
            vista.txtGanancia.setEnabled(true);
            
            vista.btnGuardar.setEnabled(true);
            vista.btnMostrar.setEnabled(true);
            vista.btnLimpiar.setEnabled(true);
            
        }
        
        //BOTON GUARDAR ACTIVO
        
        if(e.getSource()==vista.btnGuardar){
            
           pro.setCodeP(vista.txtCodigo.getText());
           pro.setDescriP(vista.txtDescripcion.getText());
           pro.setUnidadMedida(vista.txtUnidad.getText());
           
           try{
                pro.setPrecioCompra(Integer.parseInt(vista.txtPcompra.getText()));
           pro.setPrecioVenta(Integer.parseInt(vista.txtPventa.getText()));
           pro.setCantidadP(Integer.parseInt(vista.txtCantidad.getText()));
           JOptionPane.showMessageDialog(vista, "Se agregó existosamente");
           limpiar();
           } catch(NumberFormatException ex){
               
               JOptionPane.showMessageDialog(vista, "Surgió el siguiente error: " + ex.getMessage());
               
           }
            catch(Exception ex2){
                
                JOptionPane.showMessageDialog(vista, "Surgió el siguiente error: " + ex2.getMessage());
            }
        }
        
        // BOTON CANCELAR
        if(e.getSource()==vista.btnCancel){
            limpiar();
            vista.txtCodigo.setEnabled(false);
            vista.txtCantidad.setEnabled(false);
            vista.txtDescripcion.setEnabled(false);
            vista.txtPcompra.setEnabled(false);
            vista.txtPventa.setEnabled(false);
            vista.txtUnidad.setEnabled(false);
            vista.txtGanancia.setEnabled(false);
            
            vista.btnGuardar.setEnabled(false); 
            vista.btnMostrar.setEnabled(false);
            vista.btnMostrar.setEnabled(false);
            
            
            
        }
        
        // BOTON MOSTRARc
         if(e.getSource()==vista.btnMostrar){
            
           vista.txtCodigo.setText(pro.getCodeP());
           vista.txtDescripcion.setText(pro.getDescriP());
           vista.txtUnidad.setText(pro.getUnidadMedida());
           
           vista.txtCantidad.setText(String.valueOf(pro.getCantidadP()));
           vista.txtPcompra.setText(String.valueOf(pro.getPrecioCompra()));
           vista.txtPventa.setText(String.valueOf(pro.getPrecioVenta()));
           vista.txtTotalC.setText(String.valueOf(pro.calculaCompra()));
           vista.txtTotalV.setText(String.valueOf(pro.calcularVenta()));
           vista.txtGanancia.setText(String.valueOf(pro.calcularGanancia()));
           
          
        }
        
         // BOTON CERRAR
        if(e.getSource()==vista.btnCerrar){
            int option = JOptionPane.showConfirmDialog(vista, "¿Desea salir?",
                    "Seleccione", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_NO_OPTION){
                vista.dispose();
                System.exit(0);
            }
        }
    }
    

    public static void main(String[] args) {        
        
        Producto pro = new Producto();
        dlgProducto vista = new dlgProducto(new JFrame(),true);
         
        Controlador contra = new Controlador(pro, vista);
        contra.iniciarVista();
        
        
    }

    
}
