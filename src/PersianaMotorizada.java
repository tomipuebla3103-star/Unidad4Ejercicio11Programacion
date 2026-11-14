public class PersianaMotorizada implements Controlable{

    private boolean abierta;

    public PersianaMotorizada() {
        this.abierta = false;
    }

    @Override
    public void ejecutarAccion(String comando) {

        if (comando.equals("abrir")) {
            abierta = true;
            System.out.println("La persiana se abrio.");

        } else if (comando.equals("cerrar")) {
            abierta = false;
            System.out.println("La persiana se cerro.");
        }
    }
}
