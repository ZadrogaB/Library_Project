package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Rents")
public class Rent {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "BookId", nullable = false)
    private Long bookId;

    @Column(name = "ReaderId", nullable = false)
    private Long readerId;

    @Column(name = "DateOfRent", nullable = false)
    private Date rentDate;

    @Column(name = "DateOfHandBack")
    private Date handBackDate;
}
