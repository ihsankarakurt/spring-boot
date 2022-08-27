package com.example.mapping.entity;

import com.example.mapping.dto.RecordLite;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "record")

@NamedNativeQuery(name = "Record.findByRecordId",
        resultSetMapping = "recordToRecordLite",
        query = "select first_name,last_name from record where id = ?1")

@SqlResultSetMapping(name = "recordToRecordLite",
        classes = @ConstructorResult(targetClass = RecordLite.class,
                columns = {
                        @ColumnResult(name = "first_name", type = String.class),
                        @ColumnResult(name = "last_name", type = String.class)
                }
        ))

public class Record {

    @Id
    @GeneratedValue(generator = "generator")
    @SequenceGenerator(name = "generator", allocationSize = 1)
    private Long ID;

    @Column
    private String firstName;

    @Column
    private String lastName;
}
