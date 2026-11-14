//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    FocoInteligente foco = new FocoInteligente();
    AireAcondicionado aire = new AireAcondicionado();
    PersianaMotorizada persiana = new PersianaMotorizada();

    HubCentral hub = new HubCentral();

    hub.agregarDispositivo(foco);
    hub.agregarDispositivo(aire);
    hub.agregarDispositivo(persiana);

    System.out.println("ENCENDIENDO DISPOSITIVOS");

    hub.enviarComando("encender");

    System.out.println("----------------------");

    hub.enviarComando("temperatura");

    System.out.println("----------------------");

    hub.enviarComando("abrir");

    System.out.println("----------------------");

    hub.enviarComando("apagar");

    System.out.println("----------------------");

    hub.enviarComando("cerrar");
}
