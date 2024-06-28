package Spring_240628;

import org.springframework.stereotype.Repository;

//@Repository
//public class UserRepository implements UserRepositoryInterface{
//
////    public void save(User user) { //save 저장소(repository) 입장에서 유저데이터 저장
//        //System.out.println("UserRepository.save");
//
//        //약결합
//        @Override
//        public void save (User user) {
//            System.out.println("User saved");
//        }
//
//    @Override
//    public void delete(User user) {
//        System.out.println("User deleted");
//        System.out.println("삭제 완료");
//    }
//}

@Repository
public class UserRepository implements UserRepositoryInterface {

    @Override
    public void save(User user) {
        System.out.println("User saved");
    }

    @Override
    public void delete(User user) {
        System.out.println("User deleted");
    }
}
