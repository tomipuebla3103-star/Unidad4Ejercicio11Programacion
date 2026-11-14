public class FocoInteligente implements Controlable{
    private boolean encendido;

    public FocoInteligente() {
        this.encendido = false;
    }

    @Override
    public void ejecutarAccion(String comando) {

        if (comando.equals("encender")) {
            encendido = true;
            System.out.println("El foco se encendio.");

        } else if (comando.equals("apagar")) {
            encendido = false;
            System.out.println("El foco se apago.");
        }
    }
}
