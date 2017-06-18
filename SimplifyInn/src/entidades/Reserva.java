/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Philipe
 */
public class Reserva {
    
    private int id;
    private String num;
    private String nome;
    private String email;
    private String telefone;
    private String datansc;
    private String checkin;
    private String checkout;
    private int numHospedes;
    private String OBSERVACOES;
    private int idQuarto;
    private int idReserva;
    
    private Reserva(){
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the num
     */
    public String getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the datansc
     */
    public String getDatansc() {
        return datansc;
    }

    /**
     * @param datansc the datansc to set
     */
    public void setDatansc(String datansc) {
        this.datansc = datansc;
    }

    /**
     * @return the checkin
     */
    public String getCheckin() {
        return checkin;
    }

    /**
     * @param checkin the checkin to set
     */
    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    /**
     * @return the checkout
     */
    public String getCheckout() {
        return checkout;
    }

    /**
     * @param checkout the checkout to set
     */
    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    /**
     * @return the numHospedes
     */
    public int getNumHospedes() {
        return numHospedes;
    }

    /**
     * @param numHospedes the numHospedes to set
     */
    public void setNumHospedes(int numHospedes) {
        this.numHospedes = numHospedes;
    }

    /**
     * @return the OBSERVACOES
     */
    public String getOBSERVACOES() {
        return OBSERVACOES;
    }

    /**
     * @param OBSERVACOES the OBSERVACOES to set
     */
    public void setOBSERVACOES(String OBSERVACOES) {
        this.OBSERVACOES = OBSERVACOES;
    }

    /**
     * @return the idQuarto
     */
    public int getIdQuarto() {
        return idQuarto;
    }

    /**
     * @param idQuarto the idQuarto to set
     */
    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    /**
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    

    
}
