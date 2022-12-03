import java.util.Collection;

public interface IMedico {
    String getId();
    void addPaciente(IPaciente paciente);
    void removerPaciente(String idPaciente);
    Collection<IPaciente> getPacientes();
    String getClasse();
}
