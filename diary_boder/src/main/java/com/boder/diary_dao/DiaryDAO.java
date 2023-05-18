package com.boder.diary_dao;

import java.sql.*;

public class DiaryDAO {

    // this. : .이 붙은건 빌드를 불러 올때 쓰는것이고
    // this() : 메소드를 불러 올때 쓰는 것이다. this() 에 매개 변수의 숫자에 따라 다르게 불러 올수 있다.
    // 그리고 this() 가 먼저 먼 생성이 되므로 필드을 쓰더라도 생성자 안에 this() 안에는 포함이 되지 않는다.

    // db 연결시 사용하는 클래스 종류
    // Class.forName() : JDBC 드라이버 로딩
    // Connection con : 데이터에비이스 연결
    // PreparedStatement : SQL문 작성
    // ResultSet : SQL문 실행 및 결과 처리
    // colose()  : db 연결 해제

    protected Connection conn = null; // 데이터베이스 연결
    protected PreparedStatement prstm = null; // sql문 작성
    protected ResultSet rs = null; // sql문 실행 및 결과 처리

    // DB URL, ID, PW 필드 생성
    private String dbUrl = null;
    private String dbId = null;
    private String dbPw = null;

    // 생성자 생성
    public DiaryDAO() {
        dbUrl = "123";
        dbId = "123";
        dbPw = "123";
    }

    // 메소드
    public void dbOpen() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버 로딩
            conn = DriverManager.getConnection(dbUrl, dbId, dbPw); // 데이터에비이스 연결
            System.out.println("DB 연결에 성공했습니다.");
        }
        catch (Exception e) {
            System.out.println("DB 연결 실패");
            System.out.println("ErrorMessage :: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void dbClose(){
        try{
            // DB 종료 순서 반대로 한다.
            // ResultSet -> PreparedStatement -> Connection
            if(rs != null){rs.close();} // SQL문 실행 및 결과 처리
            if(prstm != null){prstm.close();} //  SQL문 작성
            if(conn != null){conn.close();}  // 데이터베이스 연결
        }
        catch (Exception e){
            System.out.println("DB 종료가 안되었습니다.");
            System.out.println("ErrorMessage :: "+e.getMessage());
            e.printStackTrace();
        }
    }


}
