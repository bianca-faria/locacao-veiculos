package dto;

import lombok.Getter;
import lombok.Setter;
import model.VeiculoEntity;

@Getter
@Setter
public class CarroDTO extends VeiculoEntity {

    private int capacidadePassageiro;
    private Boolean arCondicionado;
    private Double taxaAdicional;
}
