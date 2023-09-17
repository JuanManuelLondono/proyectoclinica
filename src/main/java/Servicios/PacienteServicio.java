package co.edu.uniquindio.clinica.servicios;

public interface PacienteServicio {

    void registrarse();
    void editarPefil();
    void eliminarCuenta();
    void enviarLinkRecuperacion();
    void cambiarPassword();
    void agendarCita();
    void crearPQRS();
    void listarPQRSPaciente();
    void responderPQRS();
    void listarCitasPacientes();
    void filtrarCitasPorFecha();
    void filtrarCitasPorMedico();
    void verDetalleCita();


}
