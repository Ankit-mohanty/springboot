
package org.jt.jpaconcept;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity// tHIS CLASS IS RESPONSIBLE .
public class Student {
    @Id//ID SPECIFY WHICH COLUMN IS PRIMERY.
    private int studentId;
    private String studentName;
    private double studentFee;
}
