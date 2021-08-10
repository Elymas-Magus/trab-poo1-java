/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Paciente extends Pessoa {
    private Date ultima_consulta;

    public Date getUltima_consulta() {
        return ultima_consulta;
    }

    public void setUltima_consulta(Date ultima_consulta) {
        this.ultima_consulta = ultima_consulta;
    }
}
