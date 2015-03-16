package gs.dzee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gs.dzee.dao.DataDaoImpl;
import gs.dzee.model.Member;

@Component
public class UserService {

	@Autowired
	DataDaoImpl dataDao;
	
	public boolean addEntity(Member member) throws Exception{
		return dataDao.addEntity(member);
	}
}
