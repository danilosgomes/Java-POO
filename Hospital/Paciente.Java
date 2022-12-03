import java.util.Collection;
import java.util.TreeMap;

public class Paciente implements IPaciente{
    protected String sender;
    protected String diagnostico;
    protected TreeMap<String, IMedico> medicos = new TreeMap<>();

    public Paciente(String sender, String diagnostico){
        this.sender = sender;
        this.diagnostico = diagnostico;
    }

    @Override
    public String getId() {
        return sender;
    }

    @Override
    public void addMedico(IMedico medico) {
        if(medico.getPacientes().contains(this)){
            medicos.put(medico.getId(), medico);
        }
    }

    @Override
    public void removerMedico(String idMedico) {
        medicos.remove(idMedico);
    }

    @Override
    public Collection<IMedico> getMedicos() {
        return medicos.values();
    }

    @Override
    public String getDiagnostico() {
        return diagnostico;
    }

    @Override
    public String toString() {
        return sender+":"+diagnostico;
    }
}
