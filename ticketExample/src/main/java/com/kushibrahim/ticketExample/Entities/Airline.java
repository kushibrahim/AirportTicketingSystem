package com.kushibrahim.ticketExample.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "airline")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airlineID")
    private int airlineID;

    @Column(name = "airlineName")
    @NotNull(message = "Airline Name is a required field.")
    @Size(message = "Maximum 100 character", max = 100)
    @NotEmpty
    private String airlineName;

    @Column(name = "airlineFlightType")
    @NotNull(message = "Airline Flight Name is a required field.")
    @Size(message = "Maximum 15 character", max = 15)
    @NotEmpty
    private String airlineFlightType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "airportID")
    private Airport airportID;
}
