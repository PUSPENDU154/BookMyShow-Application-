package com.example.BookMyshow.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL) //bidirectional mapping
    private List<TicketEntity> ticketEntities;   // "cascade = CascadeType.ALL" ALL means all types of operations..... " cascade " is alawys added to the Parent Entity...
    // For manipulating bidirectionally   "cascade = CascadeType.ALL"   is used
}
