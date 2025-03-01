package Cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        System.out.println("El saldo actual es" + cuenta1.estado());

        operativa_cuenta(cuenta1, 2300, 695);
    }

    public static void operativa_cuenta(CCuenta cuenta, float cantidadRetiro, float cantidadIngreso) {
        try {
            cuenta.retirar(cantidadRetiro);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidadIngreso);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
