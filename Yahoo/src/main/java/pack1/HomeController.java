package pack1;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/CallMe")
public class HomeController {
	@Path("/show")
	@POST
	public void showMessage(){
		System.out.println("Hello Monu!!! WElcome!!! sdasdas");
	}

}
