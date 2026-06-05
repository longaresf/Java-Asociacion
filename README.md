# Object Collaboration Logic & Relationship Modeling (Java)

Este repositorio contiene un proyecto de backend desarrollado en **Java**, enfocado en la implementación de **Asociaciones entre objetos**. El objetivo principal es demostrar la capacidad de modelar relaciones complejas (como asociación, agregación y composición) para permitir que distintas entidades del sistema colaboren entre sí, replicando el comportamiento de flujos de datos en entornos empresariales reales.

## 🚀 Capacidades Técnicas y Arquitectura

* **Modelado de Relaciones Dinámicas:** Implementación de asociaciones donde un objeto interactúa con otro (o con colecciones de otros) para cumplir reglas de negocio específicas.
* **Desacoplamiento de Responsabilidades:** Aplicación de principios de diseño que permiten que cada clase mantenga su propia lógica interna mientras delega tareas a objetos asociados.
* **Gestión de Referencias:** Uso eficiente de referencias de memoria en Java para conectar instancias, asegurando la integridad de los datos durante la comunicación entre clases.
* **Navegabilidad de Objetos:** Estructuración de métodos que permiten acceder a información de entidades relacionadas sin violar los principios de encapsulamiento.

## 🛠️ Stack Tecnológico

* **Lenguaje:** Java (JDK 8 / 11 / 17+)
* **Paradigma:** Programación Orientada a Objetos (POO)
* **Conceptos Clave:** Asociación, Composición, Agregación y Encapsulamiento.

## ⚙️ Resolución de Desafíos de Ingeniería

Este proyecto aborda retos fundamentales en la construcción de sistemas modulares:

1. **Evitar el "Código Espagueti":** Al utilizar asociaciones, se evita crear clases gigantes (God Objects), distribuyendo la lógica en objetos pequeños y especializados que colaboran mediante mensajes y llamadas a métodos.
2. **Escalabilidad del Modelo de Datos:** La arquitectura permite cambiar o extender una clase asociada sin necesidad de reescribir la lógica de la clase principal, facilitando el mantenimiento a largo plazo.
3. **Representación Fiel del Dominio:** El uso de asociaciones permite que el código Java refleje con precisión las relaciones del mundo real (ej. un Cliente "tiene un" Pedido, un Profesor "pertenece a" un Departamento).

## 🔧 Ejecución y Pruebas

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/longaresf/java-object-collaboration-logic.git](https://github.com/longaresf/java-object-collaboration-logic.git)
   ```
2. Compilación:
   Compila todas las clases relacionadas del paquete:

   Bash
   javac *.java

3. Ejecución:
   Inicia la clase que contiene el punto de entrada (main) donde se instancian y asocian los objetos:

   Bash
   java Main

✒️ Autor

    Francisco Longares - Desarrollador Backend Java - longaresf
   
