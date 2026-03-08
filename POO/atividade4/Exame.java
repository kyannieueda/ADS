
public class Exame {
    public String consulta;
    public String data;
    public String descritivo;

    public void solicitar(){
        //TODO
    }
    public void consultar(){
        //TODO
    }
    
    public String getConsulta() {
        return consulta;
    }
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) throws Exception {
    if (data == null || data.length() < 8) {
        throw new Exception("Data obrigatória");
    } else {
        this.data = data;
    }
}
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
    public Exame (String pConsulta, String pData, String pDescritivo) throws Exception {
        setConsulta(pConsulta);
        setData(pData);
        setDescritivo(pDescritivo);
    }
    public void mostrar(){
        System.out.println(">>>>>Exame<<<<<<<");
        System.out.println("consulta:"+getConsulta());
        System.out.println("data:"+getData());
        System.out.println("descritivo:"+getDescritivo());
    }
}