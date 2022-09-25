/*Context*/
public class UserService {
    public UserDao dao = null;
    public UserService(UserDao dao) {//传入策略
        this.dao = dao;
    }
    public void createUser(){
        System.out.println("正在创建用户对象");
        dao.insert();//根据不同的策略，做不同的事
    }
}