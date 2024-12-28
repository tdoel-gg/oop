package com.example.demo2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    @Transactional
    public Student updateStud(UUID stud_id, String stud_surname, String stud_name){
        Optional<Student> studOpt = studentRepository.findById(stud_id);

        Student stud = studOpt.orElse(null);

        stud.setStud_surname(stud_surname);
        stud.setStud_name(stud_name);

        return studentRepository.save(stud);
    }

    @Transactional
    public Student addNewStud(String stud_surname, String stud_name){
        Student stud = new Student();
        stud.setStud_id(UUID.randomUUID());
        stud.setStud_surname(stud_surname);
        stud.setStud_name(stud_name);

        return studentRepository.save(stud);
    }

    @Transactional
    public void delStudById(UUID stud_id){
        studentRepository.deleteById(stud_id);
    }
}