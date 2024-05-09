package com.slincsilver.springjdbcex.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.slincsilver.springjdbcex.model.Student;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentExtractor implements ResultSetExtractor<List<Student>> {

    @Override
    public List<Student> extractData(ResultSet rs) throws SQLException {
        List<Student> students = new ArrayList<>();

        while (rs.next()) {
            Student s = new Student();
            s.setName(rs.getString("name"));
            s.setRollNo(rs.getInt("rollno"));
            s.setMarks(rs.getInt("marks"));
            // Set other properties as needed
            students.add(s);
        }

        return students;
    }
}
