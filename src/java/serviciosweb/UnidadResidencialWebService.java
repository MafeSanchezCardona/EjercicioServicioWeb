/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosweb;

import identidades.UnidadResidencial;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.UnidadResidencialNegocio;

/**
 *
 * @author Mafe Sanchez
 */
@WebService(serviceName = "UnidadResidencialWebService")
public class UnidadResidencialWebService {

    UnidadResidencialNegocio unidadResidencial = new UnidadResidencialNegocio();
     /**
     * Web service operation
     */
    @WebMethod(operationName = "get")
    public List<UnidadResidencial> get(@WebParam(name = "idUnidad") String idUnidad) {
        return unidadResidencial.listUnidadResidencial(idUnidad);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "list")
    public List<UnidadResidencial> list() {
        return unidadResidencial.listUnidadResidencial();
    }
}
