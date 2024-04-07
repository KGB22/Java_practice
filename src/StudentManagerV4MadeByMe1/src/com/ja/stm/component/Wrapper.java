package com.ja.stm.component;

import com.ja.stm.util.IoUtil;

public class Wrapper {
    private Service service = new Service();
    public void run(){
        IoUtil.print("*********************************");
        IoUtil.print("* 학생 관리 프로그램 v4 *");
        IoUtil.print("* 학생 관리 프로그램 설명 *");
        IoUtil.print("* 만든 사람 저예요 *");
        IoUtil.print("*********************************");

        while (true) {
            IoUtil.print(" < 실행 메뉴 > ");
            IoUtil.print("1. 입력");
            IoUtil.print("2. 출력");
            IoUtil.print("3. 검색");
            IoUtil.print("4. 삭제");
            IoUtil.print("5. 통계");
            IoUtil.print("0. 프로그램 종료");
            String command = IoUtil.input("번호 입력");

            if (command.equals("0")) {
                break;
            }
            if (command.equals("1")) {
                service.addStudentList();
            }else if(command.equals("2")) {
                service.showStudent();
            }else if(command.equals("3")) {
                service.serchStudent();
            }
            IoUtil.pause();
        }
        IoUtil.print("프로그램을 종료하겠습니다. 이용해주셔서 감사합니다.");
    }
}
