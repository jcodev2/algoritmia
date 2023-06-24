# Sistema de reserva de un hotel

Implementar un sistema de reserva de habitaciones de un hotel. El sistema debe permitir:

1. **Ingresar datos de N habitaciones de hotel (se realiza una sola vez) IdHabitación (int 2 dígitos), Nombre Habitación (String), Tipo Habitación (char) ‘S’=simple, ‘D’=doble, ‘T’=triple, estado (char) que inicialmente es Libre (L), N° Total Servicios (int) inicialmente igual a cero, Ingreso total por Habitación (double) inicialmente igual a cero. Una habitación simple cuesta 100 soles, una habitación doble cuesta 150 soles y una habitación triple cuesta 250 soles.**

2. **Reportar todos los datos (se realiza solo si hay datos ingresados).**
3. **Agregar datos (se puede hacer siempre que haya espacio en los arreglos)**
4. **Modificar datos por IdHabitación (se realiza solo si hay datos ingresados)**
5. **Eliminar datos Nombre Habitación (se realiza solo si hay datos ingresados). Solo se puede eliminar si su estado es Libre (L). Si se elimina un IdHabitación, se elimina todos sus datos.**
6. **Consultar por nombre de habitación (se realiza solo si hay datos ingresados).**
7. **Consultar por IdHabitación (se realiza solo si hay datos ingresados)**
8. **Ordenar los datos alfabéticamente en forma ascendente por nombre de habitación (se realiza solo si hay datos ingresados)**
9. **Ordenar en forma descendente por IdHabitación (se realiza solo si hay datos ingresados)**
10. **Reserva de habitación (se realiza solo si hay datos ingresados). Cuando se reserva una habitación, primero se debe preguntar qué tipo de habitación se requiere, y fecha; en base a la respuesta se muestran todas las habitaciones disponibles, luego se pide que se selecciones la habitación deseada y se cambia su estado a Ocupada. Luego se debe ingresar Nombre Cliente (string), Ciudad Origen (String), costo habitación (double), fecha e IdHabitación.**
11. **Fin de servicio se hace en base al IdHabitación, significa que un servicio a terminado por lo tanto el estado de la habitación cambia a Libre Luego reportar todos los NT servicios realizados, indicando nombres de clientes. Ciudad de origen con el Id habitación y monto pagado. Además el monto total recaudado.**
12. **Terminar el programa.**
