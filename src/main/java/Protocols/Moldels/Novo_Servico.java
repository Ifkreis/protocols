package Protocols.Moldels;

public class Novo_Servico {
    public String Cliente;
    public String Data;
    public String Horario;
    public long Numero_Protocolo;
    
    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        Cliente = cliente;
    }
    public String getData() {
        return Data;
    }
    public void setData(String data) {
        Data = data;
    }
    public String getHorario() {
        return Horario;
    }
    public void setHorario(String horario) {
        Horario = horario;
    }
    public long getNumero_Protocolo() {
        return Numero_Protocolo;
    }
    public void setNumero_Protocolo(long numero_Protocolo) {
        Numero_Protocolo = numero_Protocolo;
    }
}
