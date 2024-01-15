package parte02.ejercicio02;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class CuentaBancariaDAO {

    static String CSV_FILE = System.getProperty("user.dir") + File.separator + "data" + File.separator + "cuentas.csv";
    public CuentaBancariaDAO() {
    }

    public List<CuentaBancariaDTO> consultarCuentas() throws Exception {
        List<CuentaBancariaDTO> cuentasDto = new ArrayList<>();
        List<HashMap<String, String>> cuentas = new ArrayList<>();

        try {
            cuentas = CsvData.getCsvData(CSV_FILE);

            for(HashMap<String, String> row : cuentas){
                CuentaBancariaDTO cuentaDto = new CuentaBancariaDTO();
                cuentaDto.setNumeroCuenta( row.get("NUMERO_CUENTA") );
                cuentaDto.setNumeroTarjeta( row.get("NUMERO_TARJETA") );
                cuentaDto.setBeneficiario( row.get("BENEFICIARIO") );
                cuentaDto.setSaldo( Double.parseDouble(row.get("SALDO")) );
                cuentasDto.add(cuentaDto);
            }

        } catch(Exception e) {
            //SE PUEDE HACER LOGS O CUALQUIER OTRO MANEJO DE CUENTAS
            System.out.println("Error al obtener cuentas");
        }

        return cuentasDto;
    }

    public CuentaBancariaDTO consultarCuentaByNumeroCuenta(String numeroCuenta) throws Exception {
        CuentaBancariaDTO cuentaDto = new CuentaBancariaDTO();
        HashMap<String, String> cuenta = new LinkedHashMap<>();

        try {
            cuenta = CsvData.filterData(CsvData.getCsvData(CSV_FILE),
                    "NUMERO_CUENTA", numeroCuenta.trim()
            ).get(0);

            if(!cuenta.isEmpty()){
                cuentaDto.setNumeroCuenta( cuenta.get("NUMERO_CUENTA") );
                cuentaDto.setNumeroTarjeta( cuenta.get("NUMERO_TARJETA") );
                cuentaDto.setBeneficiario( cuenta.get("BENEFICIARIO") );
                cuentaDto.setSaldo( Double.parseDouble(cuenta.get("SALDO")) );
            }

        } catch(Exception e) {
            //SE PUEDE HACER LOGS O CUALQUIER OTRO MANEJO DE CUENTAS
            System.out.println("Error al obtener cuentas");
        }

        return cuentaDto;
    }


    public Boolean updateSaldo(CuentaBancariaDTO cuentaDto) throws Exception {
        List<HashMap<String, String>> cuentas = new ArrayList<>();
        Boolean result = true;

        try {
            cuentas = CsvData.getCsvData(CSV_FILE);

            for(HashMap<String, String> cuenta : cuentas){
                if(cuentaDto.getNumeroCuenta().trim().equalsIgnoreCase(cuenta.get("NUMERO_CUENTA"))){
                    CsvData.setValueToColumn( cuenta, "SALDO", String.valueOf(cuentaDto.getSaldo()) );
                    break;
                }
                cuentas.add(cuenta);
            }
            CsvData.writeCSV(cuentas, CSV_FILE);

        } catch(Exception e) {
            result = false;
            //SE PUEDE HACER LOGS O CUALQUIER OTRO MANEJO DE CUENTAS
            System.out.println("Error al obtener cuentas");
        }

        return result;
    }

}




