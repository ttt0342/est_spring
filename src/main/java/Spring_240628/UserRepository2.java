//package com.example.basic;
//
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class UserRepository2 implements UserRepositoryInterface{
//
////    public void save(User user) { //save 저장소(repository) 입장에서 유저데이터 저장
//        //System.out.println("UserRepository.save");
//
//        //약결합
//        @Override
//        public void save (User user) {
//            System.out.println("User2 saved");
//        }
//
//        // 새로운 구현클래스가 인터페이스를 구현해도
//        @Override
//        public void delete(User user) {
//            System.out.println("User2 deleted");
//            System.out.println("삭제 완료");
//        }
//
//}
