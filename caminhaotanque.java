package herança;
public class caminhaotanque extends caminhao{
    private String tipo;

    public caminhaotanque(String modelo,int anoFabricacao,int capacidadeTotal,char unidade,String tipo){
        super(modelo,anoFabricacao,capacidadeTotal,unidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void enchetanque(){
        cargaAtual = getCapacidadeTotal();
    }
    public void esvaziaTanque(){
        cargaAtual = 0;
    }
    public void abasteceTanque(int qtdeLitros){
        cargaAtual += qtdeLitros;
    }
    public void descarregaTanque(int qtdeLitros){
        cargaAtual -= qtdeLitros;
    }
}
