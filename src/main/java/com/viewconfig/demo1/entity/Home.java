package com.viewconfig.demo1.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
public class Home {

    private String id;
    @NotEmpty(message = "cút")
    private String homeName;
}
