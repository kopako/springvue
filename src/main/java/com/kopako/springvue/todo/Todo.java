package com.kopako.springvue.todo;



import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Todo {

    @Id @GeneratedValue
    private Long id;

    @NonNull
    private String title;

    private Boolean completed = false;

}
