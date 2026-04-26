public class Circulo extends Dimensoes implements FormasGeometricas {
    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public int QuantidadeArestas() {
        return 0;
    }

    @Override
    public float CalcularArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }
    
}
