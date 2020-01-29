import java.text.SimpleDateFormat;
import java.util.*;

public class datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d =new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("DD/MM/YYYY");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		

	}

}
