package dad.email;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EmailModel {

	private StringProperty servidor = new SimpleStringProperty();
	private IntegerProperty puerto = new SimpleIntegerProperty();
	private BooleanProperty conexionSSL = new SimpleBooleanProperty();
	private StringProperty remitente = new SimpleStringProperty();
	private StringProperty contrasena = new SimpleStringProperty();
	private StringProperty destinatario = new SimpleStringProperty();
	private StringProperty asunto = new SimpleStringProperty();
	private StringProperty mensaje = new SimpleStringProperty();

	public final StringProperty servidorProperty() {
		return this.servidor;
	}

	public final String getServidor() {
		return this.servidorProperty().get();
	}

	public final void setServidor(final String servidor) {
		this.servidorProperty().set(servidor);
	}

	public final BooleanProperty conexionSSLProperty() {
		return this.conexionSSL;
	}

	public final boolean isConexionSSL() {
		return this.conexionSSLProperty().get();
	}

	public final void setConexionSSL(final boolean conexionSSL) {
		this.conexionSSLProperty().set(conexionSSL);
	}

	public final StringProperty remitenteProperty() {
		return this.remitente;
	}

	public final String getRemitente() {
		return this.remitenteProperty().get();
	}

	public final void setRemitente(final String remitente) {
		this.remitenteProperty().set(remitente);
	}

	public final StringProperty contrasenaProperty() {
		return this.contrasena;
	}

	public final String getContrasena() {
		return this.contrasenaProperty().get();
	}

	public final void setContrasena(final String contrasena) {
		this.contrasenaProperty().set(contrasena);
	}

	public final StringProperty destinatarioProperty() {
		return this.destinatario;
	}

	public final String getDestinatario() {
		return this.destinatarioProperty().get();
	}

	public final void setDestinatario(final String destinatario) {
		this.destinatarioProperty().set(destinatario);
	}

	public final StringProperty asuntoProperty() {
		return this.asunto;
	}

	public final String getAsunto() {
		return this.asuntoProperty().get();
	}

	public final void setAsunto(final String asunto) {
		this.asuntoProperty().set(asunto);
	}

	public final StringProperty mensajeProperty() {
		return this.mensaje;
	}

	public final String getMensaje() {
		return this.mensajeProperty().get();
	}

	public final void setMensaje(final String mensaje) {
		this.mensajeProperty().set(mensaje);
	}

	public final IntegerProperty puertoProperty() {
		return this.puerto;
	}

	public final int getPuerto() {
		return this.puertoProperty().get();
	}

	public final void setPuerto(final int puerto) {
		this.puertoProperty().set(puerto);
	}

}
