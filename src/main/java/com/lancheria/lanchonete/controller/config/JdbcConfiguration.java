// package com.lancheria.lanchonete.controller.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.jdbc.core.JdbcOperations;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
// import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

// import javax.sql.DataSource;

// @Configuration
// public class JdbcConfiguration {

//     @Bean
//     public NamedParameterJdbcOperations namedParameterJdbcOperations(DataSource dataSource) {
//         return new NamedParameterJdbcTemplate(dataSource);
//     }

//     @Bean
//     public JdbcOperations jdbcOperations(DataSource dataSource) {
//         return new JdbcTemplate(dataSource);
//     }
// }
