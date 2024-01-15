package utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Permite gestionar datos de un archivo CSV, utilizando OPENCSV
 * @author DavidChavezAvila
 *
 */
public class CsvData {

    public static final char SEPARATOR=',';
    public static final char QUOTE='"';
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

        String file = "data/test_login.csv";
		
		List<HashMap<String, String>> dataList = getCsvData(file);	        
		System.out.println(dataList);
		
		setValueToColumn(dataList.get(1), "PASSWORD", "AAA");
		System.out.println(dataList);

		writeCSV(dataList, file);

	}
	
	
	/**	
	 * Metodo para obtener la data de un csv data pool. 
	 * @param fileName
	 * 			el nombre del archivo csv, puede contener la exteci�n o no.
	 * @return lista de tipo hashmap por cada registro del csv
	 * @throws Exception 
	 */
	public static List<HashMap<String, String>> getCsvData(String fileName) throws Exception {
		CSVReader dt = null;
		List<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> data;
	   	String dataFile;
		List<String[]> filas;
		
	   	dataFile = fileName.contains(".csv") ? fileName.toLowerCase().trim() : fileName.toLowerCase().trim() + ".csv";
	   	
		try {						
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(dataFile), "UTF-8");
            //datos = new CSVReader(new FileReader(ruta), SEPARATOR, QUOTE);
            dt = new CSVReader(inputStreamReader, SEPARATOR, QUOTE);
			filas = dt.readAll();

			//ITERAR FILAS
            for(int i = 1; i < filas.size(); i++) {
    			data = new LinkedHashMap<String, String>();
    			
            	//ITERAR COLUMNAS
            	for(int j = 0; j < filas.get(i).length; j++) {
                	//AGERGAR COLUMNA Y VALOR DE COLUMANA A LA FILA CORRESPONDIENTE				   	
                	data.put(filas.get(0)[j].trim(), filas.get(i)[j].trim());

            	}

		        dataList.add(data);
            }

			dt.close();
	        //log.debug("DATA: " + dataList);
			
		} catch (FileNotFoundException e) {
			throw new Exception("No se pudo leer la data del archivo: " + fileName + " \n" + e.getMessage());
		} catch (IOException e) {
			throw new Exception("No se pudo leer la data del archivo: " + fileName + " \n" + e.getMessage());
		}
		
		return dataList;
	}
	
	public static List<HashMap<String, String>> filterData(List<HashMap<String, String>> data, String column, String value) throws Exception{
		List<HashMap<String, String>> dataFilter = new ArrayList<HashMap<String, String>>();
		
		try {
			for (int i = 0; i < data.size(); i++) {
				for(int h = 0; h < data.get(i).keySet().size(); h++ ) {						
					String currentColumn = data.get(i).keySet().toArray()[h].toString().trim();
					String currentValue = data.get(i).get(currentColumn).trim();		
					
					if(currentColumn.equalsIgnoreCase(column) && currentValue.equalsIgnoreCase(value)) {
						dataFilter.add(data.get(i));
					}				
				}
			}
			
			if(dataFilter.isEmpty()) {
				throw new Exception("Lista de datos vacia al aplicar los filtros" 
						+ "\n Columna: " + column
						+ "\n Valor de Columna: " + value
						);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("No se pudo filtrar la data:" + data 
					+ "\n Columna: " + column
					+ "\n Valor de Columna: " + value
					+ "\n" + e.getMessage());

		}
		
		return dataFilter;
	}
	
	public static List<HashMap<String, String>> filterDataContains(List<HashMap<String, String>> data, String column, String valueContains) throws Exception{
		List<HashMap<String, String>> dataFilter = new ArrayList<HashMap<String, String>>();
		
		try {
			for (int i = 0; i < data.size(); i++) {
				for(int h = 0; h < data.get(i).keySet().size(); h++ ) {						
					String currenColumn = data.get(0).keySet().toArray()[h].toString();
					String currenValue = data.get(i).get(column);		
					
					if(currenColumn.equalsIgnoreCase(column) && currenValue.toLowerCase().contains(valueContains.toLowerCase())) {
						dataFilter.add(data.get(i));
					}				
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("No se pudo filtrar la data:" + data 
					+ "\n Columna: " + column
					+ "\n Valor que debería contener la Columna: " + valueContains
					+ "\n" + e.getMessage());

		}
		
		return dataFilter;
	}
	
	
	/**
	 * Setea un Valor a una Columna de X Fila
	 * @param row Map<String, String> fila que se esta leyendo
	 * @param column String nombre de la columna tal cual esta en el archivo CSV
	 * @param value String valor que se le va asignar a la columna
	 */
	public static void setValueToColumn(HashMap<String, String> row, String column, String value) {
		row.replace(column.trim(), value.trim());
		System.out.println("VALOR MODIFICADO"
				+ "FILA: " + row
				+ "COLUMNA: " + column
				+ "NUEVO VALOR: " + value
				);
	}
	
	
	/**
	 * Escribe un CSV File
	 * @param dataList List<HashMap<String, String>> Lista HashMap de todos los datos del CSV. Obtener previamente usando getCsvData(String fileName)
	 * @param fileName String Path + Nombre del archivo CSV
	 * @throws Exception 
	 */
	public static void writeCSV(List<HashMap<String, String>> dataList, String fileName) throws Exception {
	    // first create file object for file placed at location
	    // specified by filepath
	    File file = new File(fileName);	
	    
		try {
	        // create FileWriter object with file as parameter
	        FileWriter outputfile = new FileWriter(file);

	        // create CSVWriter object filewriter object as parameter
	        CSVWriter csvOutput = new CSVWriter(outputfile, SEPARATOR, QUOTE);

			//crear una array para almacenar los headers
	        String[] headers = new String[dataList.get(0).keySet().size()];

	        //itera en base a los headres y los mete al array
			for(int h = 0; h < dataList.get(0).keySet().size(); h++ ) {
				headers[h] = dataList.get(0).keySet().toArray()[h].toString();
			}
			
			//escribe los headers en el csv
			csvOutput.writeNext(headers);

			
			//iteramos la lista de datos (filas csv)
			for (int i = 0; i < dataList.size(); i++) {
				//crear una array para almacenar los valores de las columnas para la fila correspondiente
		        String[] values = new String[dataList.get(i).keySet().size()];
		        
				//iteramos para cada header
				for(int h = 0; h < dataList.get(i).keySet().size(); h++ ) {			
			        
			        //obtenemos el nombre de la columna
					String column = dataList.get(i).keySet().toArray()[h].toString();
					//obtenemos el valor de la columna
					String valueColumn = dataList.get(i).get(column);
					
					//almacenamos en el array values los valores
			        values[h] = valueColumn;
				}
				
				//despues de cada iteracion vamos escribiendo el csv
				csvOutput.writeNext(values);
				
			}

			csvOutput.flush();
			csvOutput.close();

			System.out.println("ARCHIVO CSV CREADO: " + file);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new Exception("No se pudo escribir el archivo CSV:" + file
					+ " \nException" + e.getMessage());			}
		
		
	}
	
	

}
