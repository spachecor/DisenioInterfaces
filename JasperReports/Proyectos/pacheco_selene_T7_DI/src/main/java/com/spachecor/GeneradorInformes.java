package com.spachecor;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRCsvDataSource;

/**
 * Clase GeneradorInformes que se encarga de generar informes con la librería Jasper Report
 * @author Selene
 * @version 1.0
 */
public class GeneradorInformes {
    public static final String rutaJRXML = "src/main/resources/jasperreport/pacheco_selene_T7_DI.jrxml";
    public static final String rutaJasper = "src/main/resources/jasperreport/pacheco_selene_T7_DI.jasper";
    public static final String rutaCSV = "src/main/resources/csv/OrderLine_v4.csv";

    /**
     * Método que se encarga de generar un informe PFD de nuestro CSV
     * @param rutaCSV La ruta donde se encuentra nuestro CSV
     * @param rutaJRXML La ruta donde se encuentra nuestro fichero tipo jrxml
     * @param rutaJasper La ruta donde se encuentra nuestro fichero tipo jasper
     * @param nombrePDF La ruta donde se genera nuestro pdf
     * @return
     */
    public static boolean generarInformePDF(String rutaCSV, String rutaJRXML, String rutaJasper, String nombrePDF){
        try{
            JasperPrint jasperPrint = GeneradorInformes.preGenerar(rutaCSV, rutaJRXML, rutaJasper);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "src/main/resources/pdf/"+nombrePDF+".pdf");
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Método que se encarga de generar un informe PFD de nuestro CSV
     * @param rutaCSV La ruta donde se encuentra nuestro CSV
     * @param rutaJRXML La ruta donde se encuentra nuestro fichero tipo jrxml
     * @param rutaJasper La ruta donde se encuentra nuestro fichero tipo jasper
     * @param nombreHTML La ruta donde se genera nuestro html
     * @return
     */
    public static boolean generarInformeHTML(String rutaCSV, String rutaJRXML, String rutaJasper, String nombreHTML){
        try{
            JasperPrint jasperPrint = GeneradorInformes.preGenerar(rutaCSV, rutaJRXML, rutaJasper);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, "src/main/resources/html/"+nombreHTML+".html");
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Método que se encarga de generar nuestro objeto JasperPrint para poder pintar un informe. Es un pre-generador
     * de informes, porque nos da una base para generar cualquier informe del CSV que indiquemos
     * @param rutaCSV La ruta donde se encuentra nuestro CSV
     * @param rutaJRXML La ruta donde se encuentra nuestro fichero tipo jrxml
     * @param rutaJasper La ruta donde se encuentra nuestro fichero tipo jasper
     * @return
     */
    private static JasperPrint preGenerar(String rutaCSV, String rutaJRXML, String rutaJasper){
        try{
            JasperCompileManager.compileReportToFile(rutaJRXML, rutaJasper);
            JRCsvDataSource datasource = new JRCsvDataSource(rutaCSV);
            datasource.setUseFirstRowAsHeader(true);
            return JasperFillManager.fillReport(rutaJasper, null, datasource);
        }catch (Exception e){
            return null;
        }
    }
}
