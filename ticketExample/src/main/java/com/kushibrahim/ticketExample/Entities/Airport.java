package com.kushibrahim.ticketExample.Entities;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "airport")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airportID")
    private int airportID;

    @Column(name = "airportName")
    @NotNull(message = "Airport Name is a required field.")
    @Size(message = "Maximum 100 character", max = 100)
    @NotEmpty
    private String airportName;

    @Column(name = "airportCode")
    @NotNull(message = "Airport Code is a required field.")
    @Size(message = "Maximum 10 character", max = 10)
    @NotEmpty
    private String airportCode;

    @Column(name = "airportDistrict")
    @NotNull(message = "Airport District is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    private String airportDistrict;
}
