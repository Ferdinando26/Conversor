public class Cambio {

    private double valor;
    private String moedaBase;
    private String moedaAlvo;
    private double resultadoConversao;

    public Cambio (CambioConvertido cambioConvertido){


        this.moedaBase = cambioConvertido.base_code();
        this.moedaAlvo = cambioConvertido.target_code();
        this.resultadoConversao = cambioConvertido.conversion_result();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public void setMoedaBase(String moedaBase) {
        this.moedaBase = moedaBase;
    }

    public String getMoedaAlvo() {
        return moedaAlvo;
    }

    public void setMoedaAlvo(String moedaAlvo) {
        this.moedaAlvo = moedaAlvo;
    }

    public double getResultadoConversao() {
        return resultadoConversao;
    }

    public void setResultadoConversao(double resultadoConversao) {
        this.resultadoConversao = resultadoConversao;
    }



    @Override
    public String toString() {
        return
                "valor " + valor +"[" + moedaBase + "]" + " corresponde ao valor final de =>>>" + resultadoConversao + "[" + moedaAlvo + "]";
    }
}
