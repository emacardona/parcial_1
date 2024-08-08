/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author emanu
 */


public class Empleado extends Persona {
    private String codigo;
         
    
    public Empleado(){}

    public Empleado(String codigo, String nombre, String apellidos, String direccion, String telefono, String fecha_nacimiento, String sueldo, String bonificacion, String total) {
        super(nombre, apellidos, direccion, telefono, fecha_nacimiento, sueldo, bonificacion, total);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Override
    protected String[] guardar(){
    try
    {
    
    String datos[] = new String[9];
           datos[0] = this.getCodigo();
           datos[1] = this.getNombre();
           datos[2] = this.getApellidos();
           datos[3] = this.getDireccion();
           datos[4] = this.getTelefono();
           datos[5] = this.getFecha_nacimiento();
           datos[6] = this.getSueldo();
           datos[7] = this.getBonificacion();
           datos[9] = this.getTotal();
           return datos;
            
    
    }
     catch(Exception ex)
            {
                  
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error en la validacion",JOptionPane.ERROR_MESSAGE);
                    return  null;
            }
           
           
   }
    
    
    
                        
            


    
}
