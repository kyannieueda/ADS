public class App {
    public App() {
   }
   public static void main(String[] args){
    
     var p2 = new Paciente(1, "joao carlos","joao@gmail.com", "12345612","0800123","masculino", 50);
        p2.mostrar();  

    var ag1 = new Agenda("01/03/2026", "13:00","Fabiana", "joao carlos");
        ag1.mostrar();

    var cons1 = new Consulta("02/03/2026", "10:00","Alberto", "Joana", "Dor no peito", "Aprenta hipertensão");
        cons1.mostrar();

    var ex1 = new Exame("Primeira consulta", "03/03/2026", "Receitado remédio");
        ex1.mostrar();

    var med1 = new Medico("Alberto", "12345", "080016262", "Cardiologia", "1234");
        med1.mostrar();
    
    var rec1 = new Receita("Primeira consulta", "04/03/2026","Receitado remédio");
        rec1.mostrar();
    
    var recep1 = new Recepcionista("Ana Maria", "524252525","06747474","123456");
        recep1.mostrar();
   }
}