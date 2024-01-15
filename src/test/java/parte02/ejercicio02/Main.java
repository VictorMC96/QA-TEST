package parte02.ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String market = "****************************************************************************************";
    static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        menuPrincipal();
    }

    private static void menuPrincipal() throws Exception {
        clearConsole();
        System.out.println(market);
        System.out.println("CUENTAS BANCARIAS");
        System.out.println(market);
        System.out.println("1. Consultar cuentas y saldo");
        System.out.println("2. Depositar a una cuenta");
        System.out.println("3. Retirar de una cuenta");
        System.out.println("4. SALIR");
        System.out.println(market);
        System.out.println("Seleccione una operación: ");
        seleccionarMenuPrincipal();
    }

    private static void seleccionarMenuPrincipal() throws Exception {
        int input = SC.nextInt();

        switch (input){
            case 1:
                consultarCuentas();
                break;
            case 2:
                updateSaldo("DEPOSITAR");
                break;
            case 3:
                updateSaldo("RETIRAR");
                break;
            case 4:
                return;
            default:
                System.out.println("Opcion invalida. Precione la tecla \"R\" para REGRESAR al menu principal");
                regresarMenuPrincipal();
        }
    }

    private static void regresarMenuPrincipal() throws Exception {
        System.out.println("Precione la tecla \"R\" para REGRESAR al menu principal");
        String volver = String.valueOf( SC.next() );
        menuPrincipal();
    }

    public static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }


    private static void consultarCuentas() throws Exception {
        List<CuentaBancariaDTO> cuentasDto = new CuentaBancariaDAO().consultarCuentas();
        clearConsole();
        System.out.println(market);
        System.out.println("CONSULTAR CUENTAS");
        System.out.println(market);
        System.out.println("| NUMERO_CUENTA\t|\tNUMERO_TARJETA\t|\tBENEFICIARIO\t|\tSALDO\t|\t");
        System.out.println(market);
        for(CuentaBancariaDTO cuenta : cuentasDto){
            System.out.println("|" + cuenta.getNumeroCuenta() + "\t|\t" + cuenta.getNumeroTarjeta()
                    + "\t|\t" + cuenta.getBeneficiario() + "\t|\t" + cuenta.getSaldo() + "\t|\t");
        }
        System.out.println(market);
        regresarMenuPrincipal();
    }

    private static void updateSaldo(String operacion) throws Exception {
        CuentaBancariaDTO cuentaDto = new CuentaBancariaDTO();
        CuentaBancariaDAO cuentaDao = new CuentaBancariaDAO();
        boolean deposito = true;
        clearConsole();
        System.out.println(market);
        System.out.println("Digite una cuenta para realizar el " + operacion + ": ");
        String numeroCuenta = String.valueOf( SC.nextBigInteger().toString() );
        cuentaDto = cuentaDao.consultarCuentaByNumeroCuenta(numeroCuenta.trim());
        System.out.println(market);

        System.out.println(market);
        System.out.println("REALIZAR " + operacion.toUpperCase().trim() + " A CUENTA: " + cuentaDto.getNumeroCuenta().trim());
        System.out.println(market);
        System.out.println("| NUMERO_CUENTA\t|\tNUMERO_TARJETA\t|\tBENEFICIARIO\t|\tSALDO\t|\t");
        System.out.println(market);
        System.out.println("|" + cuentaDto.getNumeroCuenta() + "\t|\t" + cuentaDto.getNumeroTarjeta()
                + "\t|\t" + cuentaDto.getBeneficiario() + "\t|\t" + cuentaDto.getSaldo() + "\t|\t");
        System.out.println(market);

        System.out.println(market);
        System.out.println("Digite cantidad a " + operacion.toLowerCase().trim() + ": ");
        Double cantidadDeposito = SC.nextDouble();
        System.out.println(market);
        if(operacion.equalsIgnoreCase("DEPOSITAR")){
            cuentaDto.depositar(cantidadDeposito);
        }
        if(operacion.equalsIgnoreCase("RETIRAR")){
            cuentaDto.retirar(cantidadDeposito);
        }
        deposito = cuentaDao.updateSaldo(cuentaDto);

        if(deposito){
            System.out.println(market);
            System.out.println(operacion.toUpperCase().trim() + " REALIZADO A LA CUENTA: " + cuentaDto.getNumeroCuenta());
            System.out.println(market);
            System.out.println("| NUMERO_CUENTA\t|\tNUMERO_TARJETA\t|\tBENEFICIARIO\t|\tSALDO\t|\t");
            System.out.println(market);
            System.out.println("|" + cuentaDto.getNumeroCuenta() + "\t|\t" + cuentaDto.getNumeroTarjeta()
                    + "\t|\t" + cuentaDto.getBeneficiario() + "\t|\t" + cuentaDto.getSaldo() + "\t|\t");
            System.out.println(market);
            regresarMenuPrincipal();
            return;
        }

        System.out.println(market);
        System.out.println("Error al realizar operacion: " + operacion.trim());
        System.out.println(market);
        seleccionarMenuPrincipal();
    }


}
