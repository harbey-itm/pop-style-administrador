package co.com.popstyle.administrador.utils;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.web.multipart.MultipartFile;


public class RegistrarHorariosUtils {
	
	
	public String registrarHorariosBarberosUtils(MultipartFile file) {
		
		System.out.println("utilidades OK");
		try {
            Workbook workbook = WorkbookFactory.create(file.getInputStream());
            Sheet sheet = workbook.getSheetAt(0); // Hoja 0 del archivo Excel
            
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                
                // Obtener los valores de cada celda y almacenarlos en variables
                String columna1 = row.getCell(0).getStringCellValue();
                String columna2 = row.getCell(1).getStringCellValue();
                // Agrega aquí las columnas adicionales según tu estructura de datos
                
                // Crear una instancia de tu entidad y establecer los valores
                //TuEntidad entidad = new TuEntidad();
                //entidad.setColumna1(columna1);
                //entidad.setColumna2(columna2);
                // Establece los valores para las columnas adicionales según tu estructura de datos
                
                // Guardar la entidad en la base de datos utilizando JPA
                //yourRepository.save(entidad);
                
                System.out.println("Campo_1: "+columna1);
                System.out.println("Campo_2: "+columna2);
                
            }
            
            workbook.close();
            
            return "redirect:/success"; // Redirige a una página de éxito o muestra un mensaje de éxito
        } catch (IOException e) {
            e.printStackTrace();
            return "redirect:/error"; // Redirige a una página de error o muestra un mensaje de error
        }
		
		
		
	}
	

}
