package com.cydeo.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreatedAccount extends Account{

    BigDecimal creditLimit;
}
