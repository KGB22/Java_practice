package com.ja.stm.component;

import java.util.ArrayList;
import java.util.List;

import com.ja.stm.dto.StudentDto;

public class Repository {
    private List<StudentDto> studentList = new ArrayList<>();

    public void add(StudentDto studentDto) {
        studentList.add(studentDto);
    }
    public List<StudentDto> findAll(){
        return studentList;
    }
    public List<StudentDto> findByName(String searchWord){
        List<StudentDto> result = new ArrayList<>();

        for(StudentDto studentDto : studentList) {
            if(studentDto.getName().contains(searchWord)){
                result.add(studentDto);
            }
        }
        return result;
    }

}
