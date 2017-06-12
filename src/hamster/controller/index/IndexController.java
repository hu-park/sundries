package hamster.controller.index;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	@RequestMapping(value="/index.do", method = { RequestMethod.POST, RequestMethod.GET })
	public String commonIndex(HttpServletRequest request, Model model){
		String url = String.valueOf(request.getRequestURL());
		System.out.println(":::["+url+"]");
		
		return "hamster/index";
	}
}
