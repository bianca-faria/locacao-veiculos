package dto;

import lombok.Getter;
import lombok.Setter;
import model.VeiculoEntity;

@Getter
@Setter
public class MotoDTO extends VeiculoEntity {

    private int cilindradas;
    private boolean temBau;
    private Double taxaAdicional;
}
