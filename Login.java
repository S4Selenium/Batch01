import java.util.ArrayList;

public class Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dataDrivenFrameDB data = new dataDrivenFrameDB();
		ArrayList exceldata = data.getData("Login");
		System.out.println(exceldata.get(0));
		System.out.println(exceldata.get(1));
		System.out.println(exceldata.get(5));
	}

}
