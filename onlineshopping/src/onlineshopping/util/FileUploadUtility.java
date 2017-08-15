package onlineshopping.util;

import java.io.File;
import java.io.IOException;

//import javax.imageio.IIOException;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtility {
private static final String ABS_PATH="/home/siddharth/git2sidRepository/online-shopping/onlineshopping/WebContent/resources/images/";
private static String REAL_PATH="";
private static final Logger logger=LoggerFactory.getLogger(FileUploadUtility.class);
public static void uploadFile(HttpServletRequest request, MultipartFile file, String code) {
	// TODO Auto-generated method stub
	//get the real path
	
	System.out.println("inside the File upload utility class");
	REAL_PATH=request.getSession().getServletContext().getRealPath("/static/images/");
	System.out.println("the real path is "+REAL_PATH);
	logger.info(REAL_PATH);
	//to make sure that directories exist if not then create for me
	
	if(!new File(ABS_PATH).exists())
	{
		new File(ABS_PATH).mkdirs();
	}
	if(!new File(REAL_PATH).exists())
	{
		new File(REAL_PATH).mkdirs();
	}
	
	
	try
	{
		//server upload
		System.out.println("inside the try method");
	file.transferTo(new File(REAL_PATH + code+".jpg"));
	//for  project directory upload 
	System.out.println("inside the try method");
	file.transferTo(new File(ABS_PATH + code+".jpg"));
	}
	catch(IOException ex)
	{
		
	}
}

}
