package herança;
public class caminhao {
    static private int contadorAutomatico = 0123;
    private int nrCaminhao;
    private String modelo;
    private int anoFabricacao;
    private int capacidadeTotal;
    protected double cargaAtual = 0;
    private char unidade;

    public caminhao(String modelo,int anoFabricacao,int capacidadeTotal,char unidade){
      this.nrCaminhao = contadorAutomatico++;
      this.modelo = modelo;
      this.anoFabricacao = anoFabricacao;
      this.capacidadeTotal = capacidadeTotal;
      this.unidade = unidade;
    }

    public static int getContadorAutomatico() {
        return contadorAutomatico;
    }

    public int getNrCaminhao() {
        return nrCaminhao;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public char getUnidade() {
        return unidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
}
