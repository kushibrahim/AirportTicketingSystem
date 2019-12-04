package com.kushibrahim.ticketExample.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "flight")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flightID")
    private int flightID;

    @Column(name = "flightNumber")
    @NotNull(message = "Flight Number is a required field.")
    @Size(message = "Maximum 10 character", max = 10)
    @NotEmpty
    private String flightNumber;

    @Column(name = "flightCapacity")
    private int flightCapacity;

    @Column(name = "flightType")
    @NotNull(message = "Flight Type is a required field.")
    @Size(message = "Maximum 15 character", max = 105)
    @NotEmpty
    private String flightType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "airlineID")
    private Airline airlineID;
}
