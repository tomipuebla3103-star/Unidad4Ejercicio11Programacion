<img width="489" height="310" alt="image" src="https://github.com/user-attachments/assets/bfe0fa8a-bbc9-425d-a922-5032113856e3" />

Sistema de Gestión de Dispositivos Domésticos Inteligentes

 Descripción

Este proyecto consiste en desarrollar un sistema de automatización de dispositivos domésticos inteligentes en Java, aplicando conceptos de Programación Orientada a Objetos (POO), especialmente el polimorfismo y las interfaces.

El sistema permite controlar diferentes dispositivos de una casa inteligente, como focos, aires acondicionados y persianas motorizadas, utilizando una estructura común.

 Objetivo

Implementar un controlador central capaz de administrar diferentes dispositivos inteligentes y enviarles comandos sin necesidad de conocer los detalles internos de funcionamiento de cada uno.

 Clases utilizadas

Controlable: Interfaz que declara el método ejecutarAccion(String comando).

FocoInteligente: Representa un foco inteligente y define su propia lógica para encenderse, apagarse o modificar su estado.

AireAcondicionado: Representa un aire acondicionado y establece sus propias acciones de funcionamiento y ajuste.

PersianaMotorizada: Representa una persiana motorizada y define su lógica para subir, bajar o modificar su posición.

HubCentral: Clase encargada de administrar una lista de dispositivos y enviar comandos de manera polimórfica.

Main: Contiene el método principal, instancia los diferentes dispositivos y demuestra el funcionamiento del sistema.

 Conceptos aplicados

Programación Orientada a Objetos (POO).

Polimorfismo.

Interfaces.

Implementación de métodos (@Override).

Encapsulamiento.

Colecciones de objetos.

Desacoplamiento entre clases.

Validaciones condicionales.

 Funcionamiento

Se define la interfaz Controlable con el método ejecutarAccion().

Se crean las clases FocoInteligente, AireAcondicionado y PersianaMotorizada, cada una con su propia lógica de funcionamiento.

La clase HubCentral administra una colección de dispositivos de tipo Controlable.

Desde el método main se crean diferentes dispositivos y se agregan al controlador central.

Se recorren los dispositivos y se ejecutan los comandos mediante el polimorfismo.

Cada dispositivo interpreta el comando recibido según sus propias características.

Finalmente, se muestran por consola los cambios de estado de los diferentes artefactos.

 Tecnologías utilizadas

Lenguaje: Java.

Entorno de desarrollo: IntelliJ IDEA.

Paradigma: Programación Orientada a Objetos.

 Resultado esperado

Al ejecutar el programa, el controlador central podrá administrar diferentes dispositivos domésticos inteligentes utilizando una misma interfaz. Cada artefacto responderá a los comandos según su propia lógica, mostrando por consola los cambios de estado correspondientes.
