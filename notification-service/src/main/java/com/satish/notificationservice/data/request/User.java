package com.satish.notificationservice.data.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Satish Yadav
 * @purpose :
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userName;
    private String password;
}
