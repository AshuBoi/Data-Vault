package com.ashuboi.my_app.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Card {

    @Id
    @NotNull
    @Size(max = 21)
    private String id;

    @NotNull
    @Size(max = 16)
    private String accountNumber;

    @NotNull
    @Size(max = 4)
    private String expiryDate;

    @NotNull
    @Size(max = 3)
    private String cvv;

}
