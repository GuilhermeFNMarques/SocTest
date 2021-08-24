package dt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;


public class Data {

	public String formatadata(String consultaExame) throws ParseException {
		
		LocalDate localDate = LocalDate.now();
		
		String dataf = consultaExame;

		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dsql = new SimpleDateFormat("yyyy-MM-dd");
		
		String formata = dsql.format(d.parse(dataf));
		dataf = formata;
		
		Date date = dsql.parse(dataf);
		Date datl = java.sql.Date.valueOf(localDate);
		
		if(date.after(datl)) {
			return dataf;
		}
		else {
			System.out.println("Data Invalida");
			return consultaExame;
		}
		
	}

}
