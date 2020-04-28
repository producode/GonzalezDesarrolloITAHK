package Estrategia.exportacion.PDF;

import Estrategia.exportacion.EstrategiaExportacion;

public class ExportarAPDF implements EstrategiaExportacion {
    private AdapterExportadorAPDF adapter;

    public ExportarAPDF(AdapterExportadorAPDF adapter){
        this.adapter = adapter;
    }


}
