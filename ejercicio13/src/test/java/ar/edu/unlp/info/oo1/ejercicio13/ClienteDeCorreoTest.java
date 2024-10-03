package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
    
    private ClienteDeCorreo cliente;
    private Carpeta carpetaPersonal;
    private Email email1;
    private Email email2;
    private Archivo archivo1;
    
    @BeforeEach
    void setUp() {
        cliente = new ClienteDeCorreo();
        carpetaPersonal = new Carpeta("personal");
        cliente.agregarCarpeta(carpetaPersonal);
        
        archivo1 = new Archivo("documento.pdf");
        
        email1 = new Email("Hola","Este es el cuerpo del email.");
        email1.adjuntos().add(archivo1);
        
        email2 = new Email("Adios","Este es el cuerpo del segundo email.");
        
        cliente.recibir(email1);
        carpetaPersonal.agregarEmail(email2);
    }

    @Test
    void testRecibirEmail() {
       
    }

    @Test
    void testBuscarEmail() {
      
    }

    @Test
    void testMoverEmail() {
        
    }
    
    @Test
    void testEspacioOcupado() {

    }
}
