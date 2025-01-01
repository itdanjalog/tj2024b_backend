package day18.step2;

import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        Connection conn = null;
        try { Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05", "root", "1234"); // DB연동
        }catch (Exception e ){  System.out.println(">> 연동실패 : "+ e);   }

        Scanner scan = new Scanner(System.in); //입력객체

        while (true){
            try {
                System.out.print("1.등록 2.출력 3.수정 4.삭제 : ");
                int ch = scan.nextInt();
                if( ch == 1 ){
                    System.out.print(">>[저장C] 이름 : "); String name = scan.next(); // 1.입력받고
                    // 2. DB 저장  "insert into table1 values('유재석')"; -> "insert into table1 values('변수명')";
                    String sql = "insert into table1 values('"+name+"')";   System.out.println( "sql : "+sql );
                    PreparedStatement ps = conn.prepareStatement( sql );
                    ps.executeUpdate();
                }
                else if( ch == 2 ){
                    System.out.println("===== 이름 명단 ===== ");
                    // 2. DB SQL 레코드 전체 검색/조회  :  "select * from table1"
                    String sql = "select * from table1";
                    PreparedStatement ps  = conn.prepareStatement( sql );
                    ResultSet rs = ps.executeQuery();
                    while ( rs.next() ){ // 첫번째 레코드부터 마지막 레코드 까지 순회
                        System.out.println( rs.getString("name") );
                    }
                }
                else if( ch == 3 ) {
                    System.out.print("[수정U] 기존이름 : ");      String oldName = scan.next();
                    System.out.print("[수정U] 새로운이름 : ");     String newName = scan.next();
                    // 2. DB SQL 레코드 수정 : update table1 set name = '신동엽2' where name = '신동엽';
                    String sql = "update table1 set name = '" + newName + "' where name = '" + oldName + "'; ";
                        System.out.println( "sql : "+sql );
                    PreparedStatement ps = conn.prepareStatement( sql );
                    ps.executeUpdate();
                }
                else if( ch == 4 ){
                    System.out.print(">>[삭제D] 이름 : "); String name = scan.next();
                    // 2. DB SQL 레코드 삭제 : "delete from table1 where name = '유재석';"
                    String sql = "delete from table1 where name = '"+name+"';";
                        System.out.println( "sql : "+sql );
                    PreparedStatement ps = conn.prepareStatement( sql );
                    ps.executeUpdate();
                }
                else{  System.out.println(">> 없는 기능 번호 입니다.");  }
            }catch ( InputMismatchException e ){
                System.out.println(" >> 잘못된 입력입니다. ");  scan = new Scanner( System.in ); // 잘못입력받은 값을 가지고 있는 객체를 초기화
            }catch ( SQLException e ){ System.out.println(" >> SQL 구문이 틀렸습니다." + e );  }
        } // w end
    } // m end
} // class end

