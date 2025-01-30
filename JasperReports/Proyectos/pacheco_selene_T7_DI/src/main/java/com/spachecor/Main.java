package com.spachecor;

public class Main {
    public static void main(String[] args) {
        GeneradorInformes.generarInformePDF(GeneradorInformes.rutaCSV, GeneradorInformes.rutaJRXML, GeneradorInformes.rutaJasper, "OrderLine");
        GeneradorInformes.generarInformeHTML(GeneradorInformes.rutaCSV, GeneradorInformes.rutaJRXML, GeneradorInformes.rutaJasper, "OrderLine");
    }
}