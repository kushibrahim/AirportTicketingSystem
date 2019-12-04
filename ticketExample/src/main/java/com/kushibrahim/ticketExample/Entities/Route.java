package com.kushibrahim.ticketExample.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "route")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routeID")
    private int routeID;

    @Column(name = "routeFrom")
    @NotNull(message = "RouteFrom is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    private String routeFrom;

    @Column(name = "routeTo")
    @NotNull(message = "RouteTo is a required field.")
    @Size(message = "Maximum 50 character", max = 50)
    @NotEmpty
    private String routeTo;

    @Column(name = "routeType")
    @NotNull(message = "Route Type is a required field.")
    @Size(message = "Maximum 10 character", max = 10)
    @NotEmpty
    private String routeType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "airlineID")
    private Airline airlineID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "flightID")
    private Flight flightID;

}
