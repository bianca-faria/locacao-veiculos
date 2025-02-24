package dto;
;
import lombok.Getter;
import lombok.Setter;
import model.VeiculoEntity;


@Getter
@Setter
public class CaminhaoDTO extends VeiculoEntity {

    private int capacidadeCarga;
    private int eixos;
    private Double taxaAdicional;


}
