package com.superngb.monitoring_system.UseCases.AdminPanel.InputData.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalityPostRequestModel {

    private String firstName;
    private String secondName;
    private String middleName;
    private String email;
}
