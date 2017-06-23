package entidades;

public class Reserva {
    
    private String identificacao;
    private int numero_identificacao;
    private String nome;
    private String email;
    private String telefone;
    private String data_nascimento; 
    private String data_checkin;
    private String data_checkout;
    private int num_hospedes;
    private String observacoes;
    private int num_quarto;
    private int cod_reserva;

    public Reserva() {
        
    }

    public Reserva(String identificacao, int numero_identificacao, String nome, 
            String email, String telefone, String data_nascimento, 
            String data_checkin, String data_checkout, int num_hospedes,
            String observacoes, int num_quarto, int cod_reserva) {
        this.identificacao = identificacao;
        this.numero_identificacao = numero_identificacao;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.data_checkin = data_checkin;
        this.data_checkout = data_checkout;
        this.num_hospedes = num_hospedes;
        this.observacoes = observacoes;
        this.num_quarto = num_quarto;
        this.cod_reserva = cod_reserva;
    }

    public int getCod_reserva() {
        return cod_reserva;
    }

    public void setCod_reserva(int cod_reserva) {
        this.cod_reserva = cod_reserva;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getNumero_identificacao() {
        return numero_identificacao;
    }

    public void setNumero_identificacao(int numero_identificacao) {
        this.numero_identificacao = numero_identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getData_checkin() {
        return data_checkin;
    }

    public void setData_checkin(String data_checkin) {
        this.data_checkin = data_checkin;
    }

    public String getData_checkout() {
        return data_checkout;
    }

    public void setData_checkout(String data_checkout) {
        this.data_checkout = data_checkout;
    }

    public int getNum_hospedes() {
        return num_hospedes;
    }

    public void setNum_hospedes(int num_hospedes) {
        this.num_hospedes = num_hospedes;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getNum_quarto() {
        return num_quarto;
    }

    public void setNum_quarto(int num_quarto) {
        this.num_quarto = num_quarto;
    }
    
}
