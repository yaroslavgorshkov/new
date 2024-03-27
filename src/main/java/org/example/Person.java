package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<SIM> simList = new ArrayList<>();
    public void addSim(SIM sim){
        simList.add(sim);
    }

    public Person(String name) {
        this.name = name;
    }
}
