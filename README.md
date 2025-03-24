## Practica de Entornos Carlos Hurtado:
Explicacion y justificacion de los pasos realizados durante la practica de entornos de desarrollo

## Creacion del repositorio:

1: clono el repositorio original en mi ordenador usando github desktop, 
una vez clonado, abro el "proyecto" En el explortador de archivos, y elimino la carpeta github

>  Realizo una clonacion en vez de descargar para tener evitar descargar un zip, y simplemente editar los archivos necesarios y ya.

2:añado una carpeta adicional, preparada inicialmente para poder usar el README.MD que contiene la informacion, y poder "Ignorar" el README.MD del repositorio original 

- `es.tiernoparla.productos`:  En esta carpeta se encuentra todo lo relacionado con la actividad, el resto es el readme de la informacion etc.
- `.gitignore`: esta dentro de `es.tiernoparla.productos`

> Las subidas de los cambios las hago en vs code usando "CONTROL DE CODIGO FUENTE",escribiendo el nombre del cambio realizado antes de subirlo.

## Pruebas unitarias realizadas
1: Creo el archivo `junit-platform-console-standalone-1.13.0-M1` seleccionando los metodos de la clase 
inventario, y hago click en la bombillita amarilla, y selecciono `generate test`,me sale un mensaje en la esquina inferior de la pantalla, y pulso en el boton que pone enable o habilitar y en la parte superior del vs, selecciono junit jupiter, y se genera el archivo.

2: vuelvo a seleccionar los metodos que quiero testear, y hago clik en la bombilla amarilla, despues selecciono generate test, y pulso enter, ya que el nombre del tes se genera solo

3:En la clase `InventarioTest.java` realizo las pruebas unicarias coprrespondientes a cada metodo

- .En el metodo TestAñadirProducto, hago uso de `assertEquals` para asegurarme de que el metodo devuelve el valor que requiero,
añadiendo hard code para crear el objeto que quiero que se pueda añadir a la lista del metodo, en este hago la prueba en base al siguenete codigo:
    Inventario inv = new Inventario();
        Producto product = new Producto("123", "galletas", 50, 8);
        inv.añadirProducto(product);
        inv.listarProductos();
        List<Producto> listaProd = inv.listarProductos();
        listaProd.get(0);
        assertEquals("123",listaProd.get(0).getCodigo(),  "el codigo tiene que ser 123");
Se crea el objeto, se usa el motodo AñadirProducto, se extrae la lista del metodo a la del testeo, y se comprueba si el objeto es el indicado .

 
- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies


Enlace de github: [Enlace](https://github.com/CarlosHC12/PracticaEntornosGit).