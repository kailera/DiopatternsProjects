package DIOPatternProject.subsistema2;

import DIOPatternProject.singleton.SingletonEager;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade (String cep){
        return "Ilha Solteira";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
