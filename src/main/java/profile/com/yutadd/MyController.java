package profile.com.yutadd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping({"/","/top"})
	public String top() {
		return "top";
	}
	@RequestMapping({"/otoi"})
	public String otoi() {
		return "otoi";
	}
	@RequestMapping({"/live"})
	public String live() {
		return "live";
	}
	@RequestMapping({"/travel"})
	public String travel() {
		return "travel";
	}
}
