package com.example.demo2;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class Main implements CommandLineRunner{

    private final StudentService studentService;

    @Override
    public void run(String[] args) {
        Student newStud = studentService.addNewStud("Плотникова", "Сима");
        System.out.println("Добавлен студент с ID: " + newStud.getStud_id());

        studentService.updateStud(UUID.fromString("8eaaa877-5af8-428e-9f2c-423cb3498792"), "Ветохин", "Данила");
        System.out.println("Обновили студента");

        studentService.delStudById(UUID.fromString("350f8402-ce8c-486f-a06b-74e029c19036"));
        System.out.println("Удалили студента");
    }
}
