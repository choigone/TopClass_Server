package com.topclass.workbox.utils;

public class ResponseMessage {
    //User
    public static final String READ_USER = "회원 정보 조회 성공";
    public static final String NOT_FOUND_USER = "회원을 찾을 수 없습니다.";
    public static final String CREATED_USER = "회원 가입 성공";
    public static final String UPDATE_USER = "회원 정보 수정 성공";
    public static final String DELETE_USER = "회원 탈퇴 성공";
  
    //Notice
    public static final String READ_NOTICE = "공지사항 조회 성공";
    public static final String NOT_FOUND_NOTICE = "공지사항 조회 실패";
    public static final String READ_UNCHECKED_NOTICE_COUNT = "미조회 공지사항 개수 조회 성공";
  
    //Homework
    public static final String READ_HOMEWORK = "과제 정보 조회 성공";

    //Course
    public static final String READ_COURSE = "수강과목 정보 조회 성공";

    public static final String INTERNAL_SERVER_ERROR = "서버 내부 에러";

    public static final String DB_ERROR = "데이터베이스 에러";
}
