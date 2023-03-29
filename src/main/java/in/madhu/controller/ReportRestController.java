package in.madhu.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.madhu.ser.ReportService;

@Controller
public class ReportRestController {
	
	@Autowired
	private ReportService service ;
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception {
		
		response.setContentType("application/octet-stream");
		
		String headerKey = "Content-Disposition";
		String headerValue = "attachment;filename=courses.xls";
		
		response.setHeader(headerKey, headerValue);
		
		service.generateExcel(response);
		response.flushBuffer();
		
		
		
	}
	
	

}
