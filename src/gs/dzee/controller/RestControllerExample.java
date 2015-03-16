package gs.dzee.controller;

import gs.dzee.model.Member;
import gs.dzee.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/member")
public class RestControllerExample {

	@Autowired
	UserService dataServices;
	
	@RequestMapping(value="/create",
			method=RequestMethod.GET)
	public @ResponseBody Member addMember(){
		try{
			Member member = new Member();
			member.setId(2);
			member.setName("M2");
			member.setGender("F");
			dataServices.addEntity(member);
			return member;
		}
		catch(Exception e){
			return new Member();
		}
	}
}
