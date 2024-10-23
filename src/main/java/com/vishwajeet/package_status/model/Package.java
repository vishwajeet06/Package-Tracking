package com.vishwajeet.package_status.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Customer name is mandatory")
    private String customerName;

    @Size(min = 10, max = 10, message = "Tracking number is wrong.")
    @Pattern(regexp = "\\d{10}", message = "Tracking number must be numeric and 10 digit tracking number")
    private String trackingNumber;


    private String packageStatus;
}
