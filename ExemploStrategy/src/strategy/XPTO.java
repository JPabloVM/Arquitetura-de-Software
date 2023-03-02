package strategy;

import cliente.Distancia;

public class XPTO implements Frete{
    @Override
    public double calcFrete(Distancia distancia) {
        return distancia.getPercurso() * 0.3;
    }
}
