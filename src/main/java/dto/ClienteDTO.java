package dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {

    private Long clienteId;
    private String nome;
    private String cpfCnpj;
    private String tipoPessoa;
    private String endereco;
}
