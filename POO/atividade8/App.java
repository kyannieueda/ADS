public class App {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(5);
        retangulo.setAltura(3);
        System.out.println("===============Retângulo===============");
        System.out.println("Base: " + retangulo.getBase());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Quantidade de Arestas: " + retangulo.QuantidadeArestas());
        System.out.println("Área: " + retangulo.CalcularArea());

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(4);
        System.out.println("\n===============Quadrado===============");
        System.out.println("Lado: " + quadrado.getLado());
        System.out.println("Quantidade de Arestas: " + quadrado.QuantidadeArestas());
        System.out.println("Área: " + quadrado.CalcularArea());

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        System.out.println("\n===============Círculo===============");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Quantidade de Arestas: " + circulo.QuantidadeArestas());
        System.out.println("Área: " + circulo.CalcularArea());

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(6);
        triangulo.setAltura(4);
        System.out.println("\n===============Triângulo===============");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Quantidade de Arestas: " + triangulo.QuantidadeArestas());
        System.out.println("Área: " + triangulo.CalcularArea());
    }
}
