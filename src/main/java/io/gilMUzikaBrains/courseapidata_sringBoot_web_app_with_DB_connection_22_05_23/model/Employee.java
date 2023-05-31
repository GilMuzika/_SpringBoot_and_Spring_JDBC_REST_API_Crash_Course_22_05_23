package io.gilMUzikaBrains.courseapidata_sringBoot_web_app_with_DB_connection_22_05_23.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data // @Data: https://projectlombok.org/features/Data
public class Employee {
    //The names of fields must be as the column names in the table that represents Employee entity
    private int id;
    private String name;
    private String email;
    private String department;

}
