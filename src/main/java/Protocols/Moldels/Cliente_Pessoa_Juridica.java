package Protocols.Moldels;

public class Cliente_Pessoa_Juridica {
    private String CNPJ;
    private String Razao_Social;
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Cep;
    private String Numero;
    
    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    public String getRazao_Social() {
        return Razao_Social;
    }
    public void setRazao_Social(String razao_Social) {
        Razao_Social = razao_Social;
    }
    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }
    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }
    public String getCep() {
        return Cep;
    }
    public void setCep(String cep) {
        Cep = cep;
    }
    public String getNumero() {
        return Numero;
    }
    public void setNumero(String numero) {
        Numero = numero;
    }
}
