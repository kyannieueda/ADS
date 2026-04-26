public class Retangulo extends Dimensoes implements FormasGeometricas {
    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public int QuantidadeArestas() {
        return 4;
    }

    @Override
    public float CalcularArea() {
        return base * altura;
    }
    
}
