
public class Exame extends Consulta {     //herda todos os atributos da consulta
    public String data;
    public String descritivo;

    public void solicitar(){
    
    }
    public void consultar(){
        
    
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
    public Exame(){
        this.data="";
        this.descritivo="";
    }
    public Exame(String pData, String pDescritivo) throws Exception{
        setData(pData);
        setDescritivo(pDescritivo);
    }
    public void mostrar(){
        System.out.println(">>>>>>Exame<<<<<<<");
        System.out.println("data:"+getData());
        System.out.println("descritivo:"+getDescritivo());
    }
}
