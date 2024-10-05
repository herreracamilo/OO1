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
    private Archivo archivo2;
    private Archivo archivo3;
    
    @BeforeEach
    void setUp() {
        cliente = new ClienteDeCorreo();
        carpetaPersonal = new Carpeta("personal");
        cliente.agregarCarpeta(carpetaPersonal);
        
        archivo1 = new Archivo("documento.pdf");
        archivo2 = new Archivo("documento.pdf");
        archivo3 = new Archivo("documento.pdf");
        
        email1 = new Email("Hola","Este es el cuerpo del email.");
        email1.adjuntos().add(archivo1);
        
        email2 = new Email("Adios","Este es el cuerpo del segundo email.");
        
    }

    @Test
    void testRecibirEmail() {
        cliente.recibir(email1);
        assertEquals(45, cliente.espacioOcupado()); // seria el tamaño del titulo + el cuerpo + el archivo 1
        cliente.recibir(email2);
        assertEquals(86, cliente.espacioOcupado()); // 45 + 5 del titulo y 36 del cuerpo.
    }

    @Test
    void testBuscarEmail() {
    	cliente.recibir(email1); // lo tengo que volver a mandar porque el @BeforeEach del setUp reinicia todo
    	assertEquals(email1, cliente.buscar("Este"));
    }

    @Test
    void testMoverEmail() {
    	assertEquals(0, carpetaPersonal.espacioCarpetas()); // al principio tiene que ser 0 porque no debe haber ningun mail
    	cliente.recibir(email1); // primero recibo un email
    	cliente.moverDesdeInbox(email1, carpetaPersonal);
    	assertEquals(45, carpetaPersonal.espacioCarpetas()); // tiene que ser 45 porque antes no tenia nada
    	assertEquals(45, cliente.espacioOcupado()); // tiene que ser 45 porque inbox esta vacio y solo tiene la carpeta personal
    }
    
    @Test
    void testEspacioOcupado() {
    	cliente.recibir(email1);
        assertEquals(45, cliente.espacioOcupado()); // seria el tamaño del titulo + el cuerpo + el archivo 1
        cliente.recibir(email2);
        assertEquals(86, cliente.espacioOcupado()); // 45 + 5 del titulo y 36 del cuerpo.
        cliente.recibir(email1);
        assertEquals(131, cliente.espacioOcupado());
    }
}
