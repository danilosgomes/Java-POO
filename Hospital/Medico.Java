import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class Medico implements IMedico{
    protected String sender;
    protected String classe;
    protected TreeMap<String, IPaciente> pacientes = new TreeMap<>();

    public Medico(String sender, String classe){
        this.sender = sender;
        this.classe = classe;
    }


    @Override
    public String getId() {
        return sender;
    }

    @Override
    public void addPaciente(IPaciente paciente) {
        Iterator<IMedico> it = paciente.getMedicos().iterator();
        if(it.hasNext() && it.next().getClasse().equals(classe)){
            System.out.println("fail: ja existe outro medico da especialidade cirurgia");
        }
        else{
            paciente.addMedico(this);
            pacientes.put(paciente.getId(), paciente);
        }
    }

    @Override
    public void removerPaciente(String idPaciente) {
        pacientes.remove(idPaciente);
    }

    @Override
    public Collection<IPaciente> getPacientes() {
        return pacientes.values();
    }

    @Override
    public String getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        return sender+":"+classe;
    }
}
