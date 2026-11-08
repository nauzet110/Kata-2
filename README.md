# Kata 2 - Entrada, salida y carga de datos

## 1. Objetivo de la entrega
El propósito de esta segunda kata es comprender y mecanizar la entrada y salida de datos (I/O) en Java utilizando `InputStream` y `OutputStream`. El objetivo técnico principal es aprender a desacoplar la lógica del dominio respecto al origen concreto de los datos, demostrando que el programa puede leer información (como una URL) y redirigir la salida hacia distintos destinos (como la consola o un archivo físico) sin necesidad de alterar la lógica de transformación.

## 2. Entorno y dependencias
* **Lenguaje:** Java 21
* **Gestor de dependencias:** Maven
* **IDE:** IntelliJ IDEA

## 3. Estructura de la entrega
El proyecto aplica una separación clara de responsabilidades, dividiendo el código en paquetes dentro de software.ulpgc.katas:
* **Paquete `model`:** Contiene la entidad de dominio Employee (un record inmutable) y el enumerado Gender. La lógica de conversión de texto a género se encapsula aquí de forma segura para evitar devolver null o romper la ejecución ante datos corruptos o vacíos.
* **Paquete `io`:** Contiene la interfaz EmployeeReader y su implementación UrlEmployeeReader. Esta clase se encarga exclusivamente de abrir el flujo de datos (InputStream) y transformar las líneas de texto TSV en objetos del modelo.
* **Clase `Main`:** Es el punto de entrada. Su función es conectar los flujos de datos: abre la conexión con la URL remota, carga los objetos en memoria usando el lector, guarda el archivo TSV descargado y escribe un resumen estadístico por consola.

## 4. Flujo Git y dinámica de repetición
Para reducir la fricción con los atajos del entorno de desarrollo , el ejercicio se ha repetido varias veces desde cero.
El flujo de control de versiones seguido ha sido:
1. Inicialización del repositorio base en la rama `master`.
2. Desarrollo de todas las iteraciones en la rama de trabajo `develop`. 
3. Se programó y limpió el proyecto en varias pasadas, dejando un rastro claro de commits descriptivos en cada iteración (ej. `String encodings`, `Reading file with FileInputStream`, etc.)[cite: 10, 12, 18].
4. Integración final de la rama `develop` en `master` y subida de ambas ramas a GitHub.

## 5. Compilación y ejecución
El proyecto está diseñado para ejecutarse sin requerir configuración previa ni descarga manual de ficheros.
Desde IntelliJ IDEA, basta con abrir la clase `Main` y pulsar `Shift + F10`. Al hacerlo:
1. Se leerá el dataset desde la URL original.
2. Se generará de forma automática el archivo `Employe.tsv` en la raíz del proyecto usando `OutputStream`.
3. Se imprimirá la lista de empleados y se creará el archivo `document.txt` con el resumen final.
