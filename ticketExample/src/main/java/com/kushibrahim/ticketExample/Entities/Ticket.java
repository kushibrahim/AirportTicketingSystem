package com.kushibrahim.ticketExample.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int ticketID;

    @Column(name = "ticketNumber")
    @NotNull(message = "Ticket Number is a required field.")
    @NotEmpty
    private String ticketNumber;

    @Column(name = "ticketSold")
    private int ticketSold;

    @Column(name = "ticketPrice")
    private double ticketPrice;

    @Column(name = "passengerName")
    @NotNull(message = "Passenger Name is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    private String passengerName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "flightID")
    private Flight flightID;

}
