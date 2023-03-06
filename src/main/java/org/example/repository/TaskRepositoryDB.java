package org.example.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;


public class TaskRepositoryDB {
    private final SessionFactory sessionFactory;

    public TaskRepositoryDB() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.p6spy.engine.spy.P6SpyDriver");
        properties.put(Environment.URL, "jdbc:p6spy:mysql://localhost:3306/todo");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.SHOW_SQL, "true");

        sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(org.example.domain.Task.class)
                .buildSessionFactory();
    }
}
