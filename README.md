# Programación 2
## Práctico 6 Colecciones de Objetos

### Ejercicio 16 – Sistema de Gestión para distribuidora de productos congelados "FrioExpress"

#### Contexto del negocio:
FrioExpress es una distribuidora mayorista de productos congelados que abastece a supermercados, restaurantes y tiendas minoristas. La empresa maneja un inventario de productos congelados (carnes, pescados, vegetales, helados) que deben mantenerse en cadena de frío estricta a -18°C. Los clientes realizan pedidos que deben ser preparados y despachados en camiones refrigerados.

#### Descripción del problema:
La distribuidora necesita un sistema para gestionar su inventario de productos congelados y el procesamiento de pedidos de sus clientes. Cada producto tiene un código único, nombre, categoría (carnes/pescados/vegetales/helados), temperatura de almacenamiento requerida, stock actual en kilogramos, stock mínimo de seguridad y precio por kilogramo. Cada cliente tiene un RUT, razón social, dirección de entrega, límite de crédito en pesos y deuda actual.

#### Requisitos funcionales específicos:

1. **Control de inventario refrigerado:** Mantener un registro de todos los productos congelados con su stock actual, verificando que nunca se baje del stock mínimo de seguridad.

2. **Gestión de pedidos:** Procesar pedidos de clientes verificando disponibilidad de productos y límite de crédito.

3. **Control de temperatura:** Registrar alertas cuando un producto ha estado fuera de su temperatura óptima.

4. **Operaciones requeridas:**
   - Registrar ingreso de mercadería al almacén frigorífico
   - Procesar pedido de un cliente
   - Registrar productos con quiebre de cadena de frío
   - Consultar productos bajo stock mínimo
   - Listar pedidos pendientes de despacho

#### Restricciones y excepciones a manejar:
El sistema debe definir y manejar las siguientes excepciones personalizadas:

- **StockInsuficienteException:** cuando se intenta vender más cantidad de la disponible en el almacén
- **CadenaFrioRotaException:** cuando un producto ha estado más de 30 minutos fuera de temperatura
- **LímiteCreditoExcedidoException:** cuando un cliente intenta hacer un pedido que supera su límite de crédito disponible
- **ProductoNoCongeladoException:** cuando se busca un producto con código inexistente
- **StockMínimoAlcanzadoException:** cuando un producto alcanza su stock mínimo de seguridad

#### Especificaciones técnicas requeridas:

- Usar un **TreeMap** para mantener los productos ordenados por código
- Usar un **ArrayList** o **LinkedList** para la cola de pedidos pendientes de despacho
- Opcionalmente usar un **HashMap** adicional para búsquedas rápidas por categoría
- Todas las excepciones deben extender de **Exception** con mensajes descriptivos
- Implementar métodos que usen **try-catch** y también métodos que lancen excepciones con **throws**
- Los productos deben poder iterarse para generar reportes

#### Casos de prueba obligatorios:
El sistema debe demostrar:

- Procesamiento exitoso de un pedido dentro del límite de crédito
- Intento de pedido que excede el stock disponible
- Cliente que intenta exceder su límite de crédito
- Alerta por producto que rompe cadena de frío
- Generación de reporte de productos bajo stock mínimo
- Intento de despachar producto con código inexistente

#### Datos iniciales:
- Al menos 8 productos congelados de diferentes categorías
- Mínimo 4 clientes con diferentes límites de crédito
- Algunos productos deben estar cerca del stock mínimo
