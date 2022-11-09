package pnu.user.service;

import javax.servlet.http.HttpSession;

import pnu.user.vo.UserVO;

public interface UserService {
	
	public Boolean selectPwd(String userId, String pwd);
	
	public String selectUsed(String userId);
	
	public int insertUser(UserVO user);

	public UserVO selectUserInfo(String userId);
	
	public Boolean setSesstion(HttpSession session, String userId);
	
	public int updateUser(UserVO user);
	
	public int deleteUser(String userId);
}
