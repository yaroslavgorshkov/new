package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.lang.annotation.Target;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "person")
@Builder
@Table(name = "SIMs")
public class SIM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    @ManyToOne(cascade = CascadeType.ALL) // @ManyToOne(cascade = CascadeType.ALL) ?? if person is deleted too ??
    @JoinColumn(name = "person_id") // only for naming the foreign key (person_id -> id in table persons)
    private Person person;
}
