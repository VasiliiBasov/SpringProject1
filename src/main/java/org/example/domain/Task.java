package org.example.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Task {
    @Id
    Long id;

    String description;
    Status status;
}
