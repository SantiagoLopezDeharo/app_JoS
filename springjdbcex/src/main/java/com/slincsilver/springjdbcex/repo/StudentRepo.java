package com.slincsilver.springjdbcex.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.rowset.ResultSetWrappingSqlRowSet;
import org.springframework.stereotype.Repository;

import com.slincsilver.springjdbcex.model.Student;


@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public void save(Student s)
    {
        String sql = "insert into student2 (rollno, name, marks) values (?,?,?)";

        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
    
        System.out.println(rows + " effected");
    }

    public List<Student> findAll() {
        String sql = "select * from student2";
        return jdbc.query(sql, new StudentExtractor());
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

}
