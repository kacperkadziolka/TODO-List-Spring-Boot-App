package com.kkadziolka.TODOList.TODO;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Table
@Entity
public class TODO {

    @Id
    @SequenceGenerator(name = "TODO_sequence", sequenceName = "TODO_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TODO_sequence")
    private Long id;

    @NonNull
    private String title;

    @NonNull
    private String description;

    @Transient
    private LocalDate createDate;

    @NonNull
    private LocalDate deadlineDate;

    public LocalDate getCreateDate() {
        return LocalDate.now();
    }
}
