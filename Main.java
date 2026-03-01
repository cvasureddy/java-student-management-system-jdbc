
package com.studentmanagement;
import com.studentmanagement.config.DatabaseInitializer;

public class Main {
    public static void main(String[] args) throws Exception {
        DatabaseInitializer.initialize();
        System.out.println("Student Management System Started");
    }
}
