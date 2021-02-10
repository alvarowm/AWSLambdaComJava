package br.alvaro;

public class NumerosAmigaveisFacade {

    NumerosAmigaveisHelper helper;

    public NumerosAmigaveisFacade(){
        NumerosAmigaveisHelper helper = new NumerosAmigaveisHelper();
        this.helper = helper;
    }

    public boolean seNumerosSaoAMigaveis (int x, int y){
        return helper.seNumerosSaoAmigaveis(x,y);
    }

}
