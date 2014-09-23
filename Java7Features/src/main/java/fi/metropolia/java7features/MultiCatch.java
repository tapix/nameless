package fi.metropolia.java7features;

import java.io.IOException;
import java.sql.SQLException;

public class MultiCatch {

	private boolean throwSqlException;
       private int palauttaaNollan(){
		return 10;
	}
	private void turhaMetodi(){
	   system.out.println("Olen turha metodi");
	}
        private void turhaFunktio(){
	    system.out.println("Olen uusi turha ominaisuus");
	}

	public MultiCatch(boolean throwSqlException) {
		this.throwSqlException = throwSqlException;
	}

	public void catcher() throws IOException, SQLException {
		try {
			if (throwSqlException)
				throw new SQLException();
			else
				throw new IOException();
		} catch (IOException | SQLException ex) {
			throw ex;
		}
	}

}
