package utils.automation_core.web.uiactions;

public class MessagesActions {

	/**
	 * Mensaje de exito al visitar una URL
	 * @param url
	 * @return
	 */
	public static String successVisitURL(String url) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nVISIT URL SUCCESS." );
		msj.append( "\nSe visito la url: " + url );
		return msj.toString();
	}
	
	/**
	 * Mensaje de fallo al visitar una URL
	 * @param url
	 * @param exception
	 * @return
	 */
	public static String errorVisitURL(String url, String exception) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nVISIT URL FAILED." );
		msj.append( "\nError al visitar la url: " + url );
		msj.append( "\nException: " + exception );
		return msj.toString();
	}
	
	/**
	 * Mensaje de exito cuando se logra hacer switch a una ventana
	 * @param elementName
	 * @param timeOut
	 * @return
	 */
	public static String successSwitchWindow(String windowTitle) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nSWITCH WINDOW SUCCESS." );
		msj.append( "\nWindow Title/Index: " + windowTitle );
		return msj.toString();
	}
	
	/**
	 * Mensaje de fallo cuando se logra hacer switch a una ventana
	 * @param windowTitle
	 * @param timeOut
	 * @return
	 */
	public static String errorSwitchWindow(String windowTitle) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nSWITCH WINDOW FAILED." );
		msj.append( "\nError al hacer switch a la ventana con Title/Index: " + windowTitle );
		return msj.toString();
	}

	/**
	 * Mensaje de error cuando un elemento no es encontrado
	 * @param elementName
	 * @param timeOut
	 * @return
	 */
	public static String successUIElementFound(String elementName, int timeOut) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nASSERT SUCCESS." );
		msj.append( "\nSe encontro el elemento: " + elementName );
		msj.append( "\nTime Out: " + timeOut + " segundos" );
		return msj.toString();
	}
	
	/**
	 * Mensaje de error cuando un elemento no es encontrado
	 * @param elementName
	 * @param timeOut
	 * @param ex
	 * @return
	 */
	public static String errorUIElementNotFound(String elementName, int timeOut, String exception) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nASSERT FAILED." );
		msj.append( "\nNo se encontro el elemento: " + elementName );
		msj.append( "\nTime Out: " + timeOut + " segundos" );
		msj.append( "\nException: " + exception );
		return msj.toString();
	}
	
	/**
	 * Mensaje de error cuando un elemento no es encontrado
	 * @param elementName
	 * @param timeOut
	 * @param ex
	 * @return
	 */
	public static String errorUIElementNotFound(String elementName, int timeOut) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nASSERT FAILED." );
		msj.append( "\nNo se encontro el elemento: " + elementName );
		msj.append( "\nTime Out: " + timeOut + " segundos" );
		return msj.toString();
	}
	
	/**
	 * Mensaje de error cuando un elemento no es encontrado
	 * @param elementName
	 * @param timeOut
	 * @param ex
	 * @return
	 */
	public static String successElementNotExist(String elementName, int timeOut) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nWAIT FOR ELEMENT NOT EXIST SUCCESS." );
		msj.append( "\nNo se encontro el elemento: " + elementName );
		msj.append( "\nTime Out: " + timeOut + " segundos" );
		return msj.toString();
	}
	
	/**
	 * Mensaje de error cuando un elemento no es encontrado
	 * @param elementName
	 * @param timeOut
	 * @param ex
	 * @return
	 */
	public static String errorElementNotExist(String elementName, int timeOut) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nWAIT FOR ELEMENT NOT EXIST FAILED." );
		msj.append( "\nSe encontro el elemento: " + elementName );
		msj.append( "\nDespues de un Time Out: " + timeOut + " segundos" );
		return msj.toString();
	}
	
	

	/**
	 * Mensaje de accion ejecutada con exito
	 * @param elementName
	 * @param action
	 * @return
	 */
	public static String successUIElementAction(String elementName, String action) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nACTION SUCCESS." );
		msj.append( "\nElemento: " + elementName );
		msj.append( "\nAcción: " + action);
		return msj.toString();
	}

	/**
	 * Mensaje de accion ejecutada con exito
	 * @param elementName
	 * @param action
	 * @return
	 */
	public static String successUIElementAction(String elementName, String action, String data) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nACTION SUCCESS." );
		msj.append( "\nElemento: " + elementName );
		msj.append( "\nAcción: " + action);
		msj.append( "\nData: " + data);
		return msj.toString();
	}
	
	/**
	 * Mensaje de error al ejecutar una acción
	 * @param elementName
	 * @param action
	 * @return
	 */
	public static String errorUIElementAction(String elementName, String action, String exception) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nACTION FAILED." );
		msj.append( "\nElemento: " + elementName );
		msj.append( "\nAcción: " + action);
		msj.append( "\nException: " + exception );
		return msj.toString();
	}
	
	/**
	 * Mensaje de error al ejecutar una acción
	 * @param elementName
	 * @param action
	 * @return
	 */
	public static String errorUIElementAction(String elementName, String action, String data, String exception) {
		StringBuilder msj = new StringBuilder();
		msj.append( "\nACTION FAILED." );
		msj.append( "\nElemento: " + elementName );
		msj.append( "\nAcción: " + action);
		msj.append( "\nData: " + data);
		msj.append( "\nException: " + exception );
		return msj.toString();
	}

}
