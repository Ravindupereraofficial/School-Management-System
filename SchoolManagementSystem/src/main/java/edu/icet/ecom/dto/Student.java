package edu.icet.ecom.dto;

import edu.icet.ecom.util.GenderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private Integer id;
    private String name;
    private String address;
    private  Integer age;
    private GenderType gender;

}
