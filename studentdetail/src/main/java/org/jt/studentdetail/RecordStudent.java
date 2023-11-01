package org.jt.studentdetail;

import java.util.List;

public record RecordStudent(
                String name,
                String registationNumber,
                String email,
                String gender,
                String collage,
                List<String> courses) {

}
