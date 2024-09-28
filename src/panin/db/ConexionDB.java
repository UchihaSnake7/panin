package panin.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	 	private String url;
	    private String usuario;
	    private String contrasena;
	    Connection conexion;
	    
		public ConexionDB(String url, String usuario, String contrasena) {
			
			this.url = url;
			this.usuario = usuario;
			this.contrasena = contrasena;
		}


	    public Connection obtenerConexion() throws SQLException {
	        this.conexion = DriverManager.getConnection(url, usuario, contrasena);
	        System.out.println("Conexión establecida a la base de datos");
	        return this.conexion;
	    }

	    public void cerrarConexion(Connection conexion) throws SQLException {
	        if (this.conexion != null) {
	            this.conexion.close();
	            System.out.println("Conexión cerrada");
	        }
	    }
	    
	    
	    
	    public String getUrl() {
			return url;
		}


		public void setUrl(String url) {
			this.url = url;
		}


		public String getUsuario() {
			return usuario;
		}


		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}


		public String getContrasena() {
			return contrasena;
		}


		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}


		public Connection getConexion() {
			return conexion;
		}


		public void setConexion(Connection conexion) {
			this.conexion = conexion;
		}
	    

}