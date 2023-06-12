package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    
    @NotBlank (message = "Location is required")
    @Size(max = 100)
    private String location;


    public Employer(){};
    public String getLocation() {
        return location;
    };

    public void setLocation(String location) {
        this.location = location;
    };
@OneToMany
@JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();
}
