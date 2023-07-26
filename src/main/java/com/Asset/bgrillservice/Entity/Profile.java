package com.Asset.bgrillservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Profile")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Profile {

    @Id
    private int profile_id;
    private String username;
    private String first_name;
    private String last_name;
    private LocalDate birth_date;
    private String phone_number;
    private String email;

}
