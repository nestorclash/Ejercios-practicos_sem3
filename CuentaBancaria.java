package cuenta_bancaria;

public class CUENTA_BANCARIA {


    long numeroCuenta;
    Cliente propietarioCuenta;
   double saldoCuenta;
    
    public void ABONAR(double cantidad){
        saldoCuenta+= cantidad;//logica de negocio
        
    }
    public void RETIRAR(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("Saldo insuficiente");
        }
        saldoCuenta-= cantidad;//logica de negocio
    }
    
    public String DATOSPROPIETARIOCUENTA(){
        String informacion="";
        informacion += "DUI: " + propietarioCuenta.DUICLIENTE + "\n";
        informacion += "NONMBRE: " + propietarioCuenta.NOMBRECLIENTE + "\n";
        informacion += "TELEFONO: " + propietarioCuenta.TELEFONOCLIENTE + "\n";
        return informacion;
    }
   
    }
