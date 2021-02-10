package br.alvaro;

import java.util.ArrayList;
import java.util.List;

class NumerosAmigaveisHelper {

    private List<Integer> recuperarDivisores (int numeroCandidatoAAmigavel){
        List<Integer> divisores = new ArrayList<>();

        for (int i = 1; i < numeroCandidatoAAmigavel; i++ ){
            if (numeroCandidatoAAmigavel % i == 0)
                divisores.add(i);
        }

        return divisores;
    }

    private Integer somarDivisores (List<Integer> divisores) {
        int soma = 0;
        for (Integer divisor : divisores){
            soma += divisor;
        }
        return soma;
    }

    private  Integer recuperarNumeroAmigavel (int numeroCandidatoAAmigavel){
        List<Integer> divisores = recuperarDivisores(numeroCandidatoAAmigavel);
        Integer somaDivisores = somarDivisores(divisores);
        return somaDivisores;
    }

    boolean seNumerosSaoAmigaveis (int a, int b){
        int somaA = recuperarNumeroAmigavel(a);
        int somaB = recuperarNumeroAmigavel(b);

        return somaA == b && somaB == a;
    }
}
