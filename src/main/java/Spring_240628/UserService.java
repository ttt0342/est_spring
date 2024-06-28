package Spring_240628;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
//public class UserService {
////    private UserRepository userRepository;
////
////    public UserService() {
////        this.userRepository = new UserRepository();
////    }
////
////    public void createUser(User user) {
////        userRepository.save(user);
////        //강결합 - 메서드가 없으면 에러 발생
////        // 의존도가 높아 메서드간 서로 연결되어 있다.
////        // 내가 가지고 있는 의존성에 의해 userService가 영향을 받는다.
////        // 뭔가 수정하면 전부 다 수정해야 한다.
////    }
//
//    //약결합
//    private UserRepositoryInterface userRepository;
////    private UserRepository2 userRepository2;
//    //private User user;
//
//
//    public UserService(UserRepositoryInterface userRepository) {
//        this.userRepository = userRepository;//인터페이스를 파라미터로 받음
//
////        this.userRepository = new UserRepository(); //new로 객체 생성. - 강결합
////        this.userRepository2 = new UserRepository2(); // new로 객체 생성.
////        this.user = new User(); // new로 객체 생성. - 스프링으로 작성한다면 IoC 컨테이너가 작성해준다.
//
//        //스프링사용
//
//    }
//
//    public void createUser(User user) {
//        userRepository.save(user);
//    }
//    // SOLID - DIP 규칙 , 이 코드는 추상화된 어떤 것에 의존한다.
//    // 인터페이스를 의존하고, 구현첸느 생성자를 통해 주입받아 의존도를 낮춘다.
//
//    public void deleteUser(User user) {
//        userRepository.delete(user);
//    }

@Service
public class UserService {

    private UserRepositoryInterface userRepository;

    @Autowired
    public UserService(UserRepositoryInterface userRepository) {
        this.userRepository = userRepository;
    }
//없는 변수명을 사용할 시 퀄리파이어를 사용하여 각자 의존성을 수동지정을 통해 지정해주어야 한다.

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}

