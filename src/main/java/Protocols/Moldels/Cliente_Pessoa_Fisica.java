package Protocols.Moldels;

public class Cliente_Pessoa_Fisica extends Pessoa{
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Cep;
    private String Numero;
    
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
