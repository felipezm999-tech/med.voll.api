package med.voll.api.medico;

import med.voll.api.Endereco.DadosEndereço;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade Especialidade,
                                   DadosEndereço endereco) {
}
