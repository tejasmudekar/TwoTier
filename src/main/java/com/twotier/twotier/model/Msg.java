package com.twotier.twotier.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@Entity

public class Msg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "msg")
    @NotNull
    private String msg;

}
