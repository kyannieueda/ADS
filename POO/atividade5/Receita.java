public class Receita {
    public Consulta consulta;
    public String data;
    public String descritivo;

    public void preescrever(){
        //TODO
    }
    public void consultar(){
        //TODO
    }
    
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) throws Exception {
        if(consulta == null){
            throw new Exception("Consulta obrigatorio!!");
        } else{
            this.consulta = consulta;
        }
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public Receita(Consulta pConsulta, String pData, String pDescritivo) throws Exception{
        setConsulta(pConsulta);
        setData(pData);
        setDescritivo(pDescritivo);
    }

    public void mostrar(){
        System.out.println(">>>>>>Receita<<<<<<<");
        System.out.println("consulta:"+getConsulta());
        System.out.println("data:"+getData());
        System.out.println("descritivo:"+getDescritivo());
    }
}
