package cuenta_bancaria;

public class Cuenta_Bancaria {


    long NumeroCuenta;
    Cliente propietarioCuenta;
   double SaldoCuenta;
    
    public void ABONAR(double cantidad){
        SaldoCuenta+= Cantidad;//logica de negocio
        
    }
    public void Retirar(double Cantidad){
        if(Cantidad > SaldoCuenta){
            System.out.println("Saldo insuficiente");
        }
        SaldoCuenta-= Cantidad;//logica de negocio
    }
    
    public String DatosPropietarioCuenta(){
        String informacion="";
        informacion += "DUI: " + propietarioCuenta.DUICliente + "\n";
        informacion += "Nombre: " + propietarioCuenta.NombreCliente + "\n";
        informacion += "Telefono: " + propietarioCuenta.TelefonoCliente + "\n";
        return informacion;
    }
   
    }
