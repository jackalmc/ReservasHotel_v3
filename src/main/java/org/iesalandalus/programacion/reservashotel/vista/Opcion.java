package org.iesalandalus.programacion.reservashotel.vista;

public enum Opcion {

    SALIR("Salir"),
    INSERTAR_HUESPED("Insertar Hu�sped"),BUSCAR_HUESPED("Buscar Hu�sped"),BORRAR_HUESPED("Borrar Hu�sped"), MOSTRAR_HUESPEDES("Mostrar Hu�sped"),
    INSERTAR_HABITACION("Insertar Habitaci�n"),BUSCAR_HABITACION("Buscar Habitaci�n"), BORRAR_HABITACION("Borrar Habitaci�n"), MOSTRAR_HABITACIONES("Mostrar Habitaciones"),
    INSERTAR_RESERVA("Insertar Reserva"),ANULAR_RESERVA("Anular Reserva"),MOSTRAR_RESERVAS("Mostrar Reserva"),
    CONSULTAR_DISPONIBILIDAD("Consultar Disponibilidad"),
    REALIZAR_CHECKIN("Realizar CheckIn"), REALIZAR_CHECKOUT("Realizar CheckOut"),
    DEBUG("[DEBUG] Insertar datos");

    private String mensajeAMostrar;

    Opcion(String mensajeAMostrar){
        this.mensajeAMostrar=mensajeAMostrar;
    }

    @Override
    public String toString() {
        return ordinal()+ " .- " + mensajeAMostrar;
    }
}
