package com.ja.stm.component;

import java.util.List;

import com.ja.stm.dto.StudentDto;
import com.ja.stm.util.IoUtil;

public class Service {

    private Repository repository = new Repository();

    public void addStudentList() {
        String name = IoUtil.input("이름: ");
        int age = Integer.parseInt(IoUtil.input("나이: "));
        int score = Integer.parseInt(IoUtil.input("점수: "));
        
        StudentDto studentDto = new StudentDto(name, age, score);
        repository.add(studentDto);

        IoUtil.print("학생 등록이 완료됐습니다.");
    }
    public void showStudent() {
        List<StudentDto> list = repository.findAll();

        for(StudentDto studentDto : list) {
            IoUtil.print("이름: " + studentDto.getName() + ", 나이: " + studentDto.getAge() + ", 점수:" + studentDto.getScore());
            
        }
        IoUtil.print("총 인원: " + list.size());
    }
    public void serchStudent(){
        String searchWord = IoUtil.input("검색할 학생의 이름");
        List<StudentDto> list = repository.findByName(searchWord);
        
        for(StudentDto studentDto : list) {
            IoUtil.print("이름: " + studentDto.getName() + ", 나이: " + studentDto.getAge() + ", 점수:" + studentDto.getScore());
        }
        IoUtil.print("총 검색된 인원: " + list.size());
    }

}
