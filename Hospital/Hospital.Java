import java.util.*;

public class Hospital {
    private final TreeMap<String, IPaciente> pacientes = new TreeMap<>();
    private final TreeMap<String, IMedico> medicos = new TreeMap<>();

    public Hospital(){

    }

    public void removerPaciente(String sender){
        pacientes.remove(sender);
    }

    public void removerMedico(String sender){
        pacientes.remove(sender);
    }

    public void addPaciente(IPaciente paciente){
        pacientes.put(paciente.getId(), paciente);
    }

    public void addMedico(IMedico medico){
        medicos.put(medico.getId(), medico);
    }

    public void vincular(String nomeMedico, String nomePaciente){
        medicos.get(nomeMedico).addPaciente(pacientes.get(nomePaciente));
        pacientes.get(nomePaciente).addMedico(medicos.get(nomeMedico));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, IPaciente> entry : pacientes.entrySet()){
            StringBuilder ap = new StringBuilder("Pac: ");
            ap.append(entry.getValue());
            while (ap.length() < 22) ap.append(" ");
            ap.append("Meds: [");
            for (IMedico iMedico : entry.getValue().getMedicos()) {
                ap.append(iMedico.getId()).append(", ");
            }
            if(!entry.getValue().getMedicos().isEmpty()){
                ap.delete(ap.length()-2, ap.length()).append(']').append('\n');
            }
            else {
                ap.append(']').append('\n');
            }
            sb.append(ap);
        }
        for(Map.Entry<String, IMedico> entry : medicos.entrySet()){
            StringBuilder ap = new StringBuilder("Med: ");
            ap.append(entry.getValue());
            while (ap.length() < 22) ap.append(" ");
            ap.append("Pacs: [");
            for (IPaciente iPaciente : entry.getValue().getPacientes()) {
                ap.append(iPaciente.getId()).append(", ");
            }
            if(!entry.getValue().getPacientes().isEmpty()){
                ap.delete(ap.length()-2, ap.length()).append(']').append('\n');
            }
            else {
                ap.append(']').append('\n');
            }
            sb.append(ap);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}