import java.util.ArrayList;
public class HubCentral {
    private ArrayList<Controlable> dispositivos;

    public HubCentral() {
        dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Controlable dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void enviarComando(String comando) {

        for (Controlable dispositivo : dispositivos) {
            dispositivo.ejecutarAccion(comando);
        }
    }
}
