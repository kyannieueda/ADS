public class Quadrado extends Dimensoes implements FormasGeometricas {
    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public int QuantidadeArestas() {
        return 4;
    }

    @Override
    public float CalcularArea() {
        return (float) Math.pow(lado, 2);
    }   
    
}
