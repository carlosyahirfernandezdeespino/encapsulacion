//programa de ejemplo de encapsulamiento 
/*Nombre:Carlos Yahir {Fernandez De Espino
Grupo:301
Fecha:22/11/2023
*/
package encapsulacion;
import java.util.*;
abstract class CuentaBancaria
{
    private String titular;
    private double saldo;
    public CuentaBancaria(String titular, double saldoInicial)
    {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public void depositar(double monto)
    {
        saldo += monto;
    }
    public void retirar (double monto)
    {
        if(monto <= saldo)
        {
            saldo -= monto;
        }
        else
        {
            System.out.println("Saldo Insuficiente");
        }
    }
    public double obtenerSaldo()
    {
        return saldo;
    }
}
public class Encapsulacion 
{
    public static void main(String[] args) 
    {
        CuentaBancaria miCuenta = new CuentaBancaria ("Juan Perez",1000) {};
        miCuenta.depositar(500);
        miCuenta.retirar(200);
        System.out.println("Saldo Actual: " + miCuenta.obtenerSaldo());
    }
    
}
