package ssm.integration.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.integration.entity.User;
import ssm.integration.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public User selectById(@PathVariable("id") long id) {
		return userService.selectById(id);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteById(@RequestParam("id") long id) {
		return "delete " + userService.deleteById(id) + " record(s) success.";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody String addUser(User user) {
		userService.add(user);
		return "SUCCESS";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public @ResponseBody String updateUser(User user) {
		userService.update(user);
		return "SUCCESS";
	}
}