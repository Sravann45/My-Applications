package sravan.java;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView say(@RequestParam("t1") int num1) {
		ModelAndView mv = new ModelAndView();
		int k=num1;
		mv.addObject("result", k);
		mv.setViewName("result.jsp");
		return mv;
	}

}
