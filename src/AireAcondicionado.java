public class AireAcondicionado implements Controlable{
    private boolean encendido;
    private int temperatura;

    public AireAcondicionado() {
        this.encendido = false;
        this.temperatura = 24;
    }

    @Override
    public void ejecutarAccion(String comando) {

        if (comando.equals("encender")) {
            encendido = true;
            System.out.println("El aire acondicionado se encendio.");

        } else if (comando.equals("apagar")) {
            encendido = false;
            System.out.println("El aire acondicionado se apago.");

        } else if (comando.equals("temperatura")) {
            temperatura = 20;
            System.out.println("La temperatura se ajusto a " + temperatura + " grados.");
        }
    }
}
