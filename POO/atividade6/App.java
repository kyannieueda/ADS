public class App {
    public App() {
   }
   public static void main(String[] args){
      try{
        var pac1 =new Paciente(1, "maria souza", "1232123342", "11 2284872399", "F", 32, "maria@teste.com.br");
          pac1.mostrar();
        var med1 = new Medico("Fulano Ciclano", "1223422", "11 23128393", "Cardiologista", "rootn");
          med1.mostrar();
        var cslt1 = new Consulta("10/03/2026", "11:30:00", med1, pac1, "Dor de garganta", "Possui diabetes tipo 1");
          cslt1.mostrar();
        var agd1 = new Agenda("01/03/2026", "16:00", med1, pac1);
          agd1.mostrar();
        var exm1 = new Exame(cslt1 , "22/03/2026", "Testando");
          exm1.mostrar();
        var rct1 = new Receita( cslt1, "10/03/2026", "Testando");
          rct1.mostrar();
        var rcpt1 = new Recepcionista("Fulana Joana", "123212343284", "11 232748329", "Senha123");
          rcpt1.mostrar();
      }
      catch( Exception e){
        System.out.println("Ocorreu um erro " + e.getMessage());
      }  
   }
}
