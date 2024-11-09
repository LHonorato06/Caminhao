package herança;
public class caminhaoBau extends caminhao{
    private double volume;
    private double comprimento;
    private double largura;
    private double altura;

    public caminhaoBau(String modelo,int anoFabricacao,int capacidadeTotal,char unidade,double comprimento,double largura,double altura){
     super(modelo,anoFabricacao,capacidadeTotal,unidade);
     this.comprimento = comprimento;
     this.largura = largura;
     this.altura = altura;
     this.volume = calculaVolume();
    }

    public double getVolume() {
        return volume;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void carregaBau(double qtdeQuilos){
        double qtdeToneladas = qtdeQuilos/1000;
        cargaAtual += qtdeToneladas;
    }
    public void descarregaBau(double qtdeQuilos){
       double qtdeToneladas = qtdeQuilos/1000;
       cargaAtual -= qtdeToneladas;
    }
    private double calculaVolume(){
        double volumeEmMetrosCubicos = (comprimento * largura * altura);
        volume = volumeEmMetrosCubicos;
        return volume;
    }
}
