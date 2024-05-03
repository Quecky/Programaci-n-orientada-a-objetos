# Consigna


Simulacro de Examen Final Objetivo
Realizar el diagrama UML y programar en Java, implementando los patrones que se requieran, el siguiente enunciado:

## Enunciado

**Desafío**

Un Examen.supermercado.Supermercado, que tiene un nombre específico, necesita desarrollar un sistema para el área comercial que le permita armar ofertas es decir armar paquetes con los productos que se venden en la góndola para constituir paquetes de productos. 
Estos productos están disponibles a su vez para poder venderse y ofrecerse en forma independiente sin necesidad de estar dentro de una oferta. 
Es decir, que tanto un producto como un paquete son ofertas que el área comercial podrá ofrecer.
Toda oferta es decir productos y paquetes tienen un nombre, una descripción y deberán tener una funcionalidad que le permita al área comercial calcular el precio para cada una de estas ofertas con la siguiente lógica:
El precio de un producto se calcula de acuerdo al precio base y un valor de impuesto del 10%.
El precio de un paquete se calcula de acuerdo al precio base y un valor de descuento del 10%. Luego se le suma el total de precios acumulados de todos los productos que lo integran.
El Examen.supermercado.Supermercado deberá poder generar un informe que permita mostrar todos los productos y paquetes que ofrece indicando el nombre y precio de cada uno. Es importante que ordenes las ofertas por precio de menor a mayor. Y cuando se trate de un paquete es necesario mostrar cada uno de los productos que la componen.
El Examen.supermercado.Supermercado también deberá poder agregar ofertas. Recibirá un texto como parámetro para indicar qué tipo de oferta es. Será “producto” para agregar cursos o “paquete” en caso de la necesidad de agregar un paquete de productos. También deberá recibir todos los demás parámetros necesarios para la creación de una ofertas.
Reproducir la siguiente situación en el método main e invocar al método que genera el informe.

```java


public class Examen.Main{
public static void main(String[]args){
        Supermercado supermercado=new Supermercado("Market House");
        Producto harina=new Producto("Harina","Harina leudante",30,0.1);
        Producto agua=new Producto("Agua","Agua sin gas",15,0.1);
        supermercado.agregarOferta(FabricaDeOfertas.CODIGO_PAQUETE,"Masa de Pizza","Ingredientes de pizza",50,List.of(agua,harina));
        supermercado.agregarOferta(FabricaDeOfertas.CODIGO_PRODUCTO,"Agua","Agua con gas",20,List.of());
        supermercado.agregarOferta(FabricaDeOfertas.CODIGO_PRODUCTO,"Harina","Harina común",15,List.of());
        supermercado.agregarOferta("","Chocolate","Chocolate con maní",20,List.of());
        supermercado.informe();
        }
        }

```

## Resultado esperado del reporte

![result.jpeg](result.jpeg)

¡Muchos éxitos!