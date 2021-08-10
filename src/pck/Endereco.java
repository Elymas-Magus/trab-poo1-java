/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

/**
 *
 * @author Usuario
 */
class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;
    private int numero;
    private String complemento;
    private String cep;
    
    public Endereco(String logradouro, int numero, String bairro, String cidade, String complemento, String cep) {
        this.setLogradouro(logradouro);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setComplemento(complemento);
        this.setCep(cep);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }   

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
