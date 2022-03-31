
package Desarrollo;


public class TransaccionesBancarias {
    public static void main(String[] args) {
       
        CuentaBancaria cuenta =new CuentaBancaria();
        Sccanner leer = new Sccanner(System.in);
        
        
        String duiCliente,nombreCliente;
        long telefonoCliente;
        
        double abono, retiro;
        System.out.println("Igrese los datos que se le solicita acontinuacion:");
        System.out.println("Nombre del propietario:");
        duiCliente=leer.nextLine();
        
        System.out.println("Numero DUI:");
        nombreCliente=leer.nextLine();
        
        System.out.println("Telefono: ");
        telefonoCliente=leer.nextLong(); 
        
        Cliente propietario = new Cliente(duiCliente,nombreCliente,telefonoCliente);
        
        System.out.println("Ingrese la cantidad a abonar: ");
        cuenta.abonar(abono=leer.nextDouble());
        
        System.out.println("Ingrese cantidad a retirar");
        cuenta.retirar(retiro=leer.nextDouble());
        
        System.out.println("Su saldo de la cuenta es: " + cuenta.saldoCuenta);
        
        //obtener informacion del propietario
        System.out.println("Datos del propietario : \n" + cuenta.datosPropietarioCuenta());
    }
}
