
public class Exame {
    public Consulta consulta;
    public String data;
    public String descritivo;

    public void solicitar(){
        //TODO
    }
    public void consultar(){
        //TODO
    }
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) throws Exception{
        if(data==null){
            throw new Exception("Campo data obrigatório!!!");
        } else{
            this.data = data;
        }
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
    public Exame(Consulta pConsulta, String pData, String pDescritivo) throws Exception{
        setConsulta(pConsulta);
        setData(pData);
        setDescritivo(pDescritivo);
    }
    public void mostrar(){
        System.out.println(">>>>>>Exame<<<<<<<");
        System.out.println("consulta:"+getConsulta());
        System.out.println("data:"+getData());
        System.out.println("descritivo:"+getDescritivo());
    }
}
