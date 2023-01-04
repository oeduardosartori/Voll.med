package med.voll.api.medico;

public record DadosMedico(String nome, String email, String crm, Especialidade especialidade) {

    public DadosMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
