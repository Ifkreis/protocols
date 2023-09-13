package Protocols.Moldels;

public class Dispositivo {
    private String Marca;
    private String Tipo;
    private String ConfiguracaoDispositivo;
    private String Ano;
    private String Armazenamento;
    private String PlacaMae;
    
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public String getConfiguracaoDispositivo() {
        return ConfiguracaoDispositivo;
    }
    public void setConfiguracaoDispositivo(String configuracaoDispositivo) {
        ConfiguracaoDispositivo = configuracaoDispositivo;
    }
    public String getAno() {
        return Ano;
    }
    public void setAno(String ano) {
        Ano = ano;
    }
}
